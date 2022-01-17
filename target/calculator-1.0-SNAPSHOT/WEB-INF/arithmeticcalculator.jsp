<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 16, 2022, 6:56:42 PM
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
        <h1>Arithmetic Calculator</h1>
        <form action ="arithmetic" method ="post">
            <label for ="fvalue">First:</label>
            <input type="number" name="fvalue" id="fvalue"><br>
            <label for ="svalue">Second:</label>
            <input type="number" name ="svalue" id="svalue"><br>
            <input type="submit" name="op" value="+">
            <input type="submit" name="op" value="-">
            <input type="submit" name="op" value="*">
            <input type="submit" name="op" value="%"><br>
<!--            <button type="submit" name="op" id="add">+</button>
            <button type="submit" name="op" id="minus">-</button>
            <button type="submit" name="op" id="multi">*</button>
            <button type="submit" name="op" id="divide">%</button>-->
        </form>
        ${message}
        <a href ="/calculator/age">Age Calculator</a>
    </body>
</html>
