<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Brian
--%>
<%@page import="ProjectBackend.UserSubsystem.User"%> <%--We need to import java classes so we can instantiate them --%>
<%@page import="ProjectBackend.ProjectSubsystem.*"%>
<%@page import="ProjectBackend.ProjectSubsystem.ProposedProject"%>
<%@page import="ProjectBackend.DatabaseSubsystem.DatabaseManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>create project</title>
    </head>
    <body>
        
		<%
                String projectID = request.getParameter("projectID");
		String projectName = request.getParameter("projectName");
		String region= request.getParameter("region");
		String description= request.getParameter("description");
		String typeOfRequest= request.getParameter("typeOfRequest");
				
		String fromStreetLatitude= request.getParameter("fromStreetLatitude");
		String fromStreetLongitude= request.getParameter("fromStreetLongitude");
		String toStreetLatitude= request.getParameter("toStreetLatitude");
		String toStreetLongitude= request.getParameter("toStreetLongitude");

		double fromLat = Double.parseDouble(fromStreetLatitude);
		double fromLong = Double.parseDouble(fromStreetLongitude);
		double toLat = Double.parseDouble(toStreetLatitude);
		double toLong= Double.parseDouble(toStreetLongitude);
				
		Coordinate fromCoord = new Coordinate();
		Coordinate toCoord = new Coordinate();
		
		fromCoord.setLatitude(fromLat);
		fromCoord.setLongitude(fromLong);
		
		toCoord.setLatitude(toLat);
		toCoord.setLongitude(toLong);
		
		
		ProposedProject proProj = new ProposedProject();
		proProj.setProject_name(projectName);
		
		int indexAreaRegion = proProj.indexOf(proProj.getAreaArray(),region);
		proProj.setArea(indexAreaRegion);
		

		int indexProjType = proProj.indexOf(proProj.getFundProjectTypeArray(),typeOfRequest);
		proProj.setFund_type(indexProjType);	
		proProj.setProject_description(description);
		
		proProj.setLimitFrom(fromCoord);
		proProj.setLimitTo(toCoord);
		proProj.setProject_id(projectID);
		
		
		DatabaseManager databasemanager = new DatabaseManager();
		ProposedProject newProProj = databasemanager.databaseRequest(proProj,2);
			        
                if(newProProj == null){
                    out.println("<h2>We couldn't create a new proposed project.<h2/>");	
                    //response.setStatus(response.SC_MOVED_TEMPORARILY);
                    //response.setHeader("Location", "p1.html"); 
                } 
                else {
                    out.println("<h2>SUCCESSS!!!!!!!!!!.<h2/>");	
                    //response.setStatus(response.SC_MOVED_TEMPORARILY);
                    //response.setHeader("Location", "../p1.html"); 
                }
		//newProPoj = DatabaseManager.DatabaseRequest(mpoLead,0);
         	    
            
                        
        %>
        


    </body>
</html>