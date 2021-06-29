<%-- 
    Document   : order
    Created on : Jun 19, 2021, 8:49:18 PM
    Author     : thoai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <!-- Basic -->

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Site Metas -->
        <title>ThewayShop - Ecommerce Bootstrap 4 HTML Template</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Site Icons -->
        <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
        <link rel="apple-touch-icon" href="images/apple-touch-icon.png">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Site CSS -->
        <link rel="stylesheet" href="css/style.css">
        <!-- Responsive CSS -->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/custom.css">

        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <c:if test="${sessionScope.user == null}">
            <a href="login.jsp" class="auth-form-subtitle">Login</a>
        </c:if>
        <c:if test="${sessionScope.user!=null}">
            <a class="cart" href="OrderServlet">Add to Cart</a>
            <!-- Start Main Top -->
            <%@include file="header.jsp" %>

            <!-- End Main Top -->

            <!-- Start Top Search -->
            <div class="top-search">
                <div class="container">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-search"></i></span>
                        <input type="text" class="form-control" placeholder="Search">
                        <span class="input-group-addon close-search"><i class="fa fa-times"></i></span>
                    </div>
                </div>
            </div>
            <!-- End Top Search -->

            <!-- Start All Title Box -->
            <div class="all-title-box">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <h2>Cart</h2>
                            <ul class="breadcrumb">
                                <li class="breadcrumb-item"><a href="#">Shop</a></li>
                                <li class="breadcrumb-item active">Cart</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End All Title Box -->

            <!-- Start Cart  -->
            <div class="cart-box-main">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="table-main table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Images</th>
                                            <th>Product Name</th>
                                            <th>Price</th>
                                            <th>Quantity</th>
                                            <th>Size</th>
                                            <th>Total</th>
                                            <th>Order date</th>
                                            <th>Status</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${requestScope.list}" var="o">
                                            <tr>
                                                <td class="thumbnail-img">
                                                    <a href="#">
                                                        <img class="img-fluid" src="images/products/${o.product.image}" alt="" />
                                                    </a>
                                                </td>
                                                <td class="name-pr">
                                                    <a href="#">
                                                        ${o.product.productName}
                                                    </a>
                                                </td>
                                                <td class="price-pr">
                                                    <p>${o.product.price}</p>
                                                </td>

                                                <td class="cart_quantity">
                                                    <div class="cart_quantity_button">
                                                        <input class="cart_quantity_input" value="${o.product.quantity}" type="text" name="quantity" value="" autocomplete="off" size="2" disabled="true">
                                                    </div>
                                                </td>
                                                <td class="order-size">
                                                    <p>S</p>
                                                </td>
                                                <td class="total-pr" style="font-weight:bold ">
                                                    <p>${o.product.price * o.quantity}</p>
                                                </td>
                                                <td class="order-date">
                                                    <p>${o.orderDate}</p>
                                                </td>

                                                <td class="order-status">
                                                    <c:if test="${o.status eq 'success'}">
                                                        <p style="font-weight: bold; color: blue; font-size: 1.5rem">${o.status}</p>
                                                    </c:if>
                                                    <c:if test="${o.status eq 'waiting_line'}">
                                                        <p style="font-weight: bold; color: red; font-size: 1.5rem">${o.status}</p>
                                                    </c:if>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </c:if>

        <!-- End Cart -->
        <!-- Start Footer  -->
        <%@include file="footer.jsp" %>

        <!-- End Footer  -->

        <!-- Start copyright  -->
        <div class="footer-copyright">
            <p class="footer-company">All Rights Reserved. &copy; 2018 <a href="#">ThewayShop</a> Design By :
                <a href="https://html.design/">html design</a></p>
        </div>
        <!-- End copyright  -->

        <a href="#" id="back-to-top" title="Back to top" style="display: none;">&uarr;</a>

        <!-- ALL JS FILES -->
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <!-- ALL PLUGINS -->
        <script src="js/jquery.superslides.min.js"></script>
        <script src="js/bootstrap-select.js"></script>
        <script src="js/inewsticker.js"></script>
        <script src="js/bootsnav.js."></script>
        <script src="js/images-loded.min.js"></script>
        <script src="js/isotope.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/baguetteBox.min.js"></script>
        <script src="js/form-validator.min.js"></script>
        <script src="js/contact-form-script.js"></script>
        <script src="js/custom.js"></script>
    </body>

</html>