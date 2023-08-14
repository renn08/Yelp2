package com.example.yelp.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByCategoryResponse extends SampleResponse {
    Logger logger = LoggerFactory.getLogger(GroupByCategoryResponse.class);

    private String searchTerm;
    private String searchLocation;

    public List<Map<Category, BusinessesAndTotal>> businessesAndTotalGroupByCategoryList = new ArrayList<>();

    public GroupByCategoryResponse(YelpSearchResponse yelpSearchResponse, GroupByCategoryRequest request) {
        super(yelpSearchResponse);
        this.searchLocation = request.getLocationEncoded();
        this.searchTerm = request.getTermEncoded();

        List<Business> businesses = new ArrayList<>(yelpSearchResponse.getBusinesses());

        // a stream of single category business pairs
        Stream<CategoryAndBusiness> catBizStream = toCatBizStream(businesses);

        // group by category
        Map<Category, List<Business>> groupedByCategory = groupByCategory(catBizStream);

        // add total
        addTotal(groupedByCategory);

        // sort
        businessesAndTotalGroupByCategoryList.sort((a, b) -> {
            for (BusinessesAndTotal b1  : a.values()) {
                for (BusinessesAndTotal b2 : b.values()) {
                    return b2.getTotal() - b1.getTotal();
                }
            }
            return 0;
        });
    }

    private Stream<CategoryAndBusiness> toCatBizStream(List<Business> businesses) {
        return businesses
                .stream()
                .flatMap(eachBusiness -> eachBusiness.getCategories()
                        .stream()
                        .map(category -> new CategoryAndBusiness(category, eachBusiness)));
    }

    private Map<Category, List<Business>> groupByCategory(Stream<CategoryAndBusiness> catBizStream) {
        return catBizStream
                .collect(Collectors.groupingBy(CategoryAndBusiness::getCategory,
                        Collectors.mapping(CategoryAndBusiness::getBusiness, Collectors.toList())));
    }

    private void addTotal(Map<Category, List<Business>> groupedByCategory) {
        groupedByCategory.forEach((category, businessList) -> {
            int totalCount = businessList.size();
            Map<Category, BusinessesAndTotal> map = new HashMap<>();
            map.put(category, new BusinessesAndTotal(totalCount, new ArrayList<>(businessList)));
            businessesAndTotalGroupByCategoryList.add(map);
        });
    }

}
