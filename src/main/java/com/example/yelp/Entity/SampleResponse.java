package com.example.yelp.Entity;

import org.springframework.http.HttpStatusCode;

public class SampleResponse {
    protected HttpStatusCode statusCode;

    public SampleResponse() {}
    public SampleResponse(YelpSearchResponse yelpSearchResponse) {
        this.statusCode = yelpSearchResponse.getStatusCode();
    }

    public HttpStatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
    }
}
