<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Brian
--%>
<%@page import="ProjectBackend.UserSubsystem.User"%> <%--We need to import java classes so we can instantiate them --%>
<%@page import="ProjectBackend.ProjectSubsystem.ProposedProject"%>
<%@page import="ProjectBackend.DatabaseSubsystem.DatabaseManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>user login</title>
    </head>
    <body>
        
		<%
                String projectId = request.getParameter("projectId");
		ProposedProject proProj = new ProposedProject();
		proProj.setProject_id(projectId);
		DatabaseManager db = new DatabaseManager();		
		proProj = db.databaseRequest(proProj,3);
			        
			        if(proProj == null){
			        	out.println("<h2>We couldn't delete this project<h2/>");	
			        	//response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	//response.setHeader("Location", "../p1.html"); 
			        } 
                                else{
                                    out.println("<h2>We deleted this project.<h2/>");	
                                    //response.setStatus(response.SC_MOVED_TEMPORARILY);
                                    //response.setHeader("Location", "p1.html"); 
			        }
        %>
        


    </body>
</html>