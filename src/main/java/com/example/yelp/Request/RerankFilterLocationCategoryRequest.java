package com.example.yelp.Request;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;

public class RerankFilterLocationCategoryRequest extends SampleRequest {
    private final String category;

    private final String location;

    private RerankFilterLocationCategoryRequest(Builder builder) {
        super();
        this.location = builder.location;
        this.category = builder.category;
    }

    @Override
    protected String generateUrl() {
        return String.format("https://api.yelp.com/v3/businesses/search?location=%s&categories=%s", encode(this.location), encode(this.category));
    }

    @Override
    public HttpUriRequest generateRequest() {
        return RequestBuilder.get()
                .setUri(generateUrl())
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer " + API_KEY)
                .build();
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public static class Builder extends SampleRequest.Builder {
        private final String location;
        private final String category;

        public Builder(String location, String category) {
            this.location = location;
            this.category = category;
        }

        @Override
        public RerankFilterLocationCategoryRequest build() {
            RerankFilterLocationCategoryRequest rerankFilterLocationCategoryRequest = new RerankFilterLocationCategoryRequest(this);
            return rerankFilterLocationCategoryRequest;
        }
    }
}
