<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2> Welcome My Friend Welcome</h2>
	<hr/>
	
	<form action="process_login.jsp">
	<label for="txtusername">Username: </label>
	<input type="text" id="txtusername" name="txtusername"/>
	
	<br/> <br/>
	
	<label for="txtpassword">Password: </label>
	<input type="password" id="txtpassword" name="txtpassword"/>
	
	<br/> <br/>
	
		<input type="radio" id="student" name="usertype" value="student"/>
		<label for="student">Student </label>
	
	<br/>
	
		<input type="radio" id="guest" name="usertype" value="guest"/>
		<label for="guest">Guest </label>
	
	<br/> <br/>
	
	<input type="submit" value="Login">
	
	</form>
	

	
	
	
	
</body>
</html>