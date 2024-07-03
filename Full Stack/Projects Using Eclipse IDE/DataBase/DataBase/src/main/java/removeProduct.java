

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class removeProduct
 */
public class removeProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Id = Integer.parseInt(request.getParameter("idtxt"));
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");// Driver is a software program used to establish the connection between database and application 
			
			//Step 2: Create the connections (java.sql)
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/walmartt","root","12092003@Gopal");
			
			
			//Step 3 : Create Object of Statement interface to Execute Query
			
			String query = "delete from products where productid=(?)"; // preparedStatement is used when we have some parameter in query
			PreparedStatement stmt = conn.prepareStatement(query);
			
			stmt.setInt(1,Id);
			stmt.executeUpdate();
			
			response.setContentType("text/html");
			response.getWriter().write("<h3> Product Saved Successfully!</h3><hr/> <a href='index.jsp'> Home </a>");
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
