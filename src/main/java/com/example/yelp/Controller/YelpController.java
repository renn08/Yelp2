package com.example.yelp.Controller;

import com.example.yelp.Entity.*;

import org.apache.http.client.methods.*;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<SearchRerankServiceResponse> rerankSearchResult(@RequestParam String location,
                                                                          @RequestParam(required = false) String term
    ) {
        SearchRerankRequest request = new SearchRerankRequest(location, term);
        HttpUriRequest httpRequest = request.generateRequest();

        YelpSearchResponse yelpSearchResponse = getYelpResponse(httpRequest);

        SearchRerankServiceResponse serviceResponse = new SearchRerankServiceResponse(yelpSearchResponse, request);
        serviceResponse.reRank();

        return new ResponseEntity<>(serviceResponse, yelpSearchResponse.getStatusCode());
    }

    @GetMapping("/searchGroupByCategory")
    public ResponseEntity<SearchGroupByCategoryServiceResponse> SearchGroupByCategoryResult(@RequestParam String location,
                                                                          @RequestParam(required = false) String term
    ) {
        SearchGroupByCategoryRequest request = new SearchGroupByCategoryRequest(location, term);
        HttpUriRequest httpRequest = request.generateRequest();

        YelpSearchResponse yelpSearchResponse = getYelpResponse(httpRequest);

        SearchGroupByCategoryServiceResponse serviceResponse = new SearchGroupByCategoryServiceResponse(yelpSearchResponse, request);

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

