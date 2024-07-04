<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Track Your GST Status</title>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
.full-width-card {
    width: 100%;
    height:500px%;
}
.left{
margin-left:200px;
}
.but{
background-color:#10518C;
color:white;
font-size:10px;
height:34px;
}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
    <div class="row justify-content-center mt-5">
        <div class="col-12 row-12">
            <div class="card full-width-card">
                    <h4>Track Your GST Status</h4>
               
                <div class="card-header">
                    <form action="CheckStatus.jsp">
                        <div class="form-group text-center">
                        <table>
                        <tr><td>
                            <label for="orderid">Enter Your Order-ID</label></td></tr>
                            <tr><td>
                            <input type="text" class="form-control" id="txtid" name="txtid" placeholder="Enter Gst No" required/></td>
                          <td>  <input type="submit" class="but" value="CHECK STATUS" /></td></tr>
                        </table></div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Bootstrap JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
