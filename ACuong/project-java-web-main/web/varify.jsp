<%-- 
    Document   : varify
    Created on : Mar 17, 2021, 12:33:28 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form action="verify" method="POST">
            <h1>Verify Your Account!</h1>
            <input type="text" name="code"/>
            <input type="submit" value="Verify"/>
        </form>
    </body>
</html>
