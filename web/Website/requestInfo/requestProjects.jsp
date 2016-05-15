<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>new user sign up</title>
    </head>
    <body>
        <%
    		
    	    // Recipient's email ID needs to be mentioned.
    	    String to = request.getParameter("email");
    	
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
    	       message.setSubject("MPO Information Request - "+request.getParameter("name"));
    	
    	       // Now set the actual message
    	       message.setText("Name: "+request.getParamter("name")+"\nPhone Number: "+request.getParamter("phoneNumber")+
    	    		   "\nType of Request: "+request.getParameter("typeOfRequest")+"\nRegion: "+request.getParameter("region"));
    	
    	       // Send message
    	       Transport.send(message);
    	       
    	       out.println("<h2>Request sent!<h2/>");	
           	   response.setStatus(response.SC_MOVED_TEMPORARILY);
           	   response.setHeader("Location", "../p1.html");
    	    }catch (MessagingException mex) {
    	       mex.printStackTrace();
    	       out.println("<h2>The Email wasn't sent.<h2/>");	
           	   response.setStatus(response.SC_MOVED_TEMPORARILY);
           	   response.setHeader("Location", "p1.html");
    	    }
    	
            
                        
        %>
        


    </body>
</html>