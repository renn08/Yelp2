package com.example.yelp.Response;

public class Level1 extends Level0 {
    private final String name;

    Level1(String id, String name) {
        super(id);

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Level0.Builder<Builder> {
        private String name;

        Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public Level1 build() {
            return new Level1(id, name);
        }
    }
}
