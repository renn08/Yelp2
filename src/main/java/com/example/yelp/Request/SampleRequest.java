package com.example.yelp.Request;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLEncoder;
import java.util.Objects;

public class SampleRequest {
    protected static final String API_KEY = "e-IlGlkWFigEJsWMpi_BkXU88_ha9bbuoxT3Bqv_MN2kDDotNtv2mcpBYccl9DzyL1xBh65LpF9yHzLGi4eWbt48N7TTq2q0prZqkZXio7Ctn5dQ_vUHWSAzfOPYZHYx";

    protected SampleRequest() {}

    public String encode(String input) {
        if (Objects.equals(input, "") || input == null) return input;
        String inputEncoded = "";
        try {
            inputEncoded = URLEncoder.encode(input, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputEncoded;
    }

    protected String generateUrl() {
        return "";
    }

    public HttpUriRequest generateGetRequest() {
        return RequestBuilder.get()
                .setUri(generateUrl())
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer " + API_KEY)
                .build();
    }

    public static class Builder {
        public Builder() {}

        public SampleRequest build() {
            return new SampleRequest();
        }
    }
}
