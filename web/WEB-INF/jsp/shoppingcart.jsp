<%-- 
    Document   : shoppingcart
    Created on : Oct 18, 2017, 9:02:11 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <cartController:forEach items="${product}" var="p">
        <p>${p.productName}</p>
    </cartController:forEach>
    <a href="product"><button>Kembali</button></a>
    </body>
</html>
