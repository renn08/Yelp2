package com.example.yelp.Controller;

import com.example.yelp.Entity.*;

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
    public ResponseEntity<SampleResponse> rerank(@RequestParam String location,
                                                 @RequestParam String term) {
        RerankRequest request = new RerankRequest(location, term);

        YelpSearchResponse yelpSearchResponse = getYelpResponse(request.generateRequest());

        RerankResponse serviceResponse = new RerankResponse(yelpSearchResponse, request);
        serviceResponse.reRank();

        return new ResponseEntity<>(serviceResponse, yelpSearchResponse.getStatusCode());
    }

    @GetMapping("/searchGroupByCategory")
    public ResponseEntity<SampleResponse> GroupByCategory(@RequestParam String location,
                                                          @RequestParam String term) {
        GroupByCategoryRequest request = new GroupByCategoryRequest(location, term);

        YelpSearchResponse yelpSearchResponse = getYelpResponse(request.generateRequest());

        GroupByCategoryResponse serviceResponse = new GroupByCategoryResponse(yelpSearchResponse, request);

        return new ResponseEntity<>(serviceResponse, yelpSearchResponse.getStatusCode());
    }

    @GetMapping("/searchRerankFilterLocationCategory")
    public ResponseEntity<SampleResponse> rerankFilterLocationCategory(@RequestParam String location,
                                                                       @RequestParam String categories) {
        RerankFilterLocationCategoryRequest request = new RerankFilterLocationCategoryRequest(location, categories);

        YelpSearchResponse yelpSearchResponse = getYelpResponse(request.generateRequest());

        RerankFilterLocationCategoryResponse serviceResponse = new RerankFilterLocationCategoryResponse(yelpSearchResponse, request);
        serviceResponse.reRank();

        return new ResponseEntity<>(serviceResponse, yelpSearchResponse.getStatusCode());
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
            yelpSearchResponse.setStatusCode(HttpStatusCode.valueOf(response.getStatusLine().getStatusCode()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return yelpSearchResponse;
    }
}

