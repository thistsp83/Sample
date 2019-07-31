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
<form action="./adduser" method="post">
Employee id: <input type="text" name="empid" required="required"><br><br>
User name: <input type="text" name="uname" required="required"><br><br>
Password: <input type="password" name="password" required="required"><br><br>
Re type password: <input type="password" name="rpass" required="required"><br><br>
Email id: <input type="text" name="email" required="required"><br><br>
Mobile Number: <input type="text" name="phone" required="required"><br><br>
Security Question: <select name="question" required="required">
<option value="Mother Name">Your Mother Name</option>
<option value="First School">Your First School Name</option>
<option value="Favorite Teacher">Your Favorite Teacher</option>
<option value="Favorite color">Your Favorite Color</option>
<option value="Crush">Your Crush</option>
<option value="Favorite Player">Your Favorite Player</option>
<option value="Favorite Actor">Your Favorite Actor</option>
</select><br><br>
Answer: <input type="text" name="answer" required="required"><br><br>
<input type="submit" value="Register">


</form>
</body>
</html>