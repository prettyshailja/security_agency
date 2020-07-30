
package sbs_security;

import java.sql.*;
import java.sql.DriverManager;

public class GetConnection {
  private static Connection con = null;
  public static Connection getConnection(){
   try{
      Class.forName("org.postgresql.Driver");
      System.out.println("Driver loaded");
      con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/security" , "postgres","1234");
      System.out.println("Connection stablished");
   }
   catch(Exception e){
    e.printStackTrace();
   }
   return con;
  }

public static void main(String args[]){
  Connection con=GetConnection.getConnection();
  System.out.println(con);
}
}