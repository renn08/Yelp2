package com.example.yelp.Response;

import com.example.yelp.Entity.Business;
import com.example.yelp.Entity.Region;

import java.util.List;

import static com.example.yelp.Utility.RerankUtil.reRankByRatingCount;

public class RerankFilterLocationCategoryResponse extends SampleResponse {
    private final String searchCategory; // required
    private final int total; // required
    private final Region region; // required
    private final String searchLocation; // required
    private final List<Business> businesses; // required

    public RerankFilterLocationCategoryResponse(List<Business> businesses, Region region, int total, String searchLocation, String searchCategory) {
        super();
        this.businesses = businesses;
        this.region = region;
        this.total = total;
        this.searchLocation = searchLocation;
        this.searchCategory = searchCategory;
    }

    public String getSearchCategory() {
        return searchCategory;
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

    public List<Business> getBusinesses() {
        return businesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void reRank() {
        reRankByRatingCount(this.businesses);
    }

    public static class Builder extends SampleResponse.Builder<Builder> {
        private String searchCategory;

        private String searchLocation;

        private List<Business> businesses;

        private int total;

        private Region region;

        public Builder() {}

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

        public Builder setSearchCategory(String searchCategory) {
            this.searchCategory = searchCategory;
            return this;
        }

        public Builder setBusinesses(List<Business> businesses) {
            this.businesses = businesses;
            return this;
        }

        @Override
        public RerankFilterLocationCategoryResponse build() {
            return new RerankFilterLocationCategoryResponse(businesses, region, total, searchLocation, searchCategory);
        }
    }
}
