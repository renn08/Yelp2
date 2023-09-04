package com.example.yelp.Utility;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;

public class HikariCPDataSource {
    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

    static {
        config.setJdbcUrl(DatabaseOperationUtil.dbUrl);
        config.setUsername(DatabaseOperationUtil.user);
        config.setPassword(DatabaseOperationUtil.password);
        config.setDriverClassName(DatabaseOperationUtil.className);
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        ds = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    private HikariCPDataSource(){}
}
