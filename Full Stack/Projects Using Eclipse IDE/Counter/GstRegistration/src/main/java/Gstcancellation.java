import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;;


public class Gstcancellation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gstcancellation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tradename=request.getParameter("tradename");
	
		String status="INACTIVE";
		try
		{// Step 1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2 connect the driver 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wallmart","root","<yourPassword>");
           //Step 3 create Object of PrepareStatemnt Interface to Execute Query;
          PreparedStatement st=con.prepareStatement("update gstRegistration set gstStatus=? where tradename=?");
          st.setString(1,status);
          st.setString(2, tradename);
          st.executeUpdate();
          response.setContentType("text/html"); 
          response.getWriter().write("<h3>Your Cancellation  has done Successfully!</h3><hr/><a href='index.jsp'>Home</a>");
          
        con.close();      
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
