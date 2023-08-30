package com.example.yelp.Controller;

import com.example.yelp.Request.RerankFilterLocationCategoryRequest;
import com.example.yelp.Request.RerankRequest;
import com.example.yelp.Response.GroupByCategoryResponse;
import com.example.yelp.Response.RerankFilterLocationCategoryResponse;
import com.example.yelp.Response.RerankResponse;
import com.example.yelp.Response.YelpSearchResponse;
import org.apache.http.client.methods.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.http.HttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

@RestController // (annotate in class to mark the controller class) - check source code in IntelliJ by holding “command” + click the function
public class YelpController {
    Logger logger = LoggerFactory.getLogger(YelpController.class);

    @GetMapping("/") //define API name
    public String index() {
        logger.info("visit index page");
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/searchRerank")
    public ResponseEntity<RerankResponse> rerank(@RequestParam String location,
                                                 @RequestParam String term) {
        RerankRequest request = new RerankRequest.Builder(location, term).build();

        YelpSearchResponse yelpSearchResponse = getYelpResponse(request.generateRequest());

        RerankResponse serviceResponse = new RerankResponse(yelpSearchResponse, request);

        serviceResponse.reRank();

        // SampleResponse still has status code from Yelp API but for our service, default use .ok()
        return ResponseEntity.ok().body(serviceResponse);
    }

    @GetMapping("/searchGroupByCategory")
    public ResponseEntity<GroupByCategoryResponse> GroupByCategory(@RequestParam String location,
                                                                   @RequestParam String term) {
        RerankRequest request = new RerankRequest.Builder(location, term).build();

        YelpSearchResponse yelpSearchResponse = getYelpResponse(request.generateRequest());

        GroupByCategoryResponse serviceResponse = new GroupByCategoryResponse(yelpSearchResponse, request);

        serviceResponse.groupByCategoryAndAddTotal();
        serviceResponse.sortByTotal();

        return ResponseEntity.ok().body(serviceResponse);
    }

    @GetMapping("/searchRerankFilterLocationCategory")
    public ResponseEntity<RerankFilterLocationCategoryResponse> rerankFilterLocationCategory(@RequestParam String location,
                                                                                             @RequestParam String categories) {
        RerankFilterLocationCategoryRequest request = new RerankFilterLocationCategoryRequest.Builder(location, categories).build();

        YelpSearchResponse yelpSearchResponse = getYelpResponse(request.generateRequest());

        RerankFilterLocationCategoryResponse serviceResponse = new RerankFilterLocationCategoryResponse(yelpSearchResponse, request);

        serviceResponse.reRank();

        return ResponseEntity.ok().body(serviceResponse);
    }

    private YelpSearchResponse getYelpResponse(HttpUriRequest httpRequest) {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        YelpSearchResponse yelpSearchResponse = new YelpSearchResponse();

        try (CloseableHttpResponse response = httpClient.execute(httpRequest)) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                yelpSearchResponse = new YelpSearchResponse(result);
            }
            // now still has status code in the raw response body, but will not be used as our service response status
            // code, default use .ok(). builder pattern
            yelpSearchResponse.setStatusCode(HttpStatusCode.valueOf(response.getStatusLine().getStatusCode()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return yelpSearchResponse;
    }
}

