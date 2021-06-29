/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.Order;
import model.Product;
import model.User;

/**
 *
 * @author thoai
 */
public class AdminDAO extends DBContext {

    public int countUser() {
        String query = "select count (*) from [user]";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int countProduct() {
        String query = "select count (*) from Product";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int countOrder() {
        String query = "select count (*) from Orders";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    // Load all User pagging
    public List<User> getAllUserPagging(int pageIndex) {
        List<User> listUser = new ArrayList<>();
        String query = "SELECT * FROM (SELECT ROW_NUMBER() OVER (ORDER BY userId ASC)\n"
                + "as rownum, * from [User]) tbl where rownum between ? and ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, pageIndex * 5 - 4);
            ps.setInt(1, pageIndex * 5);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("userId"),
                        rs.getString("userName"),
                        rs.getString("password"),
                        rs.getString("fullName"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getBoolean("gender"),
                        rs.getString("role"));
                listUser.add(user);
            }
        } catch (Exception e) {
        }
        return listUser;
    }

    public List<User> getAlluser() {
        List<User> listUser = new ArrayList<>();
        String query = "SELECT * FROM [User]";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("userId"),
                        rs.getString("userName"),
                        rs.getString("password"),
                        rs.getString("fullName"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getBoolean("gender"),
                        rs.getString("role"));
                listUser.add(user);
            }
        } catch (Exception e) {
        }
        return listUser;
    }

    public User getAllUserByUserId(int userId) {
        String query = "SELECT * FROM [User] WHERE userId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("userId"),
                        rs.getString("userName"),
                        rs.getString("password"),
                        rs.getString("fullName"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getBoolean("gender"),
                        rs.getString("role"));
                return user;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getAllProduct() {
        List<Product> listProduct = new ArrayList<>();
        String query = "select * from Product";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getInt("categoryId"));
                Product product = new Product(rs.getInt("productId"),
                        rs.getString("productName"),
                        rs.getFloat("price"),
                        rs.getString("size"),
                        rs.getInt("quantity"),
                        rs.getString("productDescription"),
                        rs.getString("image"),
                        category);

//                Category category = new Category(rs.getInt(1));
//                Product product = new Product(rs.getInt(1),
//                        rs.getString(3),
//                        rs.getFloat(4),
//                        rs.getString(5),
//                        rs.getInt(6),
//                        rs.getString(7),
//                        rs.getString(8),
//                        category);
                listProduct.add(product);
            }
        } catch (Exception e) {
        }
        return listProduct;
    }

    // Add Product
    public void AddProduct(int categoryId, String productName, float price, int quantity, String image, String desc) {
        String query = "insert into Product values(?, ?, ?, 'S', ?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, categoryId);
            ps.setString(2, productName);
            ps.setFloat(3, price);
            ps.setInt(4, quantity);
            ps.setString(5, desc);
            ps.setString(6, image);
            ps.executeUpdate();

        } catch (SQLException ex) {
        }
    }

    public void AddNewUser(String userName, String password, String fullName, String phone, String address, boolean gender, String role) {
        String query = "insert into [User] values(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, userName);
            ps.setString(2, password);
            ps.setString(3, fullName);
            ps.setString(4, phone);
            ps.setString(5, address);
            ps.setBoolean(6, gender);
            ps.setString(7, role);
            ps.executeUpdate();

        } catch (SQLException ex) {
        }
    }

    // Get All order pagging 5
    public List<Order> getAllOrderPagging(int indexPage) {
        List<Order> listOrder = new ArrayList<>();
        String query = "select * from (select ROW_NUMBER() over  (order by orderDate DESC)as rownum, * from Orders) o \n"
                + "join Product p on o.productId = p.productId join [User] u on u.userId = o.userId\n"
                + "where rownum between ? and ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, indexPage * 5 - 4);
            ps.setInt(2, indexPage * 5);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("userId"), rs.getString("userName"), rs.getString("password"), rs.getString("fullName"), rs.getString("phone"), rs.getString("address"), rs.getBoolean("gender"), rs.getString("role"));
                Category category = new Category(rs.getInt("categoryId"));
                Product product = new Product(rs.getInt("productId"),
                        rs.getString("productName"),
                        rs.getFloat("price"),
                        rs.getString("size"),
                        rs.getInt("quantity"),
                        rs.getString("productDescription"),
                        rs.getString("image"),
                        category);
                Order order = new Order(rs.getInt("orderId"), user, product, rs.getInt("quantity"), rs.getDate("orderDate"), rs.getString("status"));
                listOrder.add(order);
            }

        } catch (Exception e) {
        }
        return listOrder;
    }

    public void updateAccount(String password, String fullName, String phone, String address, String role, boolean gender, int userId) {
        String query = "UPDATE [User]\n"
                + "SET password = ?, fullName= ?, phone =?, address=?, gender= ?, role= ? \n"
                + "WHERE userId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, fullName);
            ps.setString(3, phone);
            ps.setString(4, address);
            ps.setBoolean(5, gender);
            ps.setString(6, role);
            ps.setInt(7, userId);
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    public void updateProduct(int categoryId, String productName, float price, int quantity, String productDescription, String image, int productId) {
        String query = "UPDATE Product set "
                + "categoryId = ?, productName = ?, price =?, quantity = ?, productDescription=?, image =?"
                + " where productId = ?\n";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, categoryId);
            ps.setString(2, productName);
            ps.setFloat(3, price);
            ps.setInt(4, quantity);
            ps.setString(5, productDescription);
            ps.setString(6, image);
            ps.setInt(7, productId);

            ps.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    public void deleteProductByProductId(int productId) {
        String query = "delete from Product\n"
                + "where productId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, productId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteOrderByProductId(int productId) {
        String query = "delete from Orders\n"
                + "where productId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, productId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteCartByProductId(int productId) {
        String query = "delete from Cart\n"
                + "where productId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, productId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteCartByUserId(int userId) {
        String query = "delete Cart where userId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteOrderByUserId(int userId) {
        String query = "delete Orders where userId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteAccountByUserId(int userId) {
        String query = "delete [User] where userId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // Change status Order
    public void updateStatusOrder(int orderId) {
        String query = "UPDATE Orders set status = 'success' WHERE orderId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, orderId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int paggingInListOrder() {
        String query = "select count(*) from Orders";
        int count = 0;
        int totalPage = 0;
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
            if (count % 5 > 0) {
                totalPage = count / 5 + 1;
            } else {
                totalPage = count / 5;
            }
        } catch (Exception e) {
        }
        return totalPage;
    }

    public static void main(String[] args) {
        AdminDAO dao = new AdminDAO();
//        List<User> list = dao.getAlluser();
//        for (User user : list) {
//            System.out.println(list);
//        }

//        List<Product> list = dao.getAllProduct();
//        if (list.isEmpty()) {
//            System.out.println("Rong");
//        }
//        for (Product user : list) {
//            System.out.println(user);
//        }
        List<Order> list = dao.getAllOrderPagging(1);
        if (list.isEmpty()) {
            System.out.println("Rong");
        }
        for (Order user : list) {
            System.out.println(user);
        }

//        dao.AddProduct(6, "Vanssssss", 190, 30, "Giày Classiccccc", "g7.jpg");
//        dao.AddNewUser("usertestt",
//                "a", 
//                "Test insert",
//                "03522222",
//                "Hà Nội",
//                true,
//                "ROLE_user");
//System.out.println(dao.getAllUserByUserId(1));
//        dao.updateAccount("asd", "thoaiii", "phone", "day la addess", "ROLE_user", true, 18);
//        dao.updateProduct(3, "testttName", 222, 999, "testdess day ne", "v2.jpg", 4);
//dao.updateStatusOrder(1173);
    }

}
