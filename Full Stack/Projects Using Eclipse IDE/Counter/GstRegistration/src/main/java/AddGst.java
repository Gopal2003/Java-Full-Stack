

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

/**
 * Servlet implementation class AddGst
 */
public class AddGst extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGst() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rand = new Random();
		String tradename=request.getParameter("tradename");
		String address=request.getParameter("address");
		String pincode=request.getParameter("pincode");
		String state=request.getParameter("countrystate");
		String district=request.getParameter("district");
		String firstname=request.getParameter("firstname");
	    String lastname=request.getParameter("lastname");
	    String dob=request.getParameter("dob");
	    String fathername=request.getParameter("fathername");
	    String emailId=request.getParameter("emailid");
	    String mobile=request.getParameter("mobilenumber");
	    int gst=rand.nextInt(1000);
		String status="ACTIVE";
		
		try
		{// Step 1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2 connect the driver 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wallmart","root","yourpass");
           
           
           //Step 3 create Object of PrepareStatemnt Interface to Execute Query;
           PreparedStatement st=con.prepareStatement("insert into gstRegistration values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

          st.setString(1,tradename);
          st.setString(2, address);
          st.setString(3, pincode);  
          st.setString(4, state);
          st.setString(5, district);
          st.setString(6, firstname);
          st.setString(7, lastname);
          st.setString(8, dob);
          st.setString(9, fathername);
          st.setString(10, emailId);
          st.setString(11, mobile);
          st.setInt(12, gst);
          st.setString(13, status);
          st.executeUpdate();
          response.setContentType("text/html"); 
          response.getWriter().write("<h3>Your Registration has done Successfully!</h3><hr/><a href='index.jsp'>Home</a>");
          
          con.close();
               
		}
		
		catch(Exception e)
		{
			System.out.println(e);
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
