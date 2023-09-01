package com.example.yelp.Entity;

import java.util.ArrayList;
import java.util.List;

public class BusinessesAndTotal {
    private final int total;
    private final List<Business> businesses;

    private BusinessesAndTotal(int total, List<Business> businesses) {
        this.total = total;
        this.businesses = businesses;
    }

    public int getTotal() {
        return total;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int total;
        private List<Business> businesses;

        public Builder() {}

        public Builder total(int total) {
            this.total = total;
            return this;
        }

        public Builder businesses(List<Business> businesses) {
            this.businesses = businesses;
            return this;
        }

        public BusinessesAndTotal build() {
            return new BusinessesAndTotal(total, businesses);
        }
    }
}
