<%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <title>SLOW NEWS</title>
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
		    <form action="login" method="post">
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