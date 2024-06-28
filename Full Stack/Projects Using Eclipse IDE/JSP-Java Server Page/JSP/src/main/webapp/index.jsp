<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style>
			.green{
				background-color: green;
				color: yellow;
				padding: 3px;
			
			}
	
	</style>
</head>
<body>
	
	<h2> Handling Forms Data using JSP</h2>
	<hr/>
	<form action="greet.jsp">
		<table>
		<tr>
			<td><label for="txtusername"> Username: </label></td>
			<td><input type="text" id="txtusername" name="txtusername"/></td>
		</tr>
		
		<tr>
			<td><label for="txtmessage"> Message: </label></td>
			<td><textarea type="text" id="txtmessage" name="txtmessage"></textarea></td>
		</tr>
		
		<tr>
			<td colspan="2" align="right"><input type="submit"/></td>
			
		</tr>
		
		
		</table>
	
	</form>
		<%-- out is object of JSP Writer which is similar to PrintWriter. All objects in JSP are preinitialized and pre provided. --%>
	<%-- 	
	<%
		String msg = "This is Printed using JSP Scriplet";
		out.println(msg);
		
		for(int i = 0; i <= 10; i++)
		{
			out.println("<p class='green'> Counting from 1 to 10, Now At " + i +" </p> <br/>");
		}
		
	%>
	--%>
</body>
</html>