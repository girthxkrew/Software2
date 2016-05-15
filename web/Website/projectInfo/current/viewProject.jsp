<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Jose
--%>

<%@page import="ProjectBackend.DatabaseSubsystem.DatabaseManager"%>
<%@page import="ProjectBackend.ProjectSubsystem.ProposedProject"%>
<%@page import="ProjectBackend.ProjectSubsystem.SubmittedProject"%>
<%@page import="ProjectBackend.ProjectSubsystem.FundedProject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create user</title>
    </head>
    <body>
        <%
            String projectID = request.getParameter("projectID");
            DatabaseManager db = new DatabaseManager();
            switch (request.getParameter("ProjectType")) {
                case "proposed":
                    ProposedProject proposedproject = new ProposedProject();
                    proposedproject.setProject_id(projectID);

                    proposedproject = db.databaseRequest(proposedproject, 0);
                    if (proposedproject == null) {
                        out.println("<h2>The project couldn't be found.<h2/>");
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                        response.setHeader("Location", "p1.html");
                    } else {
                        String airQAco = proposedproject.getAir_quality_analysis_co();
                        String airQAnox = proposedproject.getAir_quality_analysis_nox();
                        String airQAvoc = proposedproject.getAir_quality_analysis_voc();
                        int area = proposedproject.getArea();
                        int city = proposedproject.getCity();
                        String name = proposedproject.getProject_name();
                        int stateSystem = proposedproject.getState_system();
                        String mpoID = proposedproject.getMpo_id();
                        String csj = proposedproject.getCsj();
                        String cn = proposedproject.getCn();

                        out.println("<table><tr><td>Project Name</td><td>" + name + "</td><tr>"
                                + "<tr><td>City</td><td>" + city + "</td><tr>"
                                + "<tr><td>Project ID</td><td>" + projectID + "</td><tr>"
                                + "<tr><td>State System</td><td>" + stateSystem + "</td><tr>"
                                + "<tr><td>Air Quality Analysis NOX</td><td>" + airQAnox + "</td><tr>"
                                + "<tr><td>Air Quality Analysis VOC</td><td>" + airQAvoc + "</td><tr>"
                                + "<tr><td>Area</td><td>" + area + "</td><tr>"
                                + "<tr><td>Air Quality Analysis CO</td><td>" + airQAco + "</td><tr>"
                                + "<tr><td>CN</td><td>" + cn + "</td></tr>"
                                + "<tr><td>CSJ</td><td>" + csj + "</td></tr>"
                                + "<tr><td>MPO ID</td><td>" + mpoID + "</td></tr></table>"
                                + "<a href=\"current.html\">Go Back</a>");
                    }
                    break;
                case "funded":
                    FundedProject fundedproject = new FundedProject();
                    fundedproject.setProject_id(projectID);

                    fundedproject = db.databaseRequest(fundedproject, 0);
                    if (fundedproject == null) {
                        out.println("<h2>The project couldn't be found.<h2/>");
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                        response.setHeader("Location", "p1.html");
                    } else {
                        out.println("<h2>The project was be found.<h2/>");
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                        response.setHeader("Location", "../p1.html");
                    }
                    break;
                case "submited":
                    SubmittedProject submittedproject = new SubmittedProject();
                    submittedproject.setProject_id(projectID);

                    submittedproject = db.databaseRequest(submittedproject, 0);
                    if (submittedproject == null) {
                        out.println("<h2>The project couldn't be found.<h2/>");
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                        response.setHeader("Location", "p1.html");
                    } else {
                        out.println("<h2>The User was succesfully found<h2/>");
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                        response.setHeader("Location", "../p1.html");
                    }
                    break;
            }


        %>



    </body>
</html>