<%-- 
    Document   : agecalculator
    Created on : Jan 16, 2022, 5:22:53 PM
    Author     : JonSZR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action ="age" method="post">
            <label for = "age">Enter your age: </label>
            <input type ="number"  name = "age" id = "age"><br>
            <button type="submit">Submit</button>
        </form>
        ${message}
        <a href ="/calculator/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
