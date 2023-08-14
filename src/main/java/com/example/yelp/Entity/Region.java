package com.example.yelp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Region {
    @JsonProperty("center")
    private Center center;

    public Region() {}

    public Region(Center center) {
        this.center = center;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }
}
