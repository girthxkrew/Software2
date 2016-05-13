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
        
         string projID = request.getParameter("projectID");
         
           if(session.getAttribute("user")!=null){
           		switch(request.getParameter("projectType")){
           			MPOStaff mpostaff = (MPOStaff)session.getAttribute("user");
           			case "proposed":
           				ProposedProject proposedproject = mpostaff.viewProposedProject(projID);
	           			String airQAco = proposedproject.getAir_quality_analysis_co();
	           			String airQAnox = proposedproject.getAir_quality_analysis_nox();
	           			String airQAvoc = proposedproject.getAir_quality_analysis_voc();
	           			int area = proposedproject.getArea();
	           			int cap = proposedproject.getCapacity_project();
	           			int city = proposedproject.getCity();
	           			String name = proposedproject.getProject_name();
	           			int stateSystem = proposedproject.getState_system();
	           			String mpoID = proposedproject.getMpo_id();
	           			String csj = proposedproject.getCsj();
	           			String cn = proposedproject.getCn();
	           			
	           			out.println("<table><tr><td>Project Name</td><td>"+name+"</td><tr>"+
	           			"<tr><td>City</td><td>"+city+"</td><tr>"+
	           			"<tr><td>Project ID</td><td>"+projID+"</td><tr>"+
	           			"<tr><td>State System</td><td>"+stateSystem+"</td><tr>"+
	           			"<tr><td>Air Quality Analysis NOX</td><td>"+airQAnox+"</td><tr>"+
	           			"<tr><td>Air Quality Analysis VOC</td><td>"+airQAvoc+"</td><tr>"+
	           			"<tr><td>Area</td><td>"+area+"</td><tr>"+
	           			"<tr><td>Capacity Project</td><td>"+cap+"</td><tr>"+
	           			"<tr><td>Air Quality Analysis CO</td><td>"+airQAco+"</td><tr></table>"+
	           			"<form action=\"updateProposedFields.jsp\" method=\"post\">"+
	           			"CN: <input name=\"cn\" type=\"text\" value=\""+cn+"\"/>"+
	           			"CSJ: <input name=\"csj\" type=\"text\" value=\""+csj+"\"/>"+
	           			"MPO ID: <input name=\"mpoID\" type=\"text\" value=\""+mpoID+"\"/>"+
	           			"<input type=\"submit\"/>";
	           			
	           			
	           			session.setAttribute("proposedproject",proposedproject);
           				break;
	           		case "submitted":
	           			SubmittedProject submittedProject = mpostaff.viewSubmittedProject(projID);
	           			String airQAco = proposedproject.getAir_quality_analysis_co();
	           			String airQAnox = proposedproject.getAir_quality_analysis_nox();
	           			String airQAvoc = proposedproject.getAir_quality_analysis_voc();
	           			int area = proposedproject.getArea();
	           			int cap = proposedproject.getCapacity_project();
	           			int city = proposedproject.getCity();
	           			String name = proposedproject.getProject_name();
	           			int stateSystem = proposedproject.getState_system();
	           			
	           			out.println("<table><tr><td>Project Name</td><td>"+name+"</td><tr>"+
	           			"<tr><td>City</td><td>"+city+"</td><tr>"+
	           			"<tr><td>Project ID</td><td>"+projID+"</td><tr>"+
	           			"<tr><td>State System</td><td>"+stateSystem+"</td><tr>"+
	           			"<tr><td>Air Quality Analysis NOX</td><td>"+airQAnox+"</td><tr>"+
	           			"<tr><td>Air Quality Analysis VOC</td><td>"+airQAvoc+"</td><tr>"+
	           			"<tr><td>Area</td><td>"+area+"</td><tr>"+
	           			"<tr><td>Capacity Project</td><td>"+cap+"</td><tr>"+
	           			"<tr><td>Air Quality Analysis CO</td><td>"+airQAco+"</td><tr>";
	           			
           				break;
           			case "funded":
	           			FundedProject fundedProject = mpostaff.viewFundedProject(projID);
	           			String airQAco = proposedproject.getAir_quality_analysis_co();
	           			String airQAnox = proposedproject.getAir_quality_analysis_nox();
	           			String airQAvoc = proposedproject.getAir_quality_analysis_voc();
	           			int area = proposedproject.getArea();
	           			int cap = proposedproject.getCapacity_project();
	           			int city = proposedproject.getCity();
	           			String name = proposedproject.getProject_name();
	           			int stateSystem = proposedproject.getState_system();
	           			
	           			out.println("<table><tr><td>Project Name</td><td>"+name+"</td><tr>"+
	           			"<tr><td>City</td><td>"+city+"</td><tr>"+
	           			"<tr><td>Project ID</td><td>"+projID+"</td><tr>"+
	           			"<tr><td>State System</td><td>"+stateSystem+"</td><tr>"+
	           			"<tr><td>Air Quality Analysis NOX</td><td>"+airQAnox+"</td><tr>"+
	           			"<tr><td>Air Quality Analysis VOC</td><td>"+airQAvoc+"</td><tr>"+
	           			"<tr><td>Area</td><td>"+area+"</td><tr>"+
	           			"<tr><td>Capacity Project</td><td>"+cap+"</td><tr>"+
	           			"<tr><td>Air Quality Analysis CO</td><td>"+airQAco+"</td><tr>";
	           			break;
           		}
           }
           else{
			        	out.println("<h2>You are not logged in!<h2/>");	
			        	response.setStatus(response.SC_MOVED_TEMPORARILY);
			        	response.setHeader("Location", "../../../../p1.html"); 
           }
                        
        %>
        


    </body>
</html>