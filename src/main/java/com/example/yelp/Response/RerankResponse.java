package com.example.yelp.Response;

import com.example.yelp.Entity.Business;
import com.example.yelp.Entity.Region;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public class RerankResponse extends SampleResponse {
    Logger logger = LoggerFactory.getLogger(RerankResponse.class);

    private final int total;
    private final Region region;
    private final String searchLocation;
    private final String searchTerm;
    private final List<Business> businesses;

    public RerankResponse(HttpStatusCode statusCode, List<Business> businesses, Region region, int total, String searchLocation, String searchTerm) {
        super(statusCode);
        this.businesses = businesses;
        this.region = region;
        this.total = total;
        this.searchLocation = searchLocation;
        this.searchTerm = searchTerm;
    }

    public int getTotal() {
        return total;
    }

    public Region getRegion() {
        return region;
    }

    public String getSearchLocation() {
        return searchLocation;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends SampleResponse.Builder<Builder> { // Builder here means RerankResponse.Builder indicate S here
        private int total;
        private Region region;
        private String searchLocation;
        private String searchTerm;

        private List<Business> businesses;

        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        public Builder setRegion(Region region) {
            this.region = region;
            return this;
        }

        public Builder setSearchLocation(String searchLocation) {
            this.searchLocation = searchLocation;
            return this;
        }

        public Builder setSearchTerm(String searchTerm) {
            this.searchTerm = searchTerm;
            return this;
        }

        public Builder setBusinesses(List<Business> businesses) {
            this.businesses = businesses;
            return this;
        }

        @Override
        public RerankResponse build() {
            return new RerankResponse(statusCode, businesses, region, total, searchLocation, searchTerm);
        }
    }
}
