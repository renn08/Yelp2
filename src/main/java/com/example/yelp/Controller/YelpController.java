package com.example.yelp.Controller;

import com.example.yelp.Entity.Business;
import com.example.yelp.Entity.BusinessesAndTotal;
import com.example.yelp.Request.LocationCategoryRequest;
import com.example.yelp.Request.LocationTermRequest;
import com.example.yelp.Response.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.http.HttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.example.yelp.Utility.BusinessCategoryUtil.groupByCategoryAndAddTotal;
import static com.example.yelp.Utility.RerankUtil.reRankByRatingCount;
import static com.example.yelp.Utility.YelpResponseUtil.OBJECT_MAPPER;
import static com.example.yelp.Utility.YelpResponseUtil.getYelpResponse;

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
        LocationTermRequest request = LocationTermRequest.builder()
                .setTerm(term)
                .setLocation(location)
                .build();

        YelpSearchResponse yelpResponse = getYelpResponse(request.generateGetRequest());

        List<Business> reRankBusinesses = new ArrayList<>(yelpResponse.getBusinesses());

        reRankByRatingCount(reRankBusinesses);

        RerankResponse serviceResponse = RerankResponse.builder()
                .setRegion(yelpResponse.getRegion())
                .setTotal(yelpResponse.getTotal())
                .setSearchLocation(request.encode(request.getLocation()))
                .setSearchTerm(request.encode(request.getTerm()))
                .setBusinesses(reRankBusinesses)
                .build();

        // SampleResponse still has status code from Yelp API but for our service, default use .ok()
        return ResponseEntity.ok().body(serviceResponse);
    }

    @GetMapping("/searchGroupByCategory")
    public ResponseEntity<GroupByCategoryResponse> GroupByCategory(@RequestParam String location,
                                                                   @RequestParam String term) {
        LocationTermRequest request = LocationTermRequest.builder()
                .setTerm(term)
                .setLocation(location)
                .build();

        YelpSearchResponse yelpResponse = getYelpResponse(request.generateGetRequest());

        List<Business> businesses = yelpResponse.getBusinesses();

        List<Map<String, BusinessesAndTotal>> bizAndTotalGroupByCat = groupByCategoryAndAddTotal(businesses);

        GroupByCategoryResponse serviceResponse = GroupByCategoryResponse.builder()
                .setSearchLocation(request.encode(request.getLocation()))
                .setSearchTerm(request.encode(request.getTerm()))
                .setBizAndTotalGroupByCat(bizAndTotalGroupByCat)
                .build();

        return ResponseEntity.ok().body(serviceResponse);
    }

    @GetMapping("/searchRerankFilterLocationCategory")
    public ResponseEntity<RerankFilterLocationCategoryResponse> rerankFilterLocationCategory(@RequestParam String location,
                                                                                             @RequestParam String categories) {
        LocationCategoryRequest request = LocationCategoryRequest.builder()
                .setCategory(categories)
                .setLocation(location)
                .build();

        YelpSearchResponse yelpResponse = getYelpResponse(request.generateGetRequest());

        List<Business> filteredBusinesses = yelpResponse.getBusinesses();

        reRankByRatingCount(filteredBusinesses);

        RerankFilterLocationCategoryResponse serviceResponse = RerankFilterLocationCategoryResponse.builder()
                .setSearchCategory(request.encode(request.getCategory()))
                .setSearchLocation(request.encode(request.getLocation()))
                .setRegion(yelpResponse.getRegion())
                .setTotal(yelpResponse.getTotal())
                .setBusinesses(filteredBusinesses)
                .build();

        return ResponseEntity.ok().body(serviceResponse);
    }
}

