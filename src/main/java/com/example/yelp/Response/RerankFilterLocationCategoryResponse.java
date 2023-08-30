package com.example.yelp.Response;

import com.example.yelp.Request.RerankFilterLocationCategoryRequest;

public class RerankFilterLocationCategoryResponse extends RerankResponse {
    private String searchCategory;

    public RerankFilterLocationCategoryResponse(YelpSearchResponse yelpSearchResponse, RerankFilterLocationCategoryRequest request) {
        super(yelpSearchResponse, request);
        this.searchCategory = request.getCategoryEncoded();
    }

    public String getSearchCategory() {
        return searchCategory;
    }

    public void setSearchCategory(String searchCategory) {
        this.searchCategory = searchCategory;
    }
}
