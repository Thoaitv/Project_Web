<%-- 
    Document   : listOrder
    Created on : Jun 20, 2021, 2:14:59 PM
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
                                        <button type="button" class="btn btn-icon-text mb-3 mb-sm-0 btn-inverse-primary font-weight-normal">
                                            <i class="mdi mdi-email btn-icon-prepend"></i>Delete</button>
                                        <button type="button" class="btn btn-icon-text mb-3 mb-sm-0 btn-inverse-primary font-weight-normal">
                                            <a href="createNewProduct.jsp"> <i class="mdi mdi-email btn-icon-prepend"></i>View All Order </a> </button>
                                    </div>
                                </div>

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
                                                        <c:if test="${o.status eq 'success'}">
                                                                <div class="badge badge-inverse-success">SUCCESS</div>
                                                            </c:if>
                                                            
                                                            <c:if test="${o.status eq 'waiting_line'}">
                                                                <div class="badge badge-inverse-success"><a href="UpdateStatusOrderServlet?orderId=${o.orderId}">ACCEPT</a> </div>
                                                            </c:if>
                                                    </td>
                                                    <!-- <td>
                                                     <div class="badge badge-inverse-success"> Declined </div>
                                                     </td>-->
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>

                                <nav aria-label="Page navigation example">
                                    <ul class="pagination">
                                        <li class="page-item">
                                            <a class="page-link" href="#" aria-label="Previous">
                                                <span aria-hidden="true">&laquo;</span>
                                                <span class="sr-only">Previous</span>
                                            </a>
                                        </li>

                                        <c:forEach begin="1" end="${requestScope.totalPage}" var="i">
                                            <li class="page-item
                                                <c:if test="${requestScope.pageIndex == i}">
                                                    active
                                                </c:if>">
                                                <c:if test="${requestScope.page == 1}">
                                                    <a class="page-link" href="OrderInAdminServlet?pageIndex=${i}">${i}</a>
                                                </c:if>
                                            </li>
                                        </c:forEach>

                                        <li class="page-item">
                                            <a class="page-link" href="#" aria-label="Next">
                                                <span aria-hidden="true">&raquo;</span>
                                                <span class="sr-only">Next</span>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>

                            </div>
                        </div>
                    </div>
                </div>
            </div>               
        </div>
    </div>
</body>
</html>
