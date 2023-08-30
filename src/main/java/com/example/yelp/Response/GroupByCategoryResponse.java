package com.example.yelp.Response;

import com.example.yelp.Entity.Business;
import com.example.yelp.Entity.BusinessesAndTotal;
import com.example.yelp.Entity.Category;
import com.example.yelp.Entity.CategoryAndBusiness;
import com.example.yelp.Request.RerankRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.example.yelp.Utility.BusinessCategoryUtil.*;

public class GroupByCategoryResponse extends SampleResponse {
    Logger logger = LoggerFactory.getLogger(GroupByCategoryResponse.class);

    private String searchTerm;
    private String searchLocation;

    private List<Business> businesses;

    private List<Map<String, BusinessesAndTotal>> businessesAndTotalGroupByCategoryList;//TODO: just category.alias not the whole class

    public GroupByCategoryResponse(YelpSearchResponse yelpSearchResponse, RerankRequest request) {
        super(yelpSearchResponse);
        this.searchLocation = request.getLocationEncoded();
        this.searchTerm = request.getTermEncoded();
        this.businessesAndTotalGroupByCategoryList = new ArrayList<>();
        this.businesses = new ArrayList<>();
        this.businesses = yelpSearchResponse.getBusinesses();
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getSearchLocation() {
        return searchLocation;
    }

    public void setSearchLocation(String searchLocation) {
        this.searchLocation = searchLocation;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }

    public List<Map<String, BusinessesAndTotal>> getBusinessesAndTotalGroupByCategoryList() {
        return businessesAndTotalGroupByCategoryList;
    }

    public void setBusinessesAndTotalGroupByCategoryList(List<Map<String, BusinessesAndTotal>> businessesAndTotalGroupByCategoryList) {
        this.businessesAndTotalGroupByCategoryList = businessesAndTotalGroupByCategoryList;
    }

    public void groupByCategoryAndAddTotal() {
        // a stream of single category business pairs
        Stream<CategoryAndBusiness> catBizStream = toCatBizStream(this.businesses);

        // group by category
        Map<Category, List<Business>> groupedByCategory = groupByCategory(catBizStream);

        // add total
        this.businessesAndTotalGroupByCategoryList = addTotal(groupedByCategory);
    }

    public void sortByTotal() {
        businessesAndTotalGroupByCategoryList.sort((a, b) -> {
            for (BusinessesAndTotal b1  : a.values()) {
                for (BusinessesAndTotal b2 : b.values()) {
                    return b2.getTotal() - b1.getTotal();
                }
            }
            return 0;
        });
    }
}
