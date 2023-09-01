package com.example.yelp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = Region.Builder.class)
public class Region {
    @JsonProperty("center")
    private final Center center;

    private Region(Center center) {
        this.center = center;
    }

    public Center getCenter() {
        return center;
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @JsonProperty("center")
        private Center center;

        public Builder() {}

        public Builder center(Center center) {
            this.center = center;
            return this;
        }

        public Region build() {
            return new Region(center);
        }

    }
}
