package com.example.yelp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("title")
    private String title;

    public Category() {}

    public Category(String alias, String title) {
        this.alias = alias;
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public String getTitle() {
        return title;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
