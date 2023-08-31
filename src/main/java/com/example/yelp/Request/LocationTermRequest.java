package com.example.yelp.Request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocationTermRequest extends SampleRequest {
    Logger logger = LoggerFactory.getLogger(LocationTermRequest.class);
    private final String location; // required
    private final String term; // required

    protected LocationTermRequest(String location, String term) {
        super();
        this.location = location;
        this.term = term;
    }

    @Override
    protected String generateUrl() {
        return String.format("https://api.yelp.com/v3/businesses/search?location=%s&term=%s", encode(this.location), encode(this.term));
    }

    public String getLocation() {
        return location;
    }

    public String getTerm() {
        return term;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends SampleRequest.Builder {
        private String location;
        private String term;

        public Builder() {}

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setTerm(String term) {
            this.term = term;
            return this;
        }

        @Override
        public LocationTermRequest build() {
            return new LocationTermRequest(location, term);
        }
    }
}



/**use
 * curl -X GET -d "{\"location\":\"sample_location\",\"term\":\"sample_term\"}"  localhost:8080/
 * */
