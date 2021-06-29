/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import model.Product;

/**
 *
 * @author thoai
 */
public class ProductDAO extends DBContext {

    public List<Product> getAllProductPaging(int pageIndex) {
        String query = "SELECT * FROM (SELECT ROW_NUMBER() OVER (ORDER BY productId ASC)\n"
                + "              as rownum, * from Product p) tbl\n"
                + "             join Categories c on tbl.categoryId = c.categoryId\n"
                + "             where rownum between ? and ?";
        List<Product> listP = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, pageIndex * 4 - 3);
            ps.setInt(2, pageIndex * 4);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category categories = new Category(rs.getInt(10), rs.getString(11), rs.getString(12));
                listP.add(new Product(rs.getInt(2),
                        rs.getString(4),
                        rs.getFloat(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        categories));
            }
        } catch (Exception e) {
        }
        return listP;
    }

    public List<Product> getAllProductPaging12items(int pageIndex) {
        String query = "SELECT * FROM (SELECT ROW_NUMBER() OVER (ORDER BY productId ASC)\n"
                + "              as rownum, * from Product p) tbl\n"
                + "             join Categories c on tbl.categoryId = c.categoryId\n"
                + "             where rownum between ? and ?";
        List<Product> listP = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, pageIndex * 12 - 11);
            ps.setInt(2, pageIndex * 12);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category categories = new Category(rs.getInt(10), rs.getString(11), rs.getString(12));
                listP.add(new Product(rs.getInt(2),
                        rs.getString(4),
                        rs.getFloat(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        categories));
            }
        } catch (Exception e) {
        }
        return listP;
    }

    public int totalPage() {
        String query = "select count(*) from Product";
        int count = 0;
        int totalPage = 0;
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
            if (count % 4 > 0) {
                totalPage = count / 4 + 1;
            } else {
                totalPage = count / 4;
            }
        } catch (Exception e) {
        }
        return totalPage;
    }

    // Get All Category
    public List<Category> getAllCategories() {
        String query = "select * from Categories";
        List<Category> listC = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listC.add(new Category(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)));
            }
        } catch (Exception e) {
        }
        return listC;
    }

    // get all product by ID
    public Product getProductById(int productId) {
        String query = "select * from Product where productId = ?";
        Product product = new Product();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, productId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category categories = new Category();
                product = new Product(rs.getInt(1),
                        rs.getString(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        categories);
            }
        } catch (Exception e) {
        }
        return product;
    }

    // Get all product by category
    public List<Product> getAllProductByCategoryId(int categoryId) {
        String query = "select * from Product p where categoryId = ?";
        List<Product> listP = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category categories = new Category();
                listP.add(new Product(rs.getInt(1),
                        rs.getString(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        categories));
            }
        } catch (Exception e) {
        }
        return listP;
    }
//private int productId;
//    private String productName;
//    private float price;
//    private String size;
//    private int quantity;
//    private String pDescription;
//    private String image;
//    private Category category;

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        List<Product> list = dao.getAllProductByCategoryId(3);
        for (Product a : list) {
            System.out.println(a);

        }

    }
}
