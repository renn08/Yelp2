package com.example.yelp.Entity;

public class CategoryAndBusiness {
    private final Category category;
    private final Business business;

    private CategoryAndBusiness(Category category, Business business) {
        this.category = category;
        this.business = business;
    }

    public Category getCategory() {
        return category;
    }

    public Business getBusiness() {
        return business;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Category category;
        private Business business;

        public Builder() {}

        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        public Builder business(Business business) {
            this.business = business;
            return this;
        }

        public CategoryAndBusiness build() {
            return new CategoryAndBusiness(category, business);
        }
    }
}
