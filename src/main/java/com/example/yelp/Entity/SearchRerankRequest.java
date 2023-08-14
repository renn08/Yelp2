package com.example.yelp.Entity;

import java.net.URLEncoder;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLEncoder;

public class SearchRerankRequest {
    private static final String API_KEY = "e-IlGlkWFigEJsWMpi_BkXU88_ha9bbuoxT3Bqv_MN2kDDotNtv2mcpBYccl9DzyL1xBh65LpF9yHzLGi4eWbt48N7TTq2q0prZqkZXio7Ctn5dQ_vUHWSAzfOPYZHYx";
    Logger logger = LoggerFactory.getLogger(SearchRerankRequest.class);
    private String location;
    private String term;
    private String locationEncoded;
    private String termEncoded;

    public SearchRerankRequest(String location, String term) {
        this.location = location;
        this.term = term;
        encode();
    }

    private void encode() {
        try {
            locationEncoded = URLEncoder.encode(location, "UTF-8");
            logger.info("loationEncoded: " + locationEncoded);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            termEncoded = URLEncoder.encode(term, "UTF-8");
            logger.info("termEncoded: " + termEncoded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String generateUrl() {
        return String.format("https://api.yelp.com/v3/businesses/search?location=%s&term=%s", locationEncoded, termEncoded);
    }

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
