package com.example.yelp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.List;

@JsonDeserialize(builder = Business.Builder.class)
public class Business {
    @JsonProperty("id")
    private final String id;
    @JsonProperty("alias")
    private final String alias;
    @JsonProperty("name")
    private final String name;
    @JsonProperty("image_url")
    private final String imageUrl;
    @JsonProperty("is_closed")
    private final boolean isClosed;
    @JsonProperty("url")
    private final String url;
    @JsonProperty("review_count")
    private final int reviewCount;
    @JsonProperty("categories")
    private final List<Category> categories;
    @JsonProperty("rating")
    private final double rating;
    @JsonProperty("coordinates")
    private final Coordinates coordinates;
    @JsonProperty("transactions")
    private final List<String> transactions;
    @JsonProperty("price")
    private final String price;
    @JsonProperty("location")
    private final Location location;
    @JsonProperty("phone")
    private final String phone;
    @JsonProperty("display_phone")
    private final String displayPhone;
    @JsonProperty("distance")
    private final double distance;

    private Business(String id, String alias, String name, String imageUrl, boolean isClosed, String url, int reviewCount, List<Category> categories, double rating, Coordinates coordinates, List<String> transactions, String price, Location location, String phone, String displayPhone, double distance) {
        this.id = id;
        this.alias = alias;
        this.name = name;
        this.imageUrl = imageUrl;
        this.isClosed = isClosed;
        this.url = url;
        this.reviewCount = reviewCount;
        this.categories = categories;
        this.rating = rating;
        this.coordinates = coordinates;
        this.transactions = transactions;
        this.price = price;
        this.location = location;
        this.phone = phone;
        this.displayPhone = displayPhone;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public String getUrl() {
        return url;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public double getRating() {
        return rating;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public String getPrice() {
        return price;
    }

    public Location getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getDisplayPhone() {
        return displayPhone;
    }

    public double getDistance() {
        return distance;
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @JsonProperty("id")
        private String id;
        @JsonProperty("alias")
        private String alias;
        @JsonProperty("name")
        private String name;
        @JsonProperty("image_url")
        private String imageUrl;
        @JsonProperty("is_closed")
        private boolean isClosed;
        @JsonProperty("url")
        private String url;
        @JsonProperty("review_count")
        private int reviewCount;
        @JsonProperty("categories")
        private List<Category> categories;
        @JsonProperty("rating")
        private double rating;
        @JsonProperty("coordinates")
        private Coordinates coordinates;
        @JsonProperty("transactions")
        private List<String> transactions;
        @JsonProperty("price")
        private String price;
        @JsonProperty("location")
        private Location location;
        @JsonProperty("phone")
        private String phone;
        @JsonProperty("display_phone")
        private String displayPhone;
        @JsonProperty("distance")
        private double distance;

        public Builder() {}

        public Builder distance(double distance) {
            this.distance = distance;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder displayPhone(String displayPhone) {
            this.displayPhone = displayPhone;
            return this;
        }

        public Builder transactions(List<String> transactions) {
            this.transactions = transactions;
            return this;
        }

        public Builder coordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        public Builder rating(double rating) {
            this.rating = rating;
            return this;
        }

        public Builder categories(List<Category> categories) {
            this.categories = categories;
            return this;
        }

        public Builder reviewCount(int reviewCount) {
            this.reviewCount = reviewCount;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder closed(boolean closed) {
            isClosed = closed;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Business build() {
            return new Business(id, alias, name, imageUrl, isClosed, url, reviewCount, categories, rating, coordinates, transactions, price, location, phone, displayPhone, distance);
        }
    }
}
