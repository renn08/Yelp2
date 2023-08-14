package com.example.yelp.Entity;

import java.net.URLEncoder;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLEncoder;

public class SearchRerankRequest extends SampleRequest {
    Logger logger = LoggerFactory.getLogger(SearchRerankRequest.class);
    private String location;
    private String term;
    private String locationEncoded;
    private String termEncoded;

    public SearchRerankRequest(String location, String term) {
        this.location = location;
        this.term = term;
        this.locationEncoded = encode(location);
        this.termEncoded = encode(term);
    }

    @Override
    protected String generateUrl() {
        return String.format("https://api.yelp.com/v3/businesses/search?location=%s&term=%s", locationEncoded, termEncoded);
    }

    @Override
    public HttpUriRequest generateRequest() {
        return RequestBuilder.get()
                .setUri(generateUrl())
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer " + API_KEY)
                .build();
    }

    public String getLocationEncoded() {
        return locationEncoded;
    }

    public void setLocationEncoded(String locationEncoded) {
        this.locationEncoded = locationEncoded;
    }

    public String getTermEncoded() {
        return termEncoded;
    }

    public void setTermEncoded(String termEncoded) {
        this.termEncoded = termEncoded;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}



/**use
 * curl -X GET -d "{\"location\":\"sample_location\",\"term\":\"sample_term\"}"  localhost:8080/
 * */
