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
<form action="addexamdetails">
Exam id<input type="text" name="eid"><br><br>
Exam name<input type="text" name="ename"><br><br>
Exam duration<input type="text" name="eduration"><br><br>
Number of Question<input type="text" name="enoq"><br><br>
Pass Percentage<input type="text" name="epass"><br><br>
Exam description<input type="text" name="edes"><br><br>
<input type="submit" value="Insert Exam">




</form>

</body>
</html>