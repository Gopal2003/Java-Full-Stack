<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div class = "header">
			<jsp:include page="header.jsp"/>
		</div>
		
		<div class="body">
		
			<%! ResultSet rs = null; %>
			
			<%
			
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/walmart","root","12092003@Gopal");
					String query = "select * from products";
					Statement stmt = conn.createStatement();
					rs = stmt.executeQuery(query);
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			%>
			
			<table cellspacing="5" border="0">
			<th> Product ID</th>
			<th> Name </th>
			<th> Description </th>
			<%
				while(rs.next())
				{
					out.write("<tr>");
					out.write("<td>" + rs.getInt(1) + "</td>");
					out.write("<td>" + rs.getString(2) + "</td>");
					out.write("<td>" + rs.getInt(3) + "</td>");
					out.write("</tr>");
				}
			
			%>
			
			</table>
		
		</div>
		
		<div class="footer">
			<p> &copy; 2024, LPU</p>
		</div>
</body>
</html>