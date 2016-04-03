<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
            <link rel="stylesheet" type="text/css" href="styles/mainStyle.css"/>
        </head>
    <body>
           <header>
            <div class = "header">
                <nav>
                    <a href="login">login</a>  <c:if test="${sessionScope.userName == Guest}">| <a href="registration">registartion</a> | </c:if> |
                    <a href="news">news</a> | <c:if test="${sessionScope.userName != Guest}">| <a href="favorites">favorites</a> </c:if> |  Hello, ${sessionScope.userName}  <c:if test="${sessionScope.userName != Guest}"> |  <a href="logOut">logOut</a>  </c:if> 
                </nav>
            </div>
        </header>
        <div class = "mainDiv">
            <form action="registration" method="post">
                <p><strong>e-mail:</strong>  <br>
                <input maxlength="50" size="50" name="email"></p> <br>
                <p><strong>login:</strong>  <br>
                <input maxlength="50" size="50" name="login"></p> <br>
                <p><strong>password:</strong>  <br>
                <input type="password" maxlength="50" size="50" name="password"></p><br>
                <br>
                <p><input type="submit"></p>
            </form>
        </div>
    </body>
</html>