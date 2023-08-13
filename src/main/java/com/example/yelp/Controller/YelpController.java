package com.example.yelp.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.objenesis.ObjenesisException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.net.URLEncoder;

@RestController // (annotate in class to mark the controller class) - check source code in IntelliJ by holding “command” + click the function
public class YelpController {

    public static String API_KEY = "e-IlGlkWFigEJsWMpi_BkXU88_ha9bbuoxT3Bqv_MN2kDDotNtv2mcpBYccl9DzyL1xBh65LpF9yHzLGi4eWbt48N7TTq2q0prZqkZXio7Ctn5dQ_vUHWSAzfOPYZHYx";

    @GetMapping("/") //define API name
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/search")
    public ResponseEntity<YelpSearchResponse> rerankSearchResult(@RequestParam String location,
                                                                 @RequestParam(required = false) String term) {
        String locationEncoded = "";
        String termEncoded = "";
        try {
            locationEncoded = URLEncoder.encode(location, "UTF-8");
            System.out.println("loationEncoded: " + locationEncoded);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            termEncoded = URLEncoder.encode(term, "UTF-8");
            System.out.println("termEncoded: " + termEncoded);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String url = "https://api.yelp.com/v3/businesses/search?" + "location=" + locationEncoded + "&" + "term=" + termEncoded;


        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);

        // Set headers
        httpGet.setHeader("Authorization", "Bearer e-IlGlkWFigEJsWMpi_BkXU88_ha9bbuoxT3Bqv_MN2kDDotNtv2mcpBYccl9DzyL1xBh65LpF9yHzLGi4eWbt48N7TTq2q0prZqkZXio7Ctn5dQ_vUHWSAzfOPYZHYx");
        httpGet.setHeader("accept", "application/json");

        YelpSearchResponse yelpSearchResponse;

        try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                System.out.println(result);
                yelpSearchResponse = new YelpSearchResponse(result);
            }
            else {
                yelpSearchResponse = new YelpSearchResponse();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<YelpSearchResponse>(HttpStatus.OK);
    }

}

