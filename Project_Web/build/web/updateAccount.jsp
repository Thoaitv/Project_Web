<%-- 
    Document   : updateAccount
    Created on : Jun 21, 2021, 2:49:00 PM
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
                                <p class="card-description">(*) cannot empty</p>
                                <!--<form class="forms-sample" action="UpdateAccountServlet" method="post">--> 
                                ${id} <br/> 
                                ${fullName} <br/> 
                                ${gender}<br/> 
                                ${role}<br/> 
                                ${phone}<br/> 
                                ${address}<br/> 
                                ${password}<br/> 

                                <form class="forms-sample" action="UpdateAccountServlet" method="post">
                                    <div class="form-group">
                                       ID: <input type="text" value="${user.userId}" class="form-control" id="exampleInputName1" placeholder="aaaaaaaa" name="userId"/>
                                        <!--<input type="text" value="${user.userId}" class="form-control" id="exampleInputName1" placeholder="Name" name="ID" disabled=""/>-->
                                        <label for="exampleInputName1">UserName</label>
                                        <input type="text" value="${user.userName}" class="form-control" id="exampleInputName1" placeholder="Name" name="userName" disabled=""/>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail3">Full Name</label>
                                        <input type="text" value="${user.fullName}" class="form-control" id="exampleInputEmail3" placeholder="Full Name" name="fullName"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleSelectGender">Gender</label>
                                        <select class="form-control" id="exampleSelectGender" name="gender">
                                            <option value="" disabled selected hidden>Select Gender</option>
                                            <option
                                                <c:if test="${user.gender == false}"> 
                                                    selected="selected"
                                                </c:if> name="gender" value="false">
                                                FeMale</option>

                                            <option
                                                <c:if test="${user.gender == true}"> 
                                                    selected="selected"
                                                </c:if> name="gender" value="true">
                                                Male</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-group">
                                            <label for="exampleSelectGender">ROLE</label>
                                            <select class="form-control" id="exampleSelectGender" name="role">
                                                <option value="" disabled selected hidden>Select Role</option>
                                                <option value="ROLE_user" <c:if test="${user.role =='ROLE_user'}">
                                                        selected="selected"
                                                    </c:if>>
                                                    User</option>
                                                <option value="ROLE_member" <c:if test="${user.role =='ROLE_member'}">
                                                        selected="selected"
                                                    </c:if>>
                                                    Member</option>
                                                <option value="ROLE_admin" <c:if test="${user.role =='ROLE_admin'}">
                                                        selected="selectd"
                                                    </c:if>>
                                                    Admin </option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail3">Phone</label>
                                        <input type="text" value="${user.phone}" class="form-control" id="exampleInputEmail3" placeholder="Phone" name="phone"/>
                                    </div><div class="form-group">
                                        <label for="exampleInputEmail3">Address</label>
                                        <input type="text" value="${user.address}" class="form-control" id="exampleInputEmail3" placeholder="Address" name="address"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword4">Password</label>
                                        <input type="text" value="${user.password}" class="form-control" id="exampleInputPassword4" placeholder="Password"  name="password" required=""/>
                                    </div>
                                    <button type="submit" class="btn btn-primary mr-2"> Submit </button>
                                    <button class="btn btn-light"><a href="UserInAdminServlet">Cancel</a></button>
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