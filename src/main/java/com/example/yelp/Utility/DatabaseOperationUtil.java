package com.example.yelp.Utility;

import com.example.yelp.Entity.Business;
import com.example.yelp.Entity.CatAndBizId;
import com.example.yelp.Entity.Category;
import org.checkerframework.checker.units.qual.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public final class DatabaseOperationUtil {
    static Logger logger = LoggerFactory.getLogger(DatabaseOperationUtil.class);

    public static final String className = "com.mysql.cj.jdbc.Driver";
    public static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/yelpDB";
    public static final String user = "root";
    public static final String password = "nopassword";

    // business table operations:
    // insert without duplication
    public static void insertBizNonDup(Business business) {
        try{
//            Class.forName(className);
//            Connection con= DriverManager.getConnection(dbUrl, user, password);
            Connection con = HikariCPDataSource.getConnection();

            String sqlCommand = "insert ignore into " +
                    "business " +
                    "(id, alias, name, image_url, is_closed, url, review_count, rating, price, phone, display_phone, distance) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(sqlCommand);
            prepareBizStmt(preparedStmt, business);

            preparedStmt.execute();
            con.close();
        } catch (Exception e) {
            logger.error("Exception when insert ignore into business table:: ", e);
        }
    }

    public static void insertBizNonDupBatch(List<Business> businesses) {
        try{
//            Class.forName(className);
//            Connection con= DriverManager.getConnection(dbUrl, user, password);
            Connection con = HikariCPDataSource.getConnection();

            con.setAutoCommit(false);

            String sqlCommand = "insert ignore into " +
                    "business " +
                    "(id, alias, name, image_url, is_closed, url, review_count, rating, price, phone, display_phone, distance) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(sqlCommand);

            for (Business business : businesses) {
                prepareBizStmt(preparedStmt, business);
                preparedStmt.addBatch();
            }

            preparedStmt.executeBatch();
            con.commit();
            con.close();
        } catch (Exception e) {
            logger.error("Exception when batch insert ignore into business table:: ", e);
        }
    }

    // category table operations:
    // insert without duplication
    public static void insertCatNonDup(Category cat) {
        try{
//            Class.forName(className);
//            Connection con= DriverManager.getConnection(dbUrl, user, password);
            Connection con = HikariCPDataSource.getConnection();

            String sqlCommand = "insert ignore into " +
                    "category " +
                    "(alias, title) " +
                    "VALUES (?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(sqlCommand);
            preparedStmt.setString(1, cat.getAlias());
            preparedStmt.setString(2, cat.getTitle());

            preparedStmt.execute();
            con.close();
        } catch (Exception e) {
            logger.error("Exception when insert ignore into category table:: ", e);
        }
    }

    public static void insertCatNonDupBatch(List<Category> cats) {
        try{
//            Class.forName(className);
//            Connection con= DriverManager.getConnection(dbUrl, user, password);
            Connection con = HikariCPDataSource.getConnection();

            con.setAutoCommit(false);

            String sqlCommand = "insert ignore into " +
                    "category " +
                    "(alias, title) " +
                    "VALUES (?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(sqlCommand);

            for (Category cat : cats) {
                preparedStmt.setString(1, cat.getAlias());
                preparedStmt.setString(2, cat.getTitle());
                preparedStmt.addBatch();
            }

            preparedStmt.executeBatch();
            con.commit();
            con.close();
        } catch (Exception e) {
            logger.error("Exception when batch insert ignore into category table:: ", e);
        }
    }

    // business_category table operations:
    // insert without duplication
    public static void insertBizCatNonDup(CatAndBizId catAndBizId) {
        try{
//            Class.forName(className);
//            Connection con= DriverManager.getConnection(dbUrl, user, password);
            Connection con = HikariCPDataSource.getConnection();

            String sqlCommand = "insert ignore into " +
                    "business_category " +
                    "(business_id, category_alias) " +
                    "VALUES (?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(sqlCommand);
            preparedStmt.setString(1, catAndBizId.getBusinessId());
            preparedStmt.setString(2, catAndBizId.getCategory().getAlias());

            preparedStmt.execute();
            con.close();
        } catch (Exception e) {
            logger.error("Exception when insert ignore into business_category table:: ", e);
        }
    }

    public static void insertBizCatNonDupBatch(List<CatAndBizId> catAndBizIds) {
        try{
//            Class.forName(className);
//            Connection con= DriverManager.getConnection(dbUrl, user, password);
            Connection con = HikariCPDataSource.getConnection();

            con.setAutoCommit(false);

            String sqlCommand = "insert ignore into " +
                    "business_category " +
                    "(business_id, category_alias) " +
                    "VALUES (?, ?)";

            PreparedStatement preparedStmt = con.prepareStatement(sqlCommand);

            for (CatAndBizId catAndBizId : catAndBizIds) {
                preparedStmt.setString(1, catAndBizId.getBusinessId());
                preparedStmt.setString(2, catAndBizId.getCategory().getAlias());
                preparedStmt.addBatch();
            }


            preparedStmt.executeBatch();
            con.commit();
            con.close();
        } catch (Exception e) {
            logger.error("Exception when batch insert ignore into business_category table:: ", e);
        }
    }

    private static void prepareBizStmt(PreparedStatement preparedStmt, Business business) throws SQLException {
        preparedStmt.setString(1, business.getId());
        preparedStmt.setString(2, business.getAlias());
        preparedStmt.setString(3, business.getName());
        preparedStmt.setString(4, business.getImageUrl());
        preparedStmt.setBoolean(5, business.isClosed());
        preparedStmt.setString(6, business.getUrl());
        preparedStmt.setInt(7, business.getReviewCount());
        preparedStmt.setDouble(8, business.getRating());
        preparedStmt.setString(9, business.getPrice());
        preparedStmt.setString(10, business.getPhone());
        preparedStmt.setString(11, business.getDisplayPhone());
        preparedStmt.setDouble(12, business.getDistance());
    }
}
