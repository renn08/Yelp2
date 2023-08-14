package com.example.yelp.Entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(alias, category.alias) &&
                Objects.equals(title, category.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, title);
    }
}
