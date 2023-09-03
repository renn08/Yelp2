package com.example.yelp.Controller;
import java.sql.*;

public class trydb {
    public static void main(String[] args) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection(
                            "jdbc:mysql://127.0.0.1:3306/yelpDB","root","nopassword");
//here sonoo is database name, root is username and password
//                    Statement stmt=con.createStatement();
                    String sqlCommand = "insert into business (id, alias, name, image_url, is_closed, url, review_count, rating, price, phone, display_phone, distance) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement preparedStmt = con.prepareStatement(sqlCommand);
                    preparedStmt.setString(1, "id");
                    preparedStmt.setString(2, "alias");
                    preparedStmt.setString(3, "name");
                    preparedStmt.setString(4, "image_url");
                    preparedStmt.setBoolean(5, false);
                    preparedStmt.setString(6, "url");
                    preparedStmt.setInt(7, 100);
                    preparedStmt.setDouble(8, 45.7);
                    preparedStmt.setString(9, "price");
                    preparedStmt.setString(10, "phone");
                    preparedStmt.setString(11, "display_phone");
                    preparedStmt.setDouble(12, 45.6);

//                    ResultSet rs=stmt.executeQuery(sqlCommand);
                    preparedStmt.execute();
//                    while(rs.next()) {
//                        System.out.println(rs.getString("id"));
//                    }
                    con.close();
                }catch(Exception e){ System.out.println(e);}


    }
}
