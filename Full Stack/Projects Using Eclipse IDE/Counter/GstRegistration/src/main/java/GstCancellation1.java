

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Servlet implementation class GstCancellation1
 */
public class GstCancellation1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GstCancellation1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tradename = request.getParameter("tradename");
        String emailid = request.getParameter("emailid");
       // String gstin = request.getParameter("Gstin");

      
        String confirmationLink = "http://localhost:8080/GstRegistration/Gstcancellation?tradename=" +tradename;

        sendEmail(emailid, confirmationLink);

     
        response.getWriter().println("A confirmation email has been sent to " + emailid + ". Please check your email to confirm the cancellation.");
        response.setContentType("text/html");
        response.getWriter().println("<hr/><br/><a href='index.jsp'>Home</a>");
    
	}
	   private void sendEmail(String recipientEmail, String confirmationLink) {
           String host = "smtp.gmail.com"; 
           String from = "anmolmishraoins1@gmail.com"; 
           String pass ="lmpw rrto uqza xmca";

           Properties properties = System.getProperties();
           properties.put("mail.smtp.starttls.enable", "true");
           properties.put("mail.smtp.host", host);
           properties.put("mail.smtp.user", from);
           properties.put("mail.smtp.password", pass);
           properties.put("mail.smtp.port", "587");
           properties.put("mail.smtp.auth", "true");

           Session session = Session.getDefaultInstance(properties);
           MimeMessage message = new MimeMessage(session);

           try {
               message.setFrom(new InternetAddress(from));
               message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
               message.setSubject("Confirm GST Cancellation");
               message.setText("Please click the following link to confirm your GST cancellation: " + confirmationLink);

               Transport transport = session.getTransport("smtp");
               transport.connect(host, from, pass);
               transport.sendMessage(message, message.getAllRecipients());
               transport.close();
           } 
           catch (MessagingException mex) {
               mex.printStackTrace();
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
