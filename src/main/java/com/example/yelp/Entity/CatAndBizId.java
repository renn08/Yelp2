package com.example.yelp.Entity;

public class CatAndBizId {
    private final Category category;
    private final String businessId;

    private CatAndBizId(Category category, String businessId) {
        this.category = category;
        this.businessId = businessId;
    }

    public Category getCategory() {
        return category;
    }

    public String getBusinessId() {
        return businessId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Category category;
        private String businessId;

        public Builder() {}

        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        public Builder businessId(String businessId) {
            this.businessId = businessId;
            return this;
        }

        public CatAndBizId build() {
            return new CatAndBizId(category, businessId);
        }
    }
}
