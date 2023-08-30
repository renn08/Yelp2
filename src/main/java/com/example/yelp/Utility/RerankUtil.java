package com.example.yelp.Utility;

import com.example.yelp.Entity.Business;
import java.util.*;

public final class RerankUtil {

    public static void reRankByRatingCount(List<Business> businesses) {
        Collections.sort(businesses, (o1, o2) -> {
            double newRank1 = o1.getRating() * o1.getReviewCount();
            double newRank2 = o2.getRating() * o2.getReviewCount();
            if (newRank2 > newRank1) return 1;
            else if (newRank2 == newRank1) return 0;
            else return -1;
        });
    }
}
