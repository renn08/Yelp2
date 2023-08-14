package com.example.yelp.Entity;

public class CategoryAndBusiness {
    private Category category;
    private Business business;

    public CategoryAndBusiness(Category category, Business business) {
        this.category = category;
        this.business = business;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
}
