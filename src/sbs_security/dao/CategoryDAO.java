
package sbs_security.dao;
import sbs_security.model.Category;
import sbs_security.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoryDAO{
    
public static boolean addCategory(Category category){
   boolean status = false;
   Connection con = null;
   try{
    con = GetConnection.getConnection();
    String sql = "INSERT INTO category(C_name,Salary) VALUES(?,?)";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, category.getC_name());
    ps.setInt(2,category.getSalary());
    if(ps.executeUpdate()!=0)
     status = true;
   }
   catch(Exception e){
     e.printStackTrace();
   }
   return status;
  } 
  public static ArrayList<Category> getCategoryList(){
     Connection con = null;
     ArrayList<Category>al = new ArrayList<>();
     try{
        con = GetConnection.getConnection();
        String sql = "SELECT * FROM category";
        PreparedStatement ps =con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
           int id = rs.getInt(1);
           String categoryName = rs.getString(2);
           int salary=rs.getInt(3);
           Category category = new Category(id, categoryName,salary);
           al.add(category);
        }
     }
     catch(Exception e){
        e.printStackTrace();
     }
     finally{
        try{
         con.close();
        }
        catch(Exception e){
          e.printStackTrace();
        }
     }
     return al;
  }
  
public static boolean deleteCategory(Category category){
   boolean status = false;
   Connection con = null;
   try{
      con = GetConnection.getConnection();
      String sql = "DELETE FROM category WHERE C_name = ?";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1,category.getC_name());
      if(ps.executeUpdate()!=0)
       status = true;
   }
   catch(Exception e){
     e.printStackTrace();
   }
   finally{
      try{
       con.close();
      }
      catch(Exception e){
       e.printStackTrace();
      }
   }
   return status;
  }

public static boolean updateCategory(Category category){
   boolean status = false;
   Connection con = null;
   try{
    con = GetConnection.getConnection();
    String sql = "UPDATE category SET salary = ? WHERE C_name= ?";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(2, category.getC_name());
    ps.setInt(1,category.getSalary());
    if(ps.executeUpdate()!=0)
     status = true;
   }
   catch(Exception e){
     e.printStackTrace();
   }
   return status;
  } 
}