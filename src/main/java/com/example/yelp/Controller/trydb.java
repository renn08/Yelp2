package com.example.yelp.Controller;
import java.sql.*;

public class trydb {
    public static void main(String[] args) {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection(
                            "jdbc:mysql://127.0.0.1:3306/yelpDB","root","nopassword");
//here sonoo is database name, root is username and password
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("select * from business");
                    while(rs.next()) {
                        System.out.println(rs.getString("id"));
                        System.out.println("jahjahahsja");
                    }
                    con.close();
                }catch(Exception e){ System.out.println(e);}


    }
}
