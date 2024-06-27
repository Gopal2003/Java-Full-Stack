

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request object represents client i.e Browser.
		// response object represents Server i.e Apache.
		
		//to send response from server to client we will create the object of PrintWriter class 
		
		PrintWriter out = response.getWriter(); // getWriter is used to initialize PrintWriter Object. In other words it ensures that the response is send to the same client which has requested for some resources.
		
		//Next we will set MIME Type : it means what type of response is sent by server to client eg. binary / json / xml / html/ xhtml etc.
		
		response.setContentType("text/html");
		
		//We will use request Object to Fetch the data Submitted in HTML From
		
		String username = request.getParameter("txtusername");
		String passString = request.getParameter("txtpassword");
		
//		String principalAmount = request.getParameter("PAmount");
//		String TaxPer = request.getParameter("TaxPer");
//		int Tax = Integer.parseInt(TaxPer);
//		System.out.println(Tax);
//		int Amount = Integer.parseInt(principalAmount);
//		System.out.println(Amount);
		
		
		//Checking the Credentials Match.
		if(username.equals("admin") && passString.equals("secret@123"))
		{
			//This is not an efficient way.
			RequestDispatcher rd = request.getRequestDispatcher("DashBoard"); // Forwards the data to the dashboard.
			rd.forward(request, response);
//			out.write("<h3> Welcome Admin ! </h3>");
//			response.sendRedirect("DashBoard");
		}
		else
		{
			out.write("<h3> Wrong Credentials </h3>");
			response.sendRedirect("Error.html");
		}
		
		
		/*
		double per = (double)Tax / 100;
		double taxValue = (double)(Amount * per);
		double totalPayable = Amount + taxValue;
		
		
		out.write("<h5>Amount: </h5>" + Amount);
		out.write("<h5>Tax Percentage: </h5>" + TaxPer);
		out.write("<h5>Tax Value: </h5>" + taxValue);
		out.write("<h5> Total Payable: </h5>" + totalPayable);
		
		
		/*
		String line = String.format("Thank you! %s your password is %s",username,passString);
		
		out.write("<h3> Credentials Sent to Server Are as Follows: </h3><hr/>");
		out.write(line);
		
//		out.write("<h3> You have Successfully Configures PrintWriter to Send Response</h3><hr/>");
		*/
		out.close();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
