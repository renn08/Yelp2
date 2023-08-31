package com.example.yelp.Request;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;

public class LocationCategoryRequest extends SampleRequest {
    private final String category;

    private final String location;

    protected LocationCategoryRequest(String location, String category) {
        super();
        this.location = location;
        this.category = category;
    }

    @Override
    protected String generateUrl() {
        return String.format("https://api.yelp.com/v3/businesses/search?location=%s&categories=%s", encode(this.location), encode(this.category));
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends SampleRequest.Builder {
        private String location;
        private String category;

        public Builder() {}

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        @Override
        public LocationCategoryRequest build() {
            return new LocationCategoryRequest(location, category);
        }
    }
}
