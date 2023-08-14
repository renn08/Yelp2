package com.example.yelp.Entity;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLEncoder;

public class SampleRequest {
    protected static final String API_KEY = "e-IlGlkWFigEJsWMpi_BkXU88_ha9bbuoxT3Bqv_MN2kDDotNtv2mcpBYccl9DzyL1xBh65LpF9yHzLGi4eWbt48N7TTq2q0prZqkZXio7Ctn5dQ_vUHWSAzfOPYZHYx";

    protected String encode(String input) {
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

    public HttpUriRequest generateRequest() {
        return null;
    }
}
