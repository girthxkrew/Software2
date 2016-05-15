<%-- 
    Document   : createUser
    Created on : May 12, 2016, 10:02:53 PM
    Author     : Jose
--%>
<%@page import="ProjectBackend.UserSubsystem.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creating User</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% Admin adminObject = new Admin( );
            String userType = " "; //call some request.getParameter() here!
            switch(userType){
            case "mpo staff":
                MPOStaff mpoStaff= new MPOStaff();
                
                
            case "project lead":
                ProjectLead projectLead = new ProjectLead();
              
            case "mpo lead":
                MPOLeadUser mpoLead = new MPOLeadUser();
             
            case "admin":
                Admin admin = new Admin();
                
            default:
                System.out.println("What");
                
        }
            
            
            %>
    </body>
</html>
