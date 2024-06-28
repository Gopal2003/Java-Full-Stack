<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Welcome to Student DashBoard</h2>
	
	<%
	
	String data = request.getParameter("student");
	
	session.setAttribute("sessionkey",data);
	
	out.println("Session Stored Successfully!");
	
	String sessionData = (String)session.getAttribute("sessionkey");
	out.println("Hi " + sessionData + " !");
	%>
</body>
</html>