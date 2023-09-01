package com.example.yelp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.List;

@JsonDeserialize(builder = Location.Builder.class)
public class Location {
    @JsonProperty("address1")
    private final String address1;
    @JsonProperty("address2")
    private final String address2;
    @JsonProperty("address3")
    private final String address3;
    @JsonProperty("city")
    private final String city;

    @JsonProperty("zip_code")
    private final String zipCode;
    @JsonProperty("country")
    private final String country;
    @JsonProperty("state")
    private final String state;
    @JsonProperty("display_address")
    private final List<String> displayAddress;

    public Location(String address1, String address2, String address3, String city, String zipCode, String country, String state, List<String> displayAddress) {
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.state = state;
        this.displayAddress = displayAddress;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getAddress3() {
        return address3;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public List<String> getDisplayAddress() {
        return displayAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @JsonProperty("address1")
        private String address1;
        @JsonProperty("address2")
        private String address2;
        @JsonProperty("address3")
        private String address3;
        @JsonProperty("city")
        private String city;
        @JsonProperty("zip_code")
        private String zipCode;
        @JsonProperty("country")
        private String country;
        @JsonProperty("state")
        private String state;
        @JsonProperty("display_address")
        private List<String> displayAddress;

        public Builder() {}

        public Builder address1(String address1) {
            this.address1 = address1;
            return this;
        }

        public Builder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        public Builder address3(String address3) {
            this.address3 = address3;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder displayAddress(List<String> displayAddress) {
            this.displayAddress = displayAddress;
            return this;
        }

        public Location build() {
            return new Location(address1, address2, address3, city, zipCode, country, state, displayAddress);
        }
    }
}
