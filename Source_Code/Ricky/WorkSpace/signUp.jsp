<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Ricky
--%>

<%@page import="ProjectBackend.UserSubsystem.User"%> <%--We need to import java classes so we can instantiate them --%>
<%@page import="ProjectBackend.UserSubsystem.Organization"%> <%--We need to import java classes so we can instantiate them --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>new user sign up</title>
    </head>
    <body>
        <%
        	User pepito;
        	switch(request.getParameter("userType")){
	        	case "MPOStaff": pepito = new MPOStaff(); 
	        		break;
	        	case "MPOLead": pepito = new MPOLead(); 
	        		break;
	        	case "ProjectLead": pepito = new ProjectLead(); 
	        		break;
        	}
        	
            Organization org = new Organization();
            org.setOrgName(request.getParameter("orgName"));
            org.setOrgEmail(request.getParameter("orgEmail"));
            
        	//set all the parameters using data from the forms!
            pepito.setFirstName(request.getParameter("fName"));
            pepito.setLastName(request.getParameter("lName"));
            pepito.setEmail(request.getParameter("email")); //use request.getParameter("name of form element") to get the input
            pepito.setPassword(request.getParameter("password"));
            pepito.setUserName(request.getParameter("userName"));
            pepito.setUserType(request.getParameter("userType"));
            pepito.setOrg(org);
            
            User newPepito = DatabaseManager.DatabaseRequest(pepito,2);
            if(newPepito == null){
            	out.println("<h2>The User Couldn't be added.<h2/>");	
            	response.setStatus(response.SC_MOVED_TEMPORARILY);
            	response.setHeader("Location", "p1.html"); 
            }else{
            	out.println("<h2>The User was succesfully added<h2/>");
            	response.setStatus(response.SC_MOVED_TEMPORARILY);
            	response.setHeader("Location", "../p1.html"); 
            }
            
                        
        %>
        


    </body>
</html>