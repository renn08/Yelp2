package com.example.yelp.Controller;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class YelpSearchResponse {
    public static class Coordinates {
        public double latitude;
        public double longitude;
    }

    public static class Location {
        public String address1;
        public String address2;
        public String address3;
        public String city;
        public String zip_code;
        public String country;
        public String state;
        public List<String> display_address;
    }

    public static class Category {
        public String alias;
        public String title;
    }

    public static class Business {
        public String id;
        public String alias;
        public String name;
        public String image_url;
        public boolean is_closed;
        public String url;
        public int review_count;
        public List<Category> categories;
        public double rating;
        public Coordinates coordinates;
        public List<String> transactions;
        public String price;
        public Location location;
        public String phone;
        public String display_phone;
        public double distance;
    }

    public static class Center {
        public double latitude;
        public double longitude;
    }

    public static class Region {
        public Center center;
    }

    @JsonProperty("total")
    public int total;

    @JsonProperty("region")
    public Region region;


    @JsonProperty("businesses")
    public List<Business> businesses = new ArrayList<>();

    public YelpSearchResponse() {}
    public YelpSearchResponse(String searchResult) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        YelpSearchResponse response = objectMapper.readValue(searchResult, YelpSearchResponse.class);
        this.businesses = response.businesses;
        this.region = response.region;
        this.total = response.total;
        System.out.println("Business List: " + businesses);
    }
}
