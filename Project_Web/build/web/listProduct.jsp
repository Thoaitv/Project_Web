<%-- 
    Document   : listProduct
    Created on : Jun 20, 2021, 12:45:51 PM
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
        <form action="DeleteProductServlet" method="post">

            <div class="container-scroller">
                <div class="container-fluid page-body-wrapper">
                    <div class="content-wrapper pb-0">
                        <%@include file="headerAdmin.jsp" %>
                        <div class="row">

                            <!-- CHoox nayf -->
                            <div class="col-lg-12 grid-margin stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-sm-7">
                                                <h5>List Product</h5>
                                                <p class="text-muted"> Show overview jan 2018 - Dec 2019 <a class="text-muted font-weight-medium pl-2" href="#"><u>See Details</u></a>
                                                </p>
                                            </div>
                                            <div class="col-sm-5 text-md-right">
                                                <button type="submit" class="btn btn-icon-text mb-3 mb-sm-0 btn-inverse-primary font-weight-normal">
                                                    <i class="mdi mdi-email btn-icon-prepend"></i>Delete</button>
                                                <button type="button" class="btn btn-icon-text mb-3 mb-sm-0 btn-inverse-primary font-weight-normal">
                                                    <a href="AddNewProductServlet"> <i class="mdi mdi-email btn-icon-prepend"></i>Add new Product </a> </button>
                                            </div>
                                        </div>

                                        <div class="table-responsive">
                                            <table class="table table-striped">
                                                <thead>
                                                    <tr>
                                                        <th>
                                                            <label class="form-check-label">
                                                                <input type="checkbox" class="form-check-input" id="checkAll" /></label>
                                                        </th>
                                                        <th>Product ID</th>
                                                        <th>Product Name</th>
                                                        <th>Price</th>
                                                        <th>Quantity</th>
                                                        <th>Image</th>
                                                        <th>View item</th>
                                                        <th>Update Product</th>

                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach items="${requestScope.listProduct}" var="p">
                                                        <tr>
                                                            <td> 
                                                                <label class="form-check-label" >
                                                                    <input type="checkbox" value="${p.productId}" name="productId" class="form-check-input"/></label>
                                                            </td>
                                                            <td>${p.productId}</td>
                                                            <td>${p.productName}</td>
                                                            <td>${p.price}</td>
                                                            <td>${p.quantity}</td>
                                                            <td class="py-1">
                                                                <img src="images/products/${p.image}" alt=""/>
                                                            </td>
                                                            <td>
                                                                <i class="mdi mdi-eye" style="font-size:1.5rem; padding-left: 10px; "></i>
                                                            </td>
                                                            <td style="padding-left: 3rem;">
                                                                <label class="badge badge-danger"><a  style="color: #1b00ffe3;" href="UpdateProductServlet?productId=${p.productId}">Update</a></label>
                                                            </td><!--
                                                            <td>
                                                                <label class="badge badge-warning">Đợi</label>
                                                            </td>-->
                                                        </tr>
                                                    </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!--                        <script>
                                                        let userSelection = document.getElementsByClassName('checkbox');
                                                        let checkAll = document.getElementById('checkAll');
                            
                                                        checkAll.addEventListener('click', () => {
                                                            if (checkAll.checked == true) {
                                                                for (let i = 1; i < userSelection.length; i++) {
                                                                    document.getElementById(i).checked = true;
                                                                }
                                                            } else {
                                                                for (let i = 1; i < userSelection.length; i++) {
                                                                    document.getElementById(i).checked = false;
                                                                }
                                                            }
                                                        });
                                                    </script>-->
                        </div>
                    </div>               
                </div>
        </form>

    </body>
</html>
