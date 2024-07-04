<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="jakarta.servlet.http.HttpServletRequest"%>
<%@ page import="jakarta.servlet.http.HttpServletResponse"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>JDBC Database Operations</title>
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
.footer {
    background-color: #f8f9fa;
    padding: 20px 0;
}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container mt-4">
    
    <h2 class="text-center mb-4">GST Registration Details</h2>
    <div class="table-responsive">
        <table class="table table-bordered table-hover">
            <thead class="thead-dark">
                <tr>
                    <th>TradeName</th>
                    <th>Address</th>
                    <th>PinCode</th>
                    <th>State</th>
                    <th>District</th>
                    <th>FirstName</th>
                    <th>LastName</th>
                    <th>DOB</th>
                    <th>FatherName</th>
                    <th>EmailID</th>
                    <th>Mobile Number</th>
                    <th>GstNO</th>
                    <th>GstStatus</th>
                </tr>
            </thead>
            <tbody>
                <%
                ResultSet rs = null;
                Connection con = null;
                try {
                    int Id = Integer.parseInt(request.getParameter("txtid"));
                    // Step 1: Load the driver
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    // Step 2: Connect the driver
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wallmart", "root", "Devil@154371");
                    // Step 3: Create object of PreparedStatement interface to execute query
                    PreparedStatement st = con.prepareStatement("select * from gstRegistration where gstNo=?");
                    st.setInt(1, Id);
                    rs = st.executeQuery();
                    while (rs.next()) {
                        out.write("<tr>");
                        out.write("<td>" + rs.getString(1) + "</td>");
                        out.write("<td>" + rs.getString(2) + "</td>");
                        out.write("<td>" + rs.getString(3) + "</td>");
                        out.write("<td>" + rs.getString(4) + "</td>");
                        out.write("<td>" + rs.getString(5) + "</td>");
                        out.write("<td>" + rs.getString(6) + "</td>");
                        out.write("<td>" + rs.getString(7) + "</td>");
                        out.write("<td>" + rs.getString(8) + "</td>");
                        out.write("<td>" + rs.getString(9) + "</td>");
                        out.write("<td>" + rs.getString(10) + "</td>");
                        out.write("<td>" + rs.getString(11) + "</td>");
                        out.write("<td>" + rs.getString(12) + "</td>");
                        out.write("<td>" + rs.getString(13) + "</td>");
                        out.write("</tr>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (con != null) {
                        try {
                            con.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                %>
            </tbody>
        </table>
    </div>

    <div class="footer text-center mt-4">
        <p>&copy;2024, LPU</p>
        <a href="index.jsp" class="btn btn-primary">Home</a>
        <a href="TrackStatus.jsp" class="btn btn-danger">Back</a>
    </div>
</div>

<!-- Bootstrap JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
