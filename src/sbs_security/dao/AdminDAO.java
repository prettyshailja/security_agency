package sbs_security.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import sbs_security.GetConnection;
import sbs_security.model.Admin;

public class AdminDAO {

    public static boolean AuthenticateAdmin(Admin admin) {
        boolean status = false;
        Connection con = null;
        try {
            con = GetConnection.getConnection();
            String sql = "SELECT  username,password FROM admin WHERE username = ? and password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, admin.getUsername());
            ps.setString(2, admin.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String uname = rs.getString(1);
            String pname = rs.getString(2);
            if(pname.equals(admin.getPassword()) && uname.equals(admin.getUsername())){
                        status=true;
                   }
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return status;
    }

    public static boolean registerAdmin(Admin admin) {
        boolean status = false;
        Connection con = null;
        try {
            con = GetConnection.getConnection();
            String sql = "INSERT INTO admin(username,password,email_id) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, admin.getUsername());
            ps.setString(2, admin.getPassword());
            ps.setString(3, admin.getEmail_id());
            if (ps.executeUpdate() != 0) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return status;
    }
    public static boolean changePassword(Admin admin) {
        boolean status = false;
        Connection con = null;
        try {
            con = GetConnection.getConnection();
            String sql = "UPDATE admin SET password = ? WHERE email_id = ? AND username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, admin.getPassword());
            ps.setString(2, admin.getEmail_id());
            ps.setString(3, admin.getUsername());
            if (ps.executeUpdate() != 0) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return status;
}
}
