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
	String name = request.getParameter("txtusername");
	String password = request.getParameter("txtpassword");
	
	session.setAttribute("sessionkey",name);
	%>
	<%= "Session Stored Successfully!" %>
	
	<br/>
	<%
	out.println("Hi " + name + " !");
	
	%>
	
	
</body>
</html>