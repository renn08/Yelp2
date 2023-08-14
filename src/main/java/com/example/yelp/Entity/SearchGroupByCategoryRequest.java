package com.example.yelp.Entity;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLEncoder;

public class SearchGroupByCategoryRequest extends SearchRerankRequest {
    Logger logger = LoggerFactory.getLogger(SearchGroupByCategoryRequest.class);

    public SearchGroupByCategoryRequest(String location, String term) {
        super(location, term);
    }
}
