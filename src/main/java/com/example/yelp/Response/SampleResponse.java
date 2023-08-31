package com.example.yelp.Response;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatusCode;

public class SampleResponse {
    private final HttpStatusCode statusCode;

    protected SampleResponse(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public SampleResponse(YelpSearchResponse yelpSearchResponse) {
        this.statusCode = yelpSearchResponse.getStatusCode();
    }

    public HttpStatusCode getStatusCode() {
        return statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    // use generic type
    public static class Builder<S extends Builder> {
        protected HttpStatusCode statusCode;

        public Builder() {}

        public S setStatusCode(HttpStatusCode statusCode) {
            this.statusCode = statusCode;
            return (S) this;
        }

        public SampleResponse build() {
            return new SampleResponse(statusCode);
        }
    }
}
