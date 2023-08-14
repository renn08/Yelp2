package com.example.yelp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Center {
    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("longitude")
    private double longitude;

    public Center() {}

    public Center(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
