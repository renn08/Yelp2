package com.example.yelp.Entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = Category.Builder.class)
public class Category {
    @JsonProperty("alias")
    private final String alias;
    @JsonProperty("title")
    private final String title;

    private Category(String alias, String title) {
        this.alias = alias;
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public String getTitle() {
        return title;
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @JsonProperty("alias")
        private String alias;
        @JsonProperty("title")
        private String title;

        public Builder() {}

        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Category build() {
            return new Category(alias, title);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(alias, category.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }
}
