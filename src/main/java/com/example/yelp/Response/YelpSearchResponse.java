package com.example.yelp.Response;

import java.util.ArrayList;
import java.util.List;

import com.example.yelp.Entity.Business;
import com.example.yelp.Entity.Region;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@JsonDeserialize(builder = YelpSearchResponse.Builder.class)
public class YelpSearchResponse {
    Logger logger = LoggerFactory.getLogger(YelpSearchResponse.class);

    @JsonProperty("total")
    private final int total;

    @JsonProperty("region")
    private final Region region;

    @JsonProperty("businesses")
    private final List<Business> businesses;

    private YelpSearchResponse(List<Business> businesses, Region region, int total) {
        this.businesses = businesses;
        this.region = region;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public Region getRegion() {
        return region;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @JsonProperty("total")
        private int total;

        @JsonProperty("region")
        private Region region;

        @JsonProperty("businesses")
        private List<Business> businesses;

        public Builder() {}

        public Builder total(int total) {
            this.total = total;
            return this;
        }

        public Builder region(Region region) {
            this.region = region;
            return this;
        }

        public Builder businesses(List<Business> businesses) {
            this.businesses = businesses;
            return this;
        }

        public YelpSearchResponse build() {
            return new YelpSearchResponse(businesses, region, total);
        }

    }
}
