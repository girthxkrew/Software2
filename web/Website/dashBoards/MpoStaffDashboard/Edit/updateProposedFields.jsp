<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Ricky
--%>
<%@page import="ProjectBackend.UserSubsystem.User"%> <%--We need to import java classes so we can instantiate them --%>
<%@page import="ProjectBackend.UserSubsystem.Project"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>retrieve project</title>
    </head>
    <body>
        <%
        
           String cn = request.getParameter("cn");
           String csj = request.getParameter("csj");
           String mpoID = request.getParameter("mpoID");
           
           		MPOStaff mpostaff = (MPOStaff)session.getAttribute("user");
           		ProposedProject proposedproject = (ProposedProject)session.getAttribute("proposedproject");
           		proposedproject.setCn(cn);
           		proposedproject.setCsj(csj);
           		proposedproject.setMpo_id(mpoID);
           		boolean saved = mpostaff.edit(proposedproject);
           		if(!saved){
           			out.print("<p>The project was not updated</p>");
			        response.setStatus(response.SC_MOVED_TEMPORARILY);
			        response.setHeader("Location", "p1.html");
           		}
           		else{
           			out.print("<p>The project was uploaded<p>");
			        response.setStatus(response.SC_MOVED_TEMPORARILY);
			        response.setHeader("Location", "p1.html");
           		}
           
           else{
			        	out.println("<h2>You are not logged in!<h2/>");	
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "../../../../p1.html"); 
           }
                        
        %>
        


    </body>
</html>