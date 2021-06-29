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
import model.Cart;
import model.Category;
import model.Order;
import model.Product;
import model.User;

/**
 *
 * @author thoai
 */
public class CartDAO extends DBContext {

    public void addProductToCart(int userId, int productId, int quantity) {
        String query = "insert into Cart values(?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, productId);
            ps.setInt(3, quantity);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // Get all product to load in Cart
    public List<Cart> getAllProductInCartByUserId(int userId) {
        List<Cart> listCart = new ArrayList<>();

        String query = "select * from Cart c join [User] u on c.userId = u.userId join Product p \n"
                + "on c.productId = p.productId join Categories cg on p.categoryId = cg.categoryId where u.userId = ?";

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

                Category category = new Category(rs.getInt("categoryId"),
                        rs.getString("categoryName"),
                        rs.getString("categoryImage"));

                Product product = new Product(rs.getInt("productId"),
                        rs.getString("productName"),
                        rs.getFloat("price"),
                        rs.getString("size"),
                        rs.getInt("quantity"),
                        rs.getString("productDescription"),
                        rs.getString("image"),
                        category);
                Cart cart = new Cart(rs.getInt("cartId"), user, product, rs.getInt("quantity"));
                listCart.add(cart);
            }
        } catch (Exception e) {
        }
        return listCart;
    }

// Update Quantity of product in Cart
    public void updateQuantityInCart(int userId, int productId, int quantity) {
        String query = "update Cart set quantity = ? where userId = ? and productId = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, productId);
            ps.setInt(3, quantity);
            ResultSet rs = ps.executeQuery();
        } catch (Exception e) {
        }

    }

    // Get quantity product of User by ProdutId
    public int getQuantityProductInCartOfUserIdByProductId(int userId, int productId) {
        String query = "select quantity from Cart where userId = ? and productId = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, productId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
            rs = ps.executeQuery();
        } catch (Exception e) {
        }
        return 0;
    }

    // Update Quantity in cart
    public void updateQuantityInCart(int cartId, int quantity) {
        String query = "update Cart set quantity = ? where cartId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, quantity);
            ps.setInt(2, cartId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // Check out
    public void CheckOut(int userId, int productId, int quantity) {
        String query = "insert into Orders values (?, ?, ?, getDate(), 'waiting_line')";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setInt(2, productId);
            ps.setInt(3, quantity);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // Delete item in cart after check out
    public void DeleteItemInCart(int userId) {
        String query = "delete from Cart\n"
                + "where userId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    

    public void updateUserInformation(String password, String fullName, String phone, String address, boolean gender, int userId) {
        String query = "update [User] set password = ?, fullName = ?,phone = ?, address = ?, gender = ? where userId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, fullName);
            ps.setString(3, phone);
            ps.setString(4, address);
            ps.setBoolean(5, gender);
            ps.setInt(6, userId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Order> getAllProductToOrderbyUserId(int userId) {
        List<Order> listOrder = new ArrayList<>();
        String query = "select * from Orders c join [User] u on c.userId = u.userId join Product p \n"
                + "on c.productId = p.productId join Categories cg on p.categoryId = cg.categoryId where u.userId = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("userId"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullName"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getBoolean("gender"),
                        rs.getString("role"));

                Category category = new Category(rs.getInt("categoryId"),
                        rs.getString("categoryName"),
                        rs.getString("categoryImage"));

                Product product = new Product(rs.getInt("productId"),
                        rs.getString("productName"),
                        rs.getFloat("price"),
                        rs.getString("size"),
                        rs.getInt("quantity"),
                        rs.getString("productDescription"),
                        rs.getString("image"),
                        category);
                Order order = new Order(rs.getInt("orderId"),
                        user,
                        product,
                        rs.getInt("quantity"),
                        rs.getDate("orderDate"),
                        rs.getString("status"));
                listOrder.add(order);
            }
        } catch (Exception e) {
        }
        return listOrder;
    }

    //oke
    public List<Order> getAllOrderByUserId(int userId) {
        List<Order> listOrder = new ArrayList<>();
        String query = "select * from Orders o\n"
                + "join [User] u\n"
                + "on o.userId = u.userId\n"
                + "join Product p\n"
                + "on o.productId = p.productId\n"
                + "join Categories cg\n"
                + "on p.categoryId = cg.categoryId\n"
                + "where u.userId = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("userId"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullName"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getBoolean("gender"),
                        rs.getString("role"));
                Category category = new Category(rs.getInt("categoryId"), rs.getString("categoryName"), rs.getString("categoryImage"));
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

    public static void main(String[] args) {
        CartDAO dao = new CartDAO();
//        List<Order> list = dao.test(6);
//        for (Order cart : list) {
//            System.out.println(cart);
//        }

        List<Order> list = dao.getAllProductToOrderbyUserId(3);
        if (list.isEmpty()) {
            System.out.println("Rong");
        }
        for (Order cart : list) {
            System.out.println(cart);
        }

    }
}
