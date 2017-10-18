<%-- 
    Document   : product
    Created on : Oct 17, 2017, 3:13:18 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman Product</title>
    </head>
    <body class="container">
        <h1>Product: <a href="../shoppingcart">${cart.size()} </a></h1>
        
        <c:forEach var="p" items="${prod}">
            <p><a href="${p.productId}">${p.productName}</a></p>
                        
        </c:forEach>
    </body>
</html>
