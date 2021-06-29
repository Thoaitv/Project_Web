<%-- 
    Document   : headerAdmin
    Created on : Jun 20, 2021, 2:32:31 PM
    Author     : thoai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="page-header flex-wrap">
            <h3 class="mb-0"> Hi, welcome back! <span class="pl-0 h6 pl-sm-2 text-muted d-inline-block"></span>
            </h3>
            <div class="d-flex">
                <!-- <button type="button" class="btn btn-sm bg-white btn-icon-text border">
               <i class="mdi mdi-email btn-icon-prepend"></i> Email </button>-->
                <button type="button" class="btn btn-sm bg-warning btn-icon-text border ml-3"><a href="HomeAdminServlet">Home</a> </button>
                <button type="button" class="btn btn-sm bg-white btn-icon-text border ml-3">
                    <i class="mdi mdi-account-circle btn-icon-prepend"></i>Welcome ${sessionScope.userName.userName}</button>
                    <button type="button" class="btn btn-sm ml-3 btn-success"><a href="LogoutServlet">Đăng xuất</a> </button>
            </div>
        </div>
        <div class="row">
            <div class="col-xl-3 col-lg-12 stretch-card grid-margin">
                <div class="row">
                    <a class="col-xl-12 col-md-6 stretch-card grid-margin grid-margin-sm-0 pb-sm-3" href="UserInAdminServlet" style="text-decoration:none ">
                        <div class="card bg-warning">
                            <div class="card-body px-3 py-4">
                                <div class="d-flex justify-content-between align-items-start">
                                    <div class="color-card">
                                        <p class="mb-0 color-card-head">User</p>
                                        <h2 class="text-white">${requestScope.countUser}<span class="h5">   User</span>
                                        </h2>
                                    </div>
                                    <i class="card-icon-indicator mdi mdi-account-circle bg-inverse-icon-warning"></i>
                                </div>
                                <h6 class="text-white">18.33% Since last month</h6>
                            </div>
                        </div>
                    </a>
                    <a class="col-xl-12 col-md-6 stretch-card grid-margin grid-margin-sm-0 pb-sm-3" href="ProductInAdminServlet" style="text-decoration:none ">
                        <div class="card bg-danger">
                            <div class="card-body px-3 py-4">
                                <div class="d-flex justify-content-between align-items-start">
                                    <div class="color-card">
                                        <p class="mb-0 color-card-head">Product</p>
                                        <h2 class="text-white">${requestScope.countProduct}<span class="h5">   Items</span>
                                        </h2>
                                    </div>
                                    <i class="card-icon-indicator mdi mdi-cube-outline bg-inverse-icon-danger"></i>
                                </div>
                                <h6 class="text-white">13.21% Since last month</h6>
                            </div>
                        </div>
                    </a>
                    <a class="col-xl-12 col-md-6 stretch-card grid-margin grid-margin-sm-0 pb-sm-3" href="OrderInAdminServlet" style="text-decoration:none ">
                        <div class="card bg-primary">
                            <div class="card-body px-3 py-4">
                                <div class="d-flex justify-content-between align-items-start">
                                    <div class="color-card">
                                        <p class="mb-0 color-card-head">Orders</p>
                                        <h2 class="text-white"> ${requestScope.countOrder} <span class="h5"> Orders</span>
                                        </h2>
                                    </div>
                                    <i class="card-icon-indicator mdi mdi-cart bg-inverse-icon-primary"></i>
                                </div>
                                <h6 class="text-white">67.98% Since last month</h6>
                            </div>
                        </div>
                    </a>
                    <a class="col-xl-12 col-md-6 stretch-card pb-sm-3 pb-lg-0" href="#" style="text-decoration:none ">
                        <div class="card bg-success">
                            <div class="card-body px-3 py-4">
                                <div class="d-flex justify-content-between align-items-start">
                                    <div class="color-card">
                                        <p class="mb-0 color-card-head">Review</p>
                                        <h2 class="text-white">2368</h2>
                                    </div>
                                    <i class="card-icon-indicator mdi mdi-message-text bg-inverse-icon-success"></i>
                                </div>
                                <h6 class="text-white">20.32% Since last month</h6>
                            </div>
                        </div>
                    </a>
                </div>
            </div>
            <div class="col-xl-9 stretch-card grid-margin">
                <div class="card">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-sm-7">
                                <h5>Business Survey</h5>
                                <p class="text-muted"> Show overview jan 2018 - Dec 2019 <a class="text-muted font-weight-medium pl-2" href="#"><u>See Details</u></a>
                                </p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-4">
                                <div class="card mb-3 mb-sm-0">
                                    <div class="card-body py-3 px-4">
                                        <p class="m-0 survey-head">Today Earnings</p>
                                        <div class="d-flex justify-content-between align-items-end flot-bar-wrapper">
                                            <div>
                                                <h3 class="m-0 survey-value">$5,300</h3>
                                                <p class="text-success m-0">-310 avg. sales</p>
                                            </div>
                                            <div id="earningChart" class="flot-chart"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-4">
                                <div class="card mb-3 mb-sm-0">
                                    <div class="card-body py-3 px-4">
                                        <p class="m-0 survey-head">Product Sold</p>
                                        <div class="d-flex justify-content-between align-items-end flot-bar-wrapper">
                                            <div>
                                                <h3 class="m-0 survey-value">$9,100</h3>
                                                <p class="text-danger m-0">-310 avg. sales</p>
                                            </div>
                                            <div id="productChart" class="flot-chart"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-4">
                                <div class="card">
                                    <div class="card-body py-3 px-4">
                                        <p class="m-0 survey-head">Today Orders</p>
                                        <div class="d-flex justify-content-between align-items-end flot-bar-wrapper">
                                            <div>
                                                <h3 class="m-0 survey-value">$4,354</h3>
                                                <p class="text-success m-0">-310 avg. sales</p>
                                            </div>
                                            <div id="orderChart" class="flot-chart"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
