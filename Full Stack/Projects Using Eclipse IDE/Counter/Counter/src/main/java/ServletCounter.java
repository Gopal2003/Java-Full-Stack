

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletCounter
 */
public class ServletCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    
    private int visitorCount = 0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//First we will fetch the existing cookie
		Cookie[] cookies = request.getCookies();
		
		boolean newVisitor = true;
		
		//we will check is the visitor cookie exists.
		if(cookies != null)
		{
			for(Cookie ck : cookies)//Fetching all the cookies
			{
				if(ck.getName().equals("VisitorCount"))// looking for cookie name VisitorCount
				{
					newVisitor = false;// if the cookie is existing newVisitor = false;
					break;
				}
			}
		}
		
		//Here we need to Update the Visitor Count
		if(newVisitor)
		{
			visitorCount++;
			Cookie visitorCookie = new Cookie("VisitorCount","Visited"); // Name,value
			visitorCookie.setMaxAge(3600 * 24); //  Prevent the cookie from deleting the browser. once the browser is 
		  // closed, the cookie is by default deleted. hence, for that we increased the age of the cookie to 24 hours.
			response.addCookie(visitorCookie);
		}
		
		//set the response content type
		response.setContentType("text/html");
		
		//Writing response to client
		PrintWriter out = response.getWriter();
		
		if(newVisitor)
		{
			out.println("Welcome New Visitor");
		}
		else
		{
			out.println("Welcome Back");
		}
		
		out.println("<br/> Total Visitor: " + visitorCount + "<br/>");
		
		
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
