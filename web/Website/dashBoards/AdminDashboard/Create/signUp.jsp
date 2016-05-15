<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Jose
--%>

<%@page import="ProjectBackend.UserSubsystem.User"%> <%--We need to import java classes so we can instantiate them --%>
<%@page import="ProjectBackend.UserSubsystem.Organization"%> <%--We need to import java classes so we can instantiate them --%>
<%@page import="ProjectBackend.DatabaseSubsystem.DatabaseManager"%>
<%@page import="ProjectBackend.UserSubsystem.MPOStaff"%>
<%@page import="ProjectBackend.UserSubsystem.MPOLeadUser"%>
<%@page import="ProjectBackend.UserSubsystem.ProjectLead"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create user</title>
    </head>
    <body>
        <%
                out.println("I am in jsp code");
                out.println(request.getParameter("userType"));
        	DatabaseManager db = new DatabaseManager();
        	switch(request.getParameter("userType")){
	        	case "MPOStaff": MPOStaff mpostaff = new MPOStaff(); 

                                    //set all the parameters using data from the forms!
                                mpostaff.setFirstName(request.getParameter("fName"));
                                mpostaff.setLastName(request.getParameter("lName"));
                                mpostaff.setEmail(request.getParameter("email")); //use request.getParameter("name of form element") to get the input
                                mpostaff.setPassword(request.getParameter("password"));
                                mpostaff.setUsername(request.getParameter("userName"));
                                mpostaff.setUserType(request.getParameter("userType"));
                              
                                MPOStaff isAdded = db.databaseRequest(mpostaff,2);
                                if(isAdded == null){
                                    out.println("<h2>The User Couldn't be created.<h2/>");	
                                    response.setStatus(response.SC_MOVED_TEMPORARILY);
                                    response.setHeader("Location", "p1.html"); 
                                }else{
                                    out.println("<h2>The User was succesfully created<h2/>");
                                    response.setStatus(response.SC_MOVED_TEMPORARILY);
                                    response.setHeader("Location", "../p1.html"); 
                                }
	        		break;
	        	case "MPOLead": MPOLeadUser mpolead = new MPOLeadUser(); 

                                    //set all the parameters using data from the forms!
                                mpolead.setFirstName(request.getParameter("fName"));
                                mpolead.setLastName(request.getParameter("lName"));
                                mpolead.setEmail(request.getParameter("email")); //use request.getParameter("name of form element") to get the input
                                mpolead.setPassword(request.getParameter("password"));
                                mpolead.setUsername(request.getParameter("userName"));
                                mpolead.setUserType(request.getParameter("userType"));

                                MPOLeadUser isAdded2 = db.databaseRequest(mpolead,2);
                                if(isAdded2 == null){
                                    out.println("<h2>The User Couldn't be created.<h2/>");	
                                    response.setStatus(response.SC_MOVED_TEMPORARILY);
                                    response.setHeader("Location", "p1.html"); 
                                }else{
                                    out.println("<h2>The User was succesfully created<h2/>");
                                    response.setStatus(response.SC_MOVED_TEMPORARILY);
                                    response.setHeader("Location", "../p1.html"); 
                                }
	        		break;
	        	case "ProjectLead": ProjectLead projectlead = new ProjectLead(); 
                                out.println("I'm here!!");
                                    //set all the parameters using data from the forms!
                                projectlead.setFirstName(request.getParameter("fName"));
                                projectlead.setLastName(request.getParameter("lName"));
                                projectlead.setEmail(request.getParameter("email")); //use request.getParameter("name of form element") to get the input
                                projectlead.setPassword(request.getParameter("password"));
                                projectlead.setUsername(request.getParameter("userName"));
                                projectlead.setUserType(request.getParameter("userType"));

                                ProjectLead isAdded3 = db.databaseRequest(projectlead,2);
                                if(isAdded3 == null){
                                    out.println("<h2>The User Couldn't be created.<h2/>");	
                                    response.setStatus(response.SC_MOVED_TEMPORARILY);
                                    response.setHeader("Location", "p1.html"); 
                                }else{
                                    out.println("<h2>The User was succesfully created<h2/>");
                                    response.setStatus(response.SC_MOVED_TEMPORARILY);
                                    response.setHeader("Location", "../p1.html"); 
                                }
	        		break;
        	}
            
                        
        %>
        


    </body>
</html>