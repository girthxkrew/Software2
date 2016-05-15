<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Ricky
--%>
<%@page import="ProjectBackend.DatabaseSubsystem.*;"%> <%--We need to import java classes so we can instantiate them --%>
<%@page import="ProjectBackend.UserSubsystem.*;"%> <%--We need to import java classes so we can instantiate them --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>user login</title>
    </head>
    <body>
        <h1> Here are the results: </h1> <br>
        <%
            //out.println("I am indeed accessing code!");
        String usertype	= request.getParameter("userType");
            //out.println(usertype);
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        Authenticator authenticateUser = new Authenticator();
        boolean realUser = authenticateUser.checkCredentials(username,password);
        
        //User pepito;
        
    	if(realUser){
    		DatabaseManager userManager = new DatabaseManager();
	        switch(usertype){
	        	case "mpoLead": MPOLeadUser mpoLead = new MPOLeadUser(); 
		        	mpoLead.setUserType(usertype);
			        mpoLead.setPassword(password);
			        mpoLead.setUsername(username);
			        
			        MPOLeadUser newMPOLead = userManager.databaseRequest(mpoLead,0);
			        
			        if(newMPOLead == null){
			        	out.println("<h2>We couldn't log you in.<h2/>");	
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "p1.html"); 
			        }else{
			        	session.setAttribute("user",newMPOLead);
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "../dashBoards/MpoLeadDashboard/p1.html");
			        } 
                                break;
	        	case "mpoStaff": MPOStaff mpoStaff = new MPOStaff(); 
		        	mpoStaff.setUserType(usertype);
		        	mpoStaff.setPassword(password);
		        	mpoStaff.setUsername(username);
			        
			        MPOStaff newMPOStaff = userManager.databaseRequest(mpoStaff,0);
			        
			        if(newMPOStaff == null){
			        	out.println("<h2>We couldn't log you in.<h2/>");	
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "p1.html"); 
                                        
			        }else{
			        	session.setAttribute("user",newMPOStaff);
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "../dashBoards/MpoLeadDashboard/p1.html");
			        }
                                break;
	        	case "admin": 
                                out.println("I'm here!!");
                                Admin admin = new Admin(); 
	        		admin.setPassword(password);
	        		admin.setUsername(username);
			        Admin newPepito = userManager.databaseRequest(admin,0);
			        
			        if(newPepito == null){
			        	out.println("<h2>We couldn't log you in.</h2>");	
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "p1.html"); 
			        }else{
			        	session.setAttribute("user",newPepito);
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "../dashBoards/AdminDashboard/p1.html");
			        }
                                break;
	        	case "projectLead": ProjectLead projectLead = new ProjectLead(); 
	        		projectLead.setUserType(usertype);
	        		projectLead.setPassword(password);
	        		projectLead.setUsername(username);
			        
			        ProjectLead newProjectLead = userManager.databaseRequest(projectLead,0);
			        if(newProjectLead == null){
			        	out.println("<h2>We couldn't log you in.<h2/>");	
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "p1.html"); 
			        }else{
			        	session.setAttribute("user",newProjectLead);
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "../dashBoards/ProjectLeadDashboard/p1.html");
			        }
                                break;
	    	}
	        
	        
    	}
        
        else{
            out.println("<h1> INVALID CREDENTIALS, TRY AGAIN! </h1>");
                out.println("<h2>We couldn't log you in.<h2/>");
                response.setStatus(response.SC_MOVED_TEMPORARILY);
                response.setHeader("Location", "p1.html");
        }
         	    
            
                        
        %>
        


    </body>
</html>