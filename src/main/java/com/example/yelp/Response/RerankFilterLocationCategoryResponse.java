package com.example.yelp.Response;

import com.example.yelp.Entity.Business;
import com.example.yelp.Entity.Region;
import com.example.yelp.Request.RerankFilterLocationCategoryRequest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.yelp.Utility.RerankUtil.reRankByRatingCount;

public class RerankFilterLocationCategoryResponse extends SampleResponse {
    private String searchCategory;
    private int total;
    private Region region;
    private String searchLocation;
    private List<Business> businesses;

    public RerankFilterLocationCategoryResponse(YelpSearchResponse yelpSearchResponse, RerankFilterLocationCategoryRequest request) {
        super(yelpSearchResponse);
        this.businesses = new ArrayList<>(yelpSearchResponse.getBusinesses());
        this.region = yelpSearchResponse.getRegion();
        this.total = yelpSearchResponse.getTotal();
        this.searchLocation = request.encode(request.getLocation());
        this.searchCategory = request.encode(request.getCategory());
    }

    public String getSearchCategory() {
        return searchCategory;
    }

    public void setSearchCategory(String searchCategory) {
        this.searchCategory = searchCategory;
    }

    public void reRank() {
        reRankByRatingCount(this.businesses);
    }
}
