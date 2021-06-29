/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thoai
 */
public class Product {
    private int productId;
    private String productName;
    private float price;
    private String size;
    private int quantity;
    private String pDescription;
    private String image;
    private Category category;

    public Product() {
    }

    public Product(int productId, String productName, float price, String size, int quantity, String pDescription, String image, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
        this.pDescription = pDescription;
        this.image = image;
        this.category = category;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", price=" + price + ", size=" + size + ", quantity=" + quantity + ", pDescription=" + pDescription + ", image=" + image + ", category=" + category + '}';
    }
}
