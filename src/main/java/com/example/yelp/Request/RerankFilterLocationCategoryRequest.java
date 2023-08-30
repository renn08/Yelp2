package com.example.yelp.Request;

public class RerankFilterLocationCategoryRequest extends RerankRequest {
    private String category;
    private String categoryEncoded;

    public RerankFilterLocationCategoryRequest(String location, String category) {
        super(location, "");
        this.category = category;
        this.categoryEncoded = encode(category);
    }

    @Override
    protected String generateUrl() {
        return String.format("https://api.yelp.com/v3/businesses/search?location=%s&categories=%s", this.getLocationEncoded(), this.categoryEncoded);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryEncoded() {
        return categoryEncoded;
    }

    public void setCategoryEncoded(String categoryEncoded) {
        this.categoryEncoded = categoryEncoded;
    }
}
