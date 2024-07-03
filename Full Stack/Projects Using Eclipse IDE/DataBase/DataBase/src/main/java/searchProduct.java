

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class searchProduct
 */
public class searchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Id = Integer.parseInt(request.getParameter("idtxt"));
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2: Create the connections (java.sql)
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/walmartt","root","12092003@Gopal");
			
			
			//Step 3 : Create Object of PreparedStatement interface to Execute Query
			
			String query = "select * from products where productid=(?)"; // preparedStatement is used when we have some parameter in query
			PreparedStatement stmt = conn.prepareStatement(query);
			
			stmt.setInt(1, Id);
			rs = stmt.executeQuery();
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			out.println("<p> Product Details <p/>");
			out.println("<hr/>");
			
			while(rs.next())
			{
				String productName = rs.getString("productName");
				int productid = rs.getInt("productid");
				String productDescription = rs.getString("productDescription");
				
				out.print("<p> Product Id: " + productid + " ");
				out.print("<p> Product Name: " + productName + " ");
				out.print("<p> Product Description: " + productDescription);
			}
			
			out.println("<br/> <br/>");
			out.println("  <a href='index.jsp'> Home <a/>");
			
						
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
