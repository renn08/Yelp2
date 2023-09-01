package com.example.yelp.Response;

import com.example.yelp.Entity.BusinessesAndTotal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class GroupByCategoryResponse extends SampleResponse {
    Logger logger = LoggerFactory.getLogger(GroupByCategoryResponse.class);

    private final String searchTerm; // required
    private final String searchLocation; // required

    // category alias name for the String in the map
    private final List<Map<String, BusinessesAndTotal>> bizAndTotalGroupByCat;

    private GroupByCategoryResponse(String searchLocation, String searchTerm, List<Map<String, BusinessesAndTotal>>  bizAndTotalGroupByCat) {
        super();
        this.searchLocation = searchLocation;
        this.searchTerm = searchTerm;
        this.bizAndTotalGroupByCat = bizAndTotalGroupByCat;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public String getSearchLocation() {
        return searchLocation;
    }

    public List<Map<String, BusinessesAndTotal>> getBizAndTotalGroupByCat() {
        return bizAndTotalGroupByCat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends SampleResponse.Builder<Builder> {
        private String searchTerm;
        private String searchLocation;

        private List<Map<String, BusinessesAndTotal>> bizAndTotalGroupByCat;

        public Builder() {}

        public Builder setBizAndTotalGroupByCat (List<Map<String, BusinessesAndTotal>> bizAndTotalGroupByCat) {
            this.bizAndTotalGroupByCat = bizAndTotalGroupByCat;
            return this;
        }

        public Builder setSearchLocation(String searchLocation) {
            this.searchLocation = searchLocation;
            return this;
        }

        public Builder setSearchTerm(String searchTerm) {
            this.searchTerm = searchTerm;
            return this;
        }

        @Override
        public GroupByCategoryResponse build() {
            return new GroupByCategoryResponse(searchLocation, searchTerm, bizAndTotalGroupByCat);
        }
    }
}
