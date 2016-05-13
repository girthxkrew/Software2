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
        
        //User pepito;
        
    	if(realUser){
    		
	        switch(usertype){
	        	case "mpoLead": MPOLead mpoLead = new MPOLead(); 
		        	mpoLead.setUserType(usertype);
			        mpoLead.setPassword(password);
			        mpoLead.setUserName(username);
			        
			        MPOLead newPepito = DatabaseManager.DatabaseRequest(mpoLead,0);
			        
			        if(newPepito == null){
			        	out.println("<h2>We couldn't log you in.<h2/>");	
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "p1.html"); 
			        }else{
			        	session.setAttribute("user",newPepito);
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "../dashBoards/MpoLeadDashboard/p1.html");
			        } 
	        	case "mpoStaff": MPOStaff mpoStaff = new MPOStaff(); 
		        	mpoStaff.setUserType(usertype);
		        	mpoStaff.setPassword(password);
		        	mpoStaff.setUserName(username);
			        
			        MPOStaff newPepito = DatabaseManager.DatabaseRequest(mpoStaff,0);
			        
			        if(newPepito == null){
			        	out.println("<h2>We couldn't log you in.<h2/>");	
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "p1.html"); 
			        }else{
			        	session.setAttribute("user",newPepito);
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "../dashBoards/MpoLeadDashboard/p1.html");
			        }
	        	case "admin": Admin admin = new Admin(); 
	        		admin.setUserType(usertype);
	        		admin.setPassword(password);
	        		admin.setUserName(username);
			        
			        Admin newPepito = DatabaseManager.DatabaseRequest(admin,0);
			        
			        if(newPepito == null){
			        	out.println("<h2>We couldn't log you in.<h2/>");	
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "p1.html"); 
			        }else{
			        	session.setAttribute("user",newPepito);
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "../dashBoards/MpoLeadDashboard/p1.html");
			        }
	        	case "projectLead": ProjectLead projectLead = new ProjectLead(); 
	        		projectLead.setUserType(usertype);
	        		projectLead.setPassword(password);
	        		projectLead.setUserName(username);
			        
			        ProjectLead newPepito = DatabaseManager.DatabaseRequest(projectLead,0);
			        if(newPepito == null){
			        	out.println("<h2>We couldn't log you in.<h2/>");	
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "p1.html"); 
			        }else{
			        	session.setAttribute("user",newPepito);
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "../dashBoards/MpoLeadDashboard/p1.html");
			        }
	    	}
	        
	        
    	}
         	    
            
                        
        %>
        


    </body>
</html>