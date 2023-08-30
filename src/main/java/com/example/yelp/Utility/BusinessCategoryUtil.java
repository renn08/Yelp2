package com.example.yelp.Utility;

import com.example.yelp.Entity.Business;
import com.example.yelp.Entity.BusinessesAndTotal;
import com.example.yelp.Entity.Category;
import com.example.yelp.Entity.CategoryAndBusiness;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class BusinessCategoryUtil {
    // map business list (many businesses, each has multiple categories) to a stream of category and business
    // (single category and single business) objects.
    public static Stream<CategoryAndBusiness> toCatBizStream(@NotNull List<Business> businesses) {
        return businesses
                .stream()
                .flatMap(eachBusiness -> eachBusiness.getCategories()
                        .stream()
                        .map(category -> new CategoryAndBusiness(category, eachBusiness)));
    }

    // map a stream of category and business objects into a map that group businesses by category into list
    public static Map<Category, List<Business>> groupByCategory(@NotNull Stream<CategoryAndBusiness> catBizStream) {
        return catBizStream
                .collect(Collectors.groupingBy(CategoryAndBusiness::getCategory,
                        Collectors.mapping(CategoryAndBusiness::getBusiness, Collectors.toList())));
    }

    // add total number of value of each key value pair to the previous method generated map
    public static @NotNull List<Map<String, BusinessesAndTotal>> addTotal(@NotNull Map<Category, List<Business>> groupedByCategory) {
        List<Map<String, BusinessesAndTotal>> businessesAndTotalGroupByCategoryList = new ArrayList<>();
        groupedByCategory.forEach((category, businessList) -> {
            int totalCount = businessList.size();
            Map<String, BusinessesAndTotal> map = new HashMap<>();
            map.put(category.getAlias(), new BusinessesAndTotal(totalCount, new ArrayList<>(businessList)));
            businessesAndTotalGroupByCategoryList.add(map);
        });
        return businessesAndTotalGroupByCategoryList;
    }
}
