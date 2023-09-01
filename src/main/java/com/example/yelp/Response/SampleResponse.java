package com.example.yelp.Response;

public class SampleResponse {
    protected SampleResponse() {}

    public static Builder builder() {
        return new Builder();
    }

    // use generic type
    public static class Builder<S extends Builder> {

        public Builder() {}


        public SampleResponse build() {
            return new SampleResponse();
        }
    }
}
