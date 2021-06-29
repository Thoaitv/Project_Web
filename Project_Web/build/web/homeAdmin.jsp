<%-- 
    Document   : homeAdmin
    Created on : Jun 19, 2021, 4:51:35 PM
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
                    <div class="row">


                        <!-- CHoox nayf -->
                        <div class="col-xl-12  col-sm-12 col-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body px-0 overflow-auto">
                                    <h4 class="card-title pl-4">Purchase History</h4>
                                    <div class="table-responsive">
                                        <table class="table">
                                            <thead class="bg-light">
                                                <tr>
                                                    <th>Product Name</th>
                                                    <th>User Name</th>
                                                    <th>Order Id</th>
                                                    <th>Product Id</th>                                   
                                                    <th>Price</th>
                                                    <th>Quantity</th>
                                                    <th>Amount</th>
                                                    <th>Date order</th>
                                                    <th>Status</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items="${requestScope.listOrder}" var="o">
                                                    <tr>
                                                        <td>
                                                            <div class="d-flex align-items-center">
                                                                <img src="images/products/${o.product.image}" alt=""/>
                                                                <div class="table-user-name ml-3">
                                                                    <p class="mb-0 font-weight-medium">${o.product.productName}</p>
                                                                    <small> Payment on hold</small>
                                                                </div>
                                                            </div>
                                                        </td>

                                                        <td>${o.user.userName}</td>
                                                        <td>${o.orderId}</td>
                                                        <td>${o.product.productId}</td>
                                                        <td>${o.product.price}</td>
                                                        <td>${o.quantity}</td>
                                                        <td>${o.quantity * o.product.price}</td>
                                                        <td>${o.orderDate}</td>
                                                        <td>
                                                            <!--UpdateStatusOrderServlet-->
                                                            <c:if test="${o.status eq 'success'}">
                                                                <div class="badge badge-inverse-success"><a>SUCCESS</a> </div>
                                                            </c:if>
                                                            
                                                            <c:if test="${o.status eq 'waiting_line'}">
                                                                <div class="badge badge-inverse-success"><a href="UpdateStatusOrderServlet?orderId=${o.orderId}">ACCEPT</a> </div>
                                                            </c:if>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                    <a class="text-black mt-3 d-block pl-4" href="#">
                                        <span class="font-weight-medium h6">View all order history</span>
                                        <i class="mdi mdi-chevron-right"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>               
            </div>
        </div>
    </body>

</html>