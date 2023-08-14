package com.example.yelp.Entity;

import java.util.HashMap;
import java.util.Map;

public class BusinessGroupByCategory {
    private Map<Category, BusinessesAndTotal> map = new HashMap<>();

    public BusinessGroupByCategory(Map<Category, BusinessesAndTotal> map) {
        this.map = map;
    }

    public Map<Category, BusinessesAndTotal> getMap() {
        return map;
    }

    public void setMap(Map<Category, BusinessesAndTotal> map) {
        this.map = map;
    }
}
