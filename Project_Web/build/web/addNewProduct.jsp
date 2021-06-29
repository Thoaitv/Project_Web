<%-- 
    Document   : createNewProduct
    Created on : Jun 20, 2021, 1:42:15 PM
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
                                <h4 class="card-title">Form Add a new Product</h4>
                                <p class="card-description">(*) cannot empty</p>
                                <form class="forms-sample" action="AddNewProductServlet" method="post">
                                    <div class="form-group">
                                        <label for="exampleInputName1">Product Name</label>
                                        <input type="text" class="form-control" id="exampleInputName1" name="productName" placeholder="Product Name" />
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleSelectGender">Category</label>
                                        <select class="form-control" id="exampleSelectGender" name="categoryId">
                                            <option value="" disabled selected hidden>Select category</option>
                                            <c:forEach items="${requestScope.listCategory}" var="l">
                                                <option value="${l.categoryId}">${l.categoryName}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputName1">Price</label>
                                        <input type="number" class="form-control" id="exampleInputName1" name="price" placeholder="Price" />
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputName1">Quantity</label>
                                        <input type="number" class="form-control" id="exampleInputName1" name="quantity" placeholder="Quantity" />
                                    </div>

                                    <div class="form-group">
                                        <label for="exampleInputName1">Image</label>
                                        <input type="text" class="form-control" id="exampleInputName1" name="image" placeholder="Image" />
                                    </div>

                                    <div class="form-group">
                                        <label>File upload</label>
                                        <input type="file" name="img[]" class="file-upload-default" />
                                        <div class="input-group col-xs-12">
                                            <input type="text" class="form-control file-upload-info" disabled placeholder="Upload Image" />
                                            <span class="input-group-append">
                                                <button class="file-upload-browse btn btn-primary" type="button"> Upload </button>
                                            </span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleTextarea1">Textarea</label>
                                        <textarea
                                            class="form-control"
                                            id="exampleTextarea1" 
                                            name="productDescription"
                                            rows="4">
                                        </textarea>
                                    </div>
                                    <button type="submit" class="btn btn-primary mr-2"> Submit </button>
                                    <button class="btn btn-light"><a href="ProductInAdminServlet">Cancel</a></button>
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

