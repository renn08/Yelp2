package com.example.yelp.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class SearchGroupByCategoryServiceResponse extends SearchRerankServiceResponse {
    Logger logger = LoggerFactory.getLogger(SearchGroupByCategoryServiceResponse.class);

    public List<BusinessGroupByCategory> businessGroupByCategoryList = new ArrayList<>();
    public SearchGroupByCategoryServiceResponse(YelpSearchResponse yelpSearchResponse, SearchGroupByCategoryRequest request) {
        super(yelpSearchResponse, request);
    }

}
