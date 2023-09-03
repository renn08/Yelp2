package com.example.yelp.Utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public final class DatabaseOperationUtil {
    static Logger logger = LoggerFactory.getLogger(DatabaseOperationUtil.class);
    public static final String className = "com.mysql.cj.jdbc.Driver";
    public static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/yelpDB";
    public static final String user = "root";
    public static final String password = "nopassword";

    // business table operations:

    // insert without duplication
    public static void insertBizNonDup(String id, String alias, String name, String imageUrl, boolean isClosed, String url, int reviewCount, double rating, String price, String phone, String displayPhone, double distance) {
        try{
            Class.forName(className);
            Connection con= DriverManager.getConnection(dbUrl, user, password);

            String sqlCommand = "insert ignore into " +
                    "business " +
                    "(id, alias, name, image_url, is_closed, url, review_count, rating, price, phone, display_phone, distance) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(sqlCommand);
            preparedStmt.setString(1, id);
            preparedStmt.setString(2, alias);
            preparedStmt.setString(3, name);
            preparedStmt.setString(4, imageUrl);
            preparedStmt.setBoolean(5, isClosed);
            preparedStmt.setString(6, url);
            preparedStmt.setInt(7, reviewCount);
            preparedStmt.setDouble(8, rating);
            preparedStmt.setString(9, price);
            preparedStmt.setString(10, phone);
            preparedStmt.setString(11, displayPhone);
            preparedStmt.setDouble(12, distance);

            preparedStmt.execute();
            con.close();
        } catch (Exception e) {
            logger.error("Exception when insert ignore into business table:: ", e);
        }
    }

    // category table operations:
    public static void insertCatNonDup(String alias, String title) {
        try{
            Class.forName(className);
            Connection con= DriverManager.getConnection(dbUrl, user, password);

            String sqlCommand = "insert ignore into " +
                    "category " +
                    "(alias, title) " +
                    "VALUES (?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(sqlCommand);
            preparedStmt.setString(1, alias);
            preparedStmt.setString(2, title);

            preparedStmt.execute();
            con.close();
        } catch (Exception e) {
            logger.error("Exception when insert ignore into category table:: ", e);
        }
    }

    // business_category table operations:
    public static void insertBizCatNonDup(String businessId, String categoryAlias) {
        try{
            Class.forName(className);
            Connection con= DriverManager.getConnection(dbUrl, user, password);

            String sqlCommand = "insert ignore into " +
                    "business_category " +
                    "(business_id, category_alias) " +
                    "VALUES (?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(sqlCommand);
            preparedStmt.setString(1, businessId);
            preparedStmt.setString(2, categoryAlias);

            preparedStmt.execute();
            con.close();
        } catch (Exception e) {
            logger.error("Exception when insert ignore into business_category table:: ", e);
        }
    }
}
