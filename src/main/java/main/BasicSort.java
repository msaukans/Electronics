package main;

import java.sql.*;

public class BasicSort {
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 
 public static void main(String[] args) {
 Connection conn = null; 
 Statement stmt = null;
 try{
    Class.forName("com.mysql.jdbc.Driver");
    conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics?autoReconnect=true&useSSL=false", "root", "root");
    stmt = conn.createStatement();
    String sql = "SELECT id, brand, model, category, price, rating, stock FROM item" +
                 " ORDER BY model ASC";
    ResultSet rs = stmt.executeQuery(sql);
    System.out.println("Displaying data being sorted in ascending order. \n");
    while(rs.next()){
       
       int id  = rs.getInt("id");
       String brand = rs.getString("brand");
       String model = rs.getString("model");
       String category = rs.getString("category");
       Double price = rs.getDouble("price");
       int rating = rs.getInt("rating");

       //Printing out values
       System.out.print("ID: " + id);
       System.out.print(", Brand: " + brand);
       System.out.print(", Model: " + model);
       System.out.print(", Category: " + category);
       System.out.print(", Price: " + price);
       System.out.println(", rating: " + rating);
    }

   
    sql = "SELECT id, brand, model, category, price, rating, stock FROM item ORDER BY brand DESC";
    rs = stmt.executeQuery(sql);
    System.out.println("Displaying data being sorted in descending order. \n");

    while(rs.next()){
       int id  = rs.getInt("id");
       String brand = rs.getString("brand");
       String model = rs.getString("model");
       String category = rs.getString("category");
       Double price = rs.getDouble("price");
       int rating = rs.getInt("rating");;

       //Display values
       System.out.print("ID: " + id);
       System.out.print(", Brand: " + brand);
       System.out.print(", Model: " + model);
       System.out.print(", Category: " + category);
       System.out.print(", Price: " + price);
       System.out.println(", rating: " + rating);
    }
    rs.close();
 }catch(SQLException se){
    se.printStackTrace();
 }catch(Exception e){
    e.printStackTrace();
 }finally{
	 try{
       if(stmt!=null)
          conn.close();
    }catch(SQLException se){
    }
  }
 }//end main
}//end class
