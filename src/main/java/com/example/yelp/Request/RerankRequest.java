package com.example.yelp.Request;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RerankRequest extends SampleRequest {
    Logger logger = LoggerFactory.getLogger(RerankRequest.class);
    private final String location; // required
    private final String term; // required

    private RerankRequest(Builder builder) {
        super();
        this.location = builder.location;
        this.term = builder.term;
    }

    @Override
    protected String generateUrl() {
        return String.format("https://api.yelp.com/v3/businesses/search?location=%s&term=%s", encode(this.location), encode(this.term));
    }

    @Override
    public HttpUriRequest generateRequest() {
        return RequestBuilder.get()
                .setUri(generateUrl())
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer " + API_KEY)
                .build();
    }

    public String getLocation() {
        return location;
    }

    public String getTerm() {
        return term;
    }

    public static class Builder extends SampleRequest.Builder {
        private final String location;
        private final String term;

        public Builder(String location, String term) {
            this.location = location;
            this.term = term;
        }

        @Override
        public RerankRequest build() {
            RerankRequest rerankRequest = new RerankRequest(this);
            return rerankRequest;
        }
    }
}



/**use
 * curl -X GET -d "{\"location\":\"sample_location\",\"term\":\"sample_term\"}"  localhost:8080/
 * */
