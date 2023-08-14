package com.example.yelp.Entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;

public class YelpSearchResponse {
    Logger logger = LoggerFactory.getLogger(YelpSearchResponse.class);

    @JsonProperty("status_code")
    HttpStatusCode statusCode = HttpStatusCode.valueOf(500);
    @JsonProperty("total")
    private int total;

    @JsonProperty("region")
    private Region region;

    @JsonProperty("businesses")
    private List<Business> businesses = new ArrayList<>();

    public YelpSearchResponse() {}
    public YelpSearchResponse(String searchResult) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        YelpSearchResponse response = objectMapper.readValue(searchResult, YelpSearchResponse.class);
        this.businesses = response.businesses;
        this.region = response.region;
        this.total = response.total;
        logger.info("Business List: " + businesses);
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

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }
}
