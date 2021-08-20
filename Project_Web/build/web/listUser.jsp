<%-- 
    Document   : listUser
    Created on : Jun 20, 2021, 1:37:35 PM
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
                    <form action="DeleteAccountServlet" method="post">
                        <div class="col-lg-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-sm-7">
                                            <h5>List user</h5>
                                            <p class="text-muted"> Show overview jan 2018 - Dec 2019 <a class="text-muted font-weight-medium pl-2" href="#"><u>See Details</u></a>
                                            </p>
                                        </div>
                                        <div class="col-sm-5 text-md-right">
                                            <button type="submit"  class="btn btn-icon-text mb-3 mb-sm-0 btn-inverse-primary font-weight-normal">
                                                <i class="mdi mdi-email btn-icon-prepend"></i>Delete</button>
                                            <button type="button" class="btn btn-icon-text mb-3 mb-sm-0 btn-inverse-primary font-weight-normal">
                                                    <a href="AddNewAccountServlet"> <i class="mdi mdi-email btn-icon-prepend"></i>Add new Account </a> </button>
                                        </div>
                                    </div>

                                    <div class="table-responsive">
                                        <table class="table table-striped">
                                            <thead>
                                                <tr>
                                                    <th>
                                                        <label class="form-check-label">
                                                            <input type="checkbox" class="form-check-input" /></label>
                                                    </th>
                                                    <th>User ID</th>
                                                    <th>User Name</th>
                                                    <th>Full name</th>
                                                    <th>Phone</th>
                                                    <th>Address</th>
                                                    <th>Gender</th>
                                                    <th>Role</th>
                                                    <th>Update account</th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items="${requestScope.listUser}" var="l">
                                                    <tr>
                                                        <td>
                                                            <label class="form-check-label">
                                                                <input type="checkbox" class="form-check-input" value="${l.userId}" name="userId"/></label>
                                                        </td>
                                                        <td>${l.userId}</td>
                                                        <td>${l.userName}</td>
                                                        <td>${l.fullName}</td>
                                                        <td>${l.phone}</td>
                                                        <td>${l.address}</td>
                                                        <td>
                                                            <c:choose>
                                                                <c:when test="${l.gender == true}">
                                                                    Male
                                                                </c:when>
                                                                <c:otherwise>
                                                                    Female
                                                                </c:otherwise>
                                                            </c:choose>
                                                                    
                                                                    <c:if test = "${salary > 2000}">
         <p>My salary is:  <c:out value = "${salary}"/><p>
      </c:if>
                                                                    
                                                        </td>
                                                        <td>${l.role}</td>
                                                        <td><label class="badge badge-warning" ><a href="UpdateAccountServlet?userId=${l.userId}">Update</a></label></td>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>               
        </div>
    </div>
</body>
</html>
