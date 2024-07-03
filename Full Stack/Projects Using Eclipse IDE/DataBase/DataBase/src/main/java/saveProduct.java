

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
 * Servlet implementation class saveProduct
 */
public class saveProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public saveProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Fetch the details provided in form
				int Id = Integer.parseInt(request.getParameter("idtxt"));
				String pname = request.getParameter("nametxt");
				String pdesc = request.getParameter("desctxt");
				
				//Here are the Steps for Data Connection
				//Step 1: Load the Driver
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");// Driver is a software program used to establish the connection between database and application 
					
					//Step 2: Create the connections (java.sql)
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/walmartt","root","12092003@Gopal");
					
					
					//Step 3 : Create Object of PreparedStatement interface to Execute Query
					
					String query = "insert into products value(?,?,?)"; // preparedStatement is used when we have some parameter in query
					PreparedStatement stmt = conn.prepareStatement(query);
					
					//step 4: Replace the Question marks in Query with the Appropriate Values.
					
					stmt.setInt(1,Id);
					stmt.setString(2, pname);
					stmt.setString(3,pdesc);
					
					//step5 : Execute the Query using .executeUpdate() Method.
					
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
