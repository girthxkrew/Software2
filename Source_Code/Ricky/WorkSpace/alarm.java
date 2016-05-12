import java.sql.Date;
import java.util.Calendar;


//class to alert users if a project has been updated, or close to deadline
public class alarm {

	//Collaborates with Project(5) to obtain project information, specifically the deadline for project approval.
	//@Requires projectID != null
	//@Ensures int timeLeft = (((\result.projectID) = projectID).deadline - CurrentDate)
	//@Ensures /result = timeLeft < 5 
	public static void submissionDeadline(String projectID){
		Date deadline = alarmHandler.getDeadline(projectID);
		//get current date time with Calendar()
		Calendar cal = Calendar.getInstance();
		
		if(((Date)deadline- (Date)cal.getTime())<5){
			sendEmail(projectID);
		}
		
	}
	
	//Collaborates with Project(5) to obtain project information, specifically the deadline for project approval.
	//@Requires projectID != null
	//@Ensures submissionDeadline(projectID) ? (*send email to project lead*) 
	//@	   : projectModified(projectID) ? (*send email to project lead*)
	//@	   : (*do nothing*)
	public static void sendEmail(String projectID){
		
		String email= alarmHandler.getEmail(projectID);
	    // Recipient's email ID needs to be mentioned.
	    String to = email;
	
  	    // Sender's email ID needs to be mentioned
	    String from = "web@gmail.com";
	
	    // Assuming you are sending email from localhost
	    String host = "localhost";
	
	    // Get system properties
	    Properties properties = System.getProperties();
	
	    // Setup mail server
	    properties.setProperty("mail.smtp.host", host);
	
	    // Get the default Session object.
	    Session session = Session.getDefaultInstance(properties);
	
	    try{
	       // Create a default MimeMessage object.
	       MimeMessage message = new MimeMessage(session);
	
	       // Set From: header field of the header.
	       message.setFrom(new InternetAddress(from));
	
	       // Set To: header field of the header.
	       message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	
	       // Set Subject: header field
	       message.setSubject("This is the Subject Line!");
	
	       // Now set the actual message
	       message.setText("This is actual message");
	
	       // Send message
	       Transport.send(message);
	    }catch (MessagingException mex) {
	       mex.printStackTrace();
	    }
	}
	
}
