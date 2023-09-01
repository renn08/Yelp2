package com.example.yelp.Utility;

import com.example.yelp.Response.YelpSearchResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public final class YelpResponseUtil {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static YelpSearchResponse getYelpResponse(HttpUriRequest httpRequest) {

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(httpRequest)) {

            String result = EntityUtils.toString(response.getEntity());
            return OBJECT_MAPPER.readValue(result, YelpSearchResponse.class);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
