<%-- 
    Document   : productdetail
    Created on : Oct 17, 2017, 3:19:13 PM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="CFtcEpHbNJ01yAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        
        <title>JSP Page</title>
    </head>
     
    <body>
        <h1>Halaman Product</h1>
        
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nama Produk</th>
                    <th>Harga</th>
                </tr>
            </thead>
        
            <tbody>
                <tr>
                   
            <td>${prod.productId}</td>
            <td>${prod.productName} </td>
            <td>${prod.harga}</td>
        </tr>
    </tbody>
        </table>
    
        
            <a href="addToCart"><button>addCart</button></a>
            
      
    </body>
</html>
