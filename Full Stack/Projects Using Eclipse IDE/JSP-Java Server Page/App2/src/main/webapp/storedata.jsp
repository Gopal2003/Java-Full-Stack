<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h2> Server Side Session Management </h2>
		<hr/>
		
		<%
		String data = request.getParameter("txtdata");
		
		// We will use session Object of HttpSession to store data in Server Memory.
		session.setAttribute("sessionkey", data);
		%>
		
		<%= "Session Has Been Successfully Set!" %>
		
		<br/>
		
		<a href='index.jsp'>Click Here to go Back to Home!</a>
</body>
</html>