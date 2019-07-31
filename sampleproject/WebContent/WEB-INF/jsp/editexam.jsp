<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<form action="./updateexam" method="post">
<input type="hidden" name="examid" value="${exam.examId }"><br><br>
Exam Name: <input type="text" name="examname" value="${exam.examName}"><br><br>
Duration: <input type="text" name="examduration" value="${exam.duration}"><br><br>
Number of Questions: <input type="text" name="examnoq" value="${exam.numberOfQuestion}"><br><br>
Pass %: <input type="text" name="epass" value="${exam.passPercentage}"><br><br>


Exam description: <input type="text" name="examdesc" value="${exam.description}"><br><br>

<input type="submit" value="Update exam">


</form>

</body>
</html>