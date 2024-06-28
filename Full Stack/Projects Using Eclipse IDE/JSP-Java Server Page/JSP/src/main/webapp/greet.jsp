<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> Greetings!</h3>
	<hr/>
	<%--<% %> these are called Scriplet --%>
	<%
		String username = request.getParameter("txtusername");
		String message = request.getParameter("txtmessage");
		
		String line = String.format("Welcome! %s, Your Message is %s ", username,message);
		
		out.println(line);
		
		out.println("<hr/>");
		
	%>
	
	<%-- out.println() and <%= %> are alternative to each other  --%>
	
	<p> This is JSP Expression TAG! this is used for Printing ONLY!</p>
	
	Current Time: <%= java.util.Calendar.getInstance().getTime() %>

	
	<p>This is JSP Declaration Tag! used for Declaring Variables & Objects.
	
		<%! String dummy="Earth is Not Flat"; %>
		<br/> 
		<%=dummy %>
	</p>
	
	
	<p> Here is Another Example of JSP Declaration TAG</p>
	
	<%!
		double getForce(int mass, double acc)
		{
		return (mass * acc);
		}
	
	%>
	
	<%= "Mass Provided: 5200 , Accelaration Provided: 9.8 , Force: " + getForce(5200,9.8) %>
</body>
</html>