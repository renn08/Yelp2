package com.example.yelp.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GroupByCategoryRequest extends SearchRerankRequest {
    Logger logger = LoggerFactory.getLogger(GroupByCategoryRequest.class);

    public GroupByCategoryRequest(String location, String term) {
        super(location, term);
    }
}
