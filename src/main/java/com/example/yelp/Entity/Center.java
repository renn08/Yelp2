package com.example.yelp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = Center.Builder.class)
public class Center {
    @JsonProperty("latitude")
    private final double latitude;
    @JsonProperty("longitude")
    private final double longitude;

    private Center(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @JsonProperty("latitude")
        private double latitude;
        @JsonProperty("longitude")
        private double longitude;

        public Builder() {}

        public Builder latitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder longitude(double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Center build() {
            return new Center(latitude, longitude);
        }
    }
}
