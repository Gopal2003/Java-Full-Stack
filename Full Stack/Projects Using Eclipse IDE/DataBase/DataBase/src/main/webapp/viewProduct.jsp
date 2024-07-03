<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		ul.navigation{
			list-style: none;
		}
		
		ul.navigation li { display: inline-block; padding: 0; margin:0;}
		
		ul.navigation li a {padding: 5px; color: teal;}
		
		
		
	</style>
</head>
<body>
		<div class="container">
			<div class="header">
			 <jsp:include page="header.jsp"/>
			</div>
		
			<div class="body">
			<%! ResultSet rs=null; %>
				<%
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");// Driver is a software program used to establish the connection between database and application 
					
					//Step 2: Create the connections (java.sql)
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/walmartt","root","12092003@Gopal");
					
					
					//Step 3 : Create Object of Statement interface to Execute Query
					
					String query = "select * from products";
					Statement stmt = conn.createStatement(); // Statemenet is used when we don't have any parameter.
					
					rs = stmt.executeQuery(query);
			
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				%>
					<table cellpadding="8" border="2" cellspacing="2">
					<th> ProductID</th>
					<th> Name</th>
					<th> Description</th>
					<%
						while(rs.next())
						{
							out.write("<tr>");
							out.write("<td>" + rs.getInt(1) + "</td>");
							out.write("<td>" + rs.getString(2) + "</td>");
							out.write("<td>" + rs.getString(3) + "</td>");
							out.write("</tr>");
						}
					%>
					</table>
				
				
				
			</div>
			
			<div class="container">
				<p> &copy; 2024, LPU
			
			</div>
		</div>
		
</body>
</html>