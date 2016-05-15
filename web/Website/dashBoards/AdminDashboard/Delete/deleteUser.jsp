<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Jose
--%>

<%@page import="ProjectBackend.UserSubsystem.MPOStaff"%> <%--We need to import java classes so we can instantiate them --%>
<%@page import="ProjectBackend.UserSubsystem.MPOLeadUser"%> 
<%@page import="ProjectBackend.UserSubsystem.ProjectLead"%> 
<%@page import="ProjectBackend.DatabaseSubsystem.DatabaseManager"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>delete user up</title>
    </head>
    <body>
        <%
        	DatabaseManager db = new DatabaseManager();
        	switch(request.getParameter("userType")){
	        	case "MPOStaff": MPOStaff mpostaff = new MPOStaff(); 
                            mpostaff.setUsername(request.getParameter("username"));

                            MPOStaff didDelete = db.databaseRequest(mpostaff,3);
                            if(didDelete == null){
                                out.println("<h2>The User Couldn't be deleted.<h2/>");	
                                response.setStatus(response.SC_MOVED_TEMPORARILY);
                                response.setHeader("Location", "p1.html"); 
                            }else{
                                out.println("<h2>The User was succesfully deleted<h2/>");
                                response.setStatus(response.SC_MOVED_TEMPORARILY);
                                response.setHeader("Location", "../p1.html"); 
                            }
                            break;
	        	case "MPOLead": MPOLeadUser mpolead = new MPOLeadUser(); 
                            mpolead.setUsername(request.getParameter("username"));

                            MPOLeadUser didDelete2 = db.databaseRequest(mpolead,3);
                            if(didDelete2 == null){
                                out.println("<h2>The User Couldn't be deleted.<h2/>");	
                                response.setStatus(response.SC_MOVED_TEMPORARILY);
                                response.setHeader("Location", "p1.html"); 
                            }else{
                                out.println("<h2>The User was succesfully deleted<h2/>");
                                response.setStatus(response.SC_MOVED_TEMPORARILY);
                                response.setHeader("Location", "../p1.html"); 
                            }
                            break;
	        	case "ProjectLead": ProjectLead projectlead = new ProjectLead(); 
                            projectlead.setUsername(request.getParameter("username"));

                            ProjectLead didDelete3 = db.databaseRequest(projectlead,3);
                            if(didDelete3 == null){
                                out.println("<h2>The User Couldn't be deleted.<h2/>");	
                               // response.setStatus(response.SC_MOVED_TEMPORARILY);
                               // response.setHeader("Location", "p1.html"); 
                            }else{
                                out.println("<h2>The User was succesfully deleted<h2/>");
                               // response.setStatus(response.SC_MOVED_TEMPORARILY);
                                //response.setHeader("Location", "../p1.html"); 
                            }
                            break;
        	}
        	
            
            
                        
        %>
        


    </body>
</html>