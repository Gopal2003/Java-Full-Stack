

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class SaveDataBase
 */
public class SaveDataBase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveDataBase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String BusinessName = request.getParameter("BusinessName");
		String Address = request.getParameter("Address");
		int pinCode = Integer.parseInt("501141");
		String state = request.getParameter("State");
		String District = request.getParameter("District");
		String FirstName = request.getParameter("FirstName");
		String LastName = request.getParameter("LastName");
		String DOB = request.getParameter("DOB");
		String Fathername = request.getParameter("Fathername");
		String EmailID = request.getParameter("EmainID");
		int mobileNumber = Integer.parseInt("96734596");
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");// Driver is a software program used to establish the connection between database and application 
			
			//Step 2: Create the connections (java.sql)
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gstDatabase","root","12092003@Gopal");
			
			
			//Step 3 : Create Object of PreparedStatement interface to Execute Query
			
			String query = "insert into information value(?,?,?,?,?,?,?,?,?,?,?)"; // preparedStatement is used when we have some parameter in query
			PreparedStatement stmt = conn.prepareStatement(query);
			
			//step 4: Replace the Question marks in Query with the Appropriate Values.
			
//			stmt.setInt(1,Id);
			stmt.setString(1, BusinessName);
			stmt.setString(2,Address);
			stmt.setInt(3,pinCode);
			stmt.setString(4,state);
			stmt.setString(5,District);
			stmt.setString(6,FirstName);
			stmt.setString(7,LastName);
			stmt.setString(8,DOB);
			stmt.setString(9,Fathername);
			stmt.setString(10,EmailID);
			stmt.setInt(11,mobileNumber);
			
			
			//step5 : Execute the Query using .executeUpdate() Method.
			
			stmt.executeUpdate();
			
			response.setContentType("text/html");
			
			response.getWriter().write("<h3> Information Saved Successfully!</h3><hr/> <a href='index.jsp'> Home </a>");
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
