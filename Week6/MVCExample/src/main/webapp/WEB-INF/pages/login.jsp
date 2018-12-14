<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Welcome</h1>
		<h2>Please Login</h2>
	</div>
	
	<c:if test="${ errorMessage != null }">
		<div><strong>${ errorMessage }</strong></div>
	</c:if>
	
	<form action="login" method="post">
		<input type="text" name="username" placeholder="Username"/>
		<br>
		<input type="text" name="password" placeholder="Password"/>
		<br>
		<input type="submit" value="login"/>
	</form>
</body>
</html>