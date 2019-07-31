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
<div>
<table>
<tr>
<th>Exam Id</th>
<th>Exam Name</th>
<th>Duration (Minities)</th>
<th>Number of Question</th>
<th>Pass %</th>
<th>Description</th>
<th>Schedule</th>
<th>Update</th>
<th>Remove</th>
</tr>
 <c:forEach items="${al}" var="p">
 <tr>
<td>${p.examId}</td>
<td>${p.examName}</td>
<td>${p.duration }</td>
<td>${p.numberOfQuestion }</td>
<td>${p.passPercentage }</td>
<td>${p.description}</td>
 <td><a href="schedule?id=${p.examId}">Schedule Exam</a></td>
 <td><a href="editexam?id=${p.examId}">Update Exam</a></td>
 <td><a href="removeexam?id=${p.examId}">Remove Exam</a></td>
 
 </tr>
 </c:forEach>
</table>
</div>
</body>
</html>