<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style>
	    ul.navigation li{
			display : inline-block; padding:0;margin:0}
		}
		
		ul.navigation li a{
		text-decoration: none; 
		padding: 5px; 
		}
	</style>
</head>
<body>
	<div class="container">
	
		<div class="header">
			<jsp:include page="header.jsp"/>
		</div>
		
		<div class="body">
			<form action="SaveProduct">

			<table>
				<th> Please Provide the Product Details: </th>
				
				<tr> <td> Product id</td>
				<td> <input type="text" id="idtxt" name="idtxt"/> </td>
				</tr>
				
				<tr> <td> Product Name</td>
				<td> <input type="text" id="nametxt" name="nametxt"/> </td>
				</tr>
				
				<tr> <td> Product Description</td>
				<td> <textarea id="desctxt" name="desctxt"> </textarea> </td>
				</tr>
				
				<tr> <td colspan ="2" align="right"> <input type="submit" value="RegisteredProduct"/></td> </tr>
			</table>
			
			</form>
		</div>
		
		<div class="footer">
			<p> &copy; 2024, LPU</p>
		</div>
	
	</div>
</body>
</html>