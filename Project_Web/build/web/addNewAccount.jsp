<%-- 
    Document   : createNewAccount
    Created on : Jun 20, 2021, 1:42:05 PM
    Author     : thoai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <title>Admin Page</title>

        <link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="assets/vendors/mdi/css/materialdesignicons.min.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <div class="container-scroller">
            <div class="container-fluid page-body-wrapper">
                <div class="content-wrapper pb-0">
                    <%@include file="headerAdmin.jsp" %>

                    <!-- CHoox nayf -->
                    <div class="col-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Form Create a new Account</h4>
                                <c:if test="${requestScope.message eq 'err'}">
                                    <h4 class="card-title">Tài khoản đã tồn tại</h4>
                                </c:if>
                                <c:if test="${requestScope.message eq 'success'}">
                                    <h4 class="card-title">Đăng kí tài khoản thành công</h4>
                                </c:if><
                                c:if test="${requestScope.message eq 'errPass'}">
                                <h4 class="card-title">Password và repassword không khớp</h4>
                            </c:if>
                            <p class="card-description">(*) cannot empty</p>
                            <form class="forms-sample" action="AddNewAccountServlet" method="post">
                                <div class="form-group">
                                    <label for="exampleInputName1">UserName</label>
                                    <input type="text" class="form-control" id="exampleInputName1" placeholder="Name" name="userName"/>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail3">Full Name</label>
                                    <input type="text" class="form-control" id="exampleInputEmail3" placeholder="Full Name" name="fullName"/>
                                </div>
                                <div class="form-group">
                                    <label for="exampleSelectGender">Gender</label>
                                    <select class="form-control" id="exampleSelectGender">
                                        <option value="" disabled selected hidden>Select Gender</option>
                                        <option value="gender">Male</option>
                                        <option value="gender">Female</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <div class="form-group">
                                        <label for="exampleSelectGender">ROLE</label>
                                        <select class="form-control" id="exampleSelectGender" name="role">
                                            <option value="" disabled selected hidden>Select Role</option>
                                            <option value="ROLE_user">User</option>
                                            <option value="ROLE_member">Member</option>
                                            <option value="ROLE_admin">Admin</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail3">Phone</label>
                                    <input type="text" class="form-control" id="exampleInputEmail3" placeholder="Phone" name="phone"/>
                                </div><div class="form-group">
                                    <label for="exampleInputEmail3">Address</label>
                                    <input type="text" class="form-control" id="exampleInputEmail3" placeholder="Address" name="address"/>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword4">Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword4" placeholder="Password"  name="password"/>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword4">Re_Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword4" placeholder="RePassword" name="rePassword"/>
                                </div>
                                <button type="submit" class="btn btn-primary mr-2"> Submit </button>
                                <button class="btn btn-light">Cancel</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>               
    </div>
</div>
</body>

</html>