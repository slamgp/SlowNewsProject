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
                    <a href="login">login</a> | <a href="registration">registartion</a> |
                    <a href="news">news</a> | <a href="favorites">favorites</a> |  Hello, ${sessionScope.userName}
                </nav>
            </div>
        </header>
	</body>
</html>