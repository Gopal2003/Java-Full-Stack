<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h2> Server Side Session Management Using JSP</h2>
		<hr/>
		
		<form action="storedata.jsp">
		
			Enter Data to Store in Session : 
			<input type="text" id="txtdata" name="txtdata"/>
			
			<input type="submit"/>
		
		</form>
		
		<a href="viewsession.jsp"> Click Here to View Session Data</a>
</body>
</html>