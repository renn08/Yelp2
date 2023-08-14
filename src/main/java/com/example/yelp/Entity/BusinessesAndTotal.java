package com.example.yelp.Entity;

import java.util.ArrayList;
import java.util.List;

public class BusinessesAndTotal {
    private int total;
    private List<Business> businesses = new ArrayList<>();

    public BusinessesAndTotal(int total, List<Business> businesses) {
        this.total = total;
        this.businesses = businesses;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }
}
