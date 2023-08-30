package com.example.yelp.Response;

import com.example.yelp.Entity.Business;
import com.example.yelp.Entity.Region;
import com.example.yelp.Request.RerankRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.yelp.Utility.RerankUtil.reRankByRatingCount;

public class RerankResponse extends SampleResponse {
    Logger logger = LoggerFactory.getLogger(RerankResponse.class);

    private int total;
    private Region region;
    private String searchLocation;
    private String searchTerm;
    private List<Business> businesses;

    public RerankResponse(YelpSearchResponse yelpSearchResponse, RerankRequest request) {
        super(yelpSearchResponse);
        this.businesses = new ArrayList<>(yelpSearchResponse.getBusinesses());
        this.region = yelpSearchResponse.getRegion();
        this.total = yelpSearchResponse.getTotal();
        this.searchLocation = request.encode(request.getLocation());
        this.searchTerm = request.encode(request.getTerm());
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getSearchLocation() {
        return searchLocation;
    }

    public void setSearchLocation(String searchLocation) {
        this.searchLocation = searchLocation;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }

    /**re-rank the business by new ranking = rating * review_count, in desc order*/
    public void reRank() {
        reRankByRatingCount(this.businesses);
    }
}
