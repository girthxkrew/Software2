<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Brian
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
        String projectId = request.getParameter("projectId");

        ProposedProject proProj = new ProposedProject();
        proProj.setProject_id(projectId);

        ProposedProject proProjExists = DatabaseManager.DatabaseRequest(proProj,0);

        FundedProject newFundedProj = new FundedProject();
        newFundedProj.setTip_name(proProjExists.setProject_name());
        newFundedProj.setProject_name(request.getParameter("tipName"));
        newFundedProj.setTip_year(request.getParameter("tipYear"));
        
        
        boolean newProposedExists = DatabaseManager.DatabaseRequest(newFundedProj,2);
        boolean deletedProProj = DatabaseManager.DatabaseRequest(proProjExists,3);
        
        //check if both were success
        if(newProposedExists && deletedProProj )
            out.println("<h2>Success<h2/>");	
       
        //check if both were failed
        else if(!newProposedExists && !deletedProProj )
            out.println("<h2>Both Failed<h2/>");	
        else if(newProposedExists && !deletedProProj )
            out.println("<h2>Failed Delete Proj ------ Passed New Proj<h2/>");	
        else if(!newProposedExists && deletedProProj )
            out.println("<h2>Passed Delete Proj ------ Failed New Proj<h2/>");	

  
        %>
    </body>
</html>