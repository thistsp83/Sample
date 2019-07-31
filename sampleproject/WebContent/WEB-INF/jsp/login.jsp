<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<form action="./checkuser" method="post">
User name: <input type="text" name="uname"><br><br>
Password: <input type="text" name="password"><br><br>

<input type="submit" value="submit"><br><br>
<a href="forgetpassword">Forget Password</a>
</form>
</body>
</html>