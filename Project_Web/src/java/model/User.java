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
public class User {
    int userId;
    String userName;
    String password;
    String fullName;
    String phone;
    String address;
    boolean gender;
    String role;

    public User() {
    }

    public User(int userId, String userName, String password, String fullName, String phone, String address, boolean gender, String role) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.role = role;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName=" + userName + ", password=" + password + ", fullName=" + fullName + ", phone=" + phone + ", address=" + address + ", gender=" + gender + ", role=" + role + '}';
    }
    
}
