package com.example.yelp.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchRerankServiceResponse {
    Logger logger = LoggerFactory.getLogger(SearchRerankServiceResponse.class);

    protected HttpStatusCode statusCode;
    private int total;
    private Region region;
    protected String searchLocation;
    protected String searchTerm;
    protected List<Business> businesses = new ArrayList<>();

    public SearchRerankServiceResponse() {}
    public SearchRerankServiceResponse(YelpSearchResponse yelpSearchResponse, SearchRerankRequest request) {
        this.businesses = yelpSearchResponse.getBusinesses();
        this.region = yelpSearchResponse.getRegion();
        this.total = yelpSearchResponse.getTotal();
        this.searchLocation = request.getLocation();
        this.searchTerm = request.getTerm();
        this.statusCode = yelpSearchResponse.getStatusCode();
    }

    public HttpStatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
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
        Collections.sort(this.businesses, (o1, o2) -> {
            double newRank1 = o1.getRating() * o1.getReviewCount();
            double newRank2 = o2.getRating() * o2.getReviewCount();
            if (newRank2 > newRank1) return 1;
            else if (newRank2 == newRank1) return 0;
            else return -1;
        });
    }
}
