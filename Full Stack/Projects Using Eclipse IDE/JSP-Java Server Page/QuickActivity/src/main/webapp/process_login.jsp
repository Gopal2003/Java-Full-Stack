<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%--Quick Activity :
--------------------------------
Design a Login Form Containing UserName and Password!
and 2 Radio Button Displaying
1. Student
2. Guest
------------------------------------------------------------------
there are 2 predefined roles to be added when checking credentials.

the username to be stored in Session!

As per the Role Chosen the user should be redirected to
if student "studentdashboard.jsp"
if Guest "guest.jsp"

the Username will be shown on each page i.e studentdashbaord.jsp and guest.jsp


if the Index.jsp is Accessed or Reloaded in a New Tab , you must define a tracker if the
user has already logged in if that is the case the user should be directly redirected to
the appropriate page i.e studentdashboard.jsp or guest.jsp

Create a logout page and provide link in each studentdashboard.jsp and guest.jsp to
logout or delete the session. --%>
		<%
			String usertype = request.getParameter("usertype");
		
			if(usertype.equals("student") )
		
		%>
</body>
</html>