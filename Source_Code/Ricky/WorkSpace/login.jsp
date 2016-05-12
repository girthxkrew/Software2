<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Ricky
--%>
<%@page import="ProjectBackend.UserSubsystem.User"%> <%--We need to import java classes so we can instantiate them --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>user login</title>
    </head>
    <body>
        <%
        String usertype	= request.getParameter("userType");
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        boolean realUser = Authenticator.checkCredentials(username,password);
        
        User pepito;
        
    	if(realUser){
    		
	        switch(usertype){
	        	case "mpoLead": pepito = new MPOLead(); 
	        		break;
	        	case "mpoStaff": pepito = new MPOStaff(); 
	        		break;
	        	case "admin": pepito = new Admin(); 
	        		break;
	        	case "projectLead": pepito = new ProjectLead(); 
        			break;
	    	}
	        
	        pepito.setUserType(userType);
	        pepito.setPassword(username);
	        pepito.setUserName(password);
	        
	        User newPepito = DatabaseManager.DatabaseRequest(pepito,0);
    	}
        if(newPepito == null){
        	out.println("<h2>We couldn't log you in.<h2/>");	
        	response.setStatus(response.SC_MOVED_TEMPORARILY);
        	response.setHeader("Location", "p1.html"); 
        }else{
        	session.setAttribute("user",newPepito);
	        switch(usertype){
	        	case "mpoLead": 
		        	response.setStatus(response.SC_MOVED_TEMPORARILY);
		        	response.setHeader("Location", "../dashBoards/MpoLeadDashboard/p1.html");
	        		break;
	        	case "mpoStaff": 
		        	response.setStatus(response.SC_MOVED_TEMPORARILY);
		        	response.setHeader("Location", "../dashBoards/MpoStaffDashboard/p1.html"); 
	        		break;
	        	case "admin": 
		        	response.setStatus(response.SC_MOVED_TEMPORARILY);
		        	response.setHeader("Location", "../dashBoards/AdminDashboard/p1.html"); 
	        		break;
	        	case "projectLead": 
		        	response.setStatus(response.SC_MOVED_TEMPORARILY);
		        	response.setHeader("Location", "../dashBoards/ProjectLeadDashboard/p1.html");
	    			break;
    		} 
        }  	    
            
                        
        %>
        


    </body>
</html>