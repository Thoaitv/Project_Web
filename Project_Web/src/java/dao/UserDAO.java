/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.User;

/**
 *
 * @author thoai
 */
public class UserDAO extends DBContext {

    public boolean checkAcountExist(String username) {

        // Create and execute an SQL statement that returns list of data.
        String query = "SELECT * FROM [User] WHERE username = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User a = new User(rs.getInt("userId"),
                        rs.getString("userName"),
                        rs.getString("password"),
                        rs.getString("fullName"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getBoolean("gender"),
                        rs.getString("role"));
                if (a != null) {
                    return true;
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public User login(String username, String password) {
        // Create and execute an SQL statement that returns list of data.
        String query = "SELECT * FROM [User] WHERE username = ? and [password] =?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt("userId"),
                        rs.getString("userName"),
                        rs.getString("password"),
                        rs.getString("fullName"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getBoolean("gender"),
                        rs.getString("role"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void Register(String userName, String password,String phone, String address) {
        String query = "insert into [User] values(?, ?, '', ?, ?, 1, 'ROLE_user')";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, userName);
            ps.setString(2, password);
            ps.setString(3, phone);
            ps.setString(4, address);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
