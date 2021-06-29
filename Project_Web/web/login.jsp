<%-- 
    Document   : login
    Created on : Jun 17, 2021, 9:08:54 PM
    Author     : thoai
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/authentication.css" rel="stylesheet" type="text/css"/>
        <script src='https://kit.fontawesome.com/a076d05399.js'></script>
    </head>
    <body>
        <form action="LoginServlet" method="post">
            <div class="auth-form">
                <div class="auth-form-container">
                    <div class="auth-form-header">
                        <h3 class="auth-form-title">Login</h3>
                        <c:if test="${userMessage!= null}">
                            <p class="text-danger">${userMessage}</p>
                        </c:if>
                        <c:if test="${passMessage!= null}">
                            <p class="text-danger">${passMessage}</p>
                        </c:if>
                        <p style="margin-top: -10px; color: green; margin-left: 2px;">${requestScope.messageSuccess}</p>

                        <a href="register.jsp" class="auth-form-subtitle">Register</a>
                    </div>

                    <div class="auth-form-form">
                        <div class="auth-form-group">
                            <input class="auth-form-input" type="text" name="username"
                                   placeholder="Username" required="required" />
                        </div>
                        <div class="auth-form-group">
                            <input class="auth-form-input" type="password" name="password"
                                   placeholder="Password" required="required" />
                        </div>
                        <p style="margin-top: -10px; color: red; margin-left: 2px;">${requestScope.message}</p>
                        <div class="" style="display: flex; justify-content: space-between; margin-bottom: 20px; margin-top: -10px;">
                            <div><input type="checkbox" name="remember"/> Remember me</div>
                            <div><a href="#">Forgot password</a></div>
                        </div>
                    </div>

                    <div class="auth-form-controls">
                        <a href="HomeServlet" class="btn">Back</a>
                        <button type="submit" class="btn">Login</button>
                    </div>
                </div>
                <div class="auth-form-social">
                    <a href="#" class="btn-social-fb"><i class='fab' style="font-size: 20px;">&#xf09a;</i> Login With Facebook </a>
                    <a href="#" class="btn-social-gg"><i class='fab' style='font-size:20px; color: tomato'>&#xf2b3;</i> Login With Google </a>
                </div>
            </div>
        </form>
    </body>
</html>