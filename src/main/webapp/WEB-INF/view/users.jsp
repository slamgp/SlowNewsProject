<%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SLOW NEWS</title>
        <link rel="stylesheet" type="text/css" href="styles/mainStyle.css"/>
    </head>
    <body>
		<c:set var="myName" value="USERS"/>
		<h1>${myName}</h1>
		<c:forEach var="user" items="${users}">
		        <p> ${user.email}, ${user.login}, ${user.password}<p>
		</c:forEach>
    </body>
</html>
 