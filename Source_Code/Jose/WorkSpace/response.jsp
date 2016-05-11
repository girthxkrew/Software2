<%-- 
    Document   : response
    Created on : May 10, 2016, 3:39:24 AM
    Author     : Jose
--%>

<%@page import="testpackage.User"%> <%--We need to import java classes so we can instantiate them --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page that handles the forms</title>
    </head>
    <body>
        <% User pepito = new User(); //we can instantiate an object now!
            //set all the parameters using data from the forms!
            pepito.setAddress(request.getParameter("userAddress")); //use request.getParameter("name of form element") to get the input
            pepito.setName(request.getParameter("userName"));
            pepito.setId(request.getParameter("userId"));
        %>
        <h1> Your name is: <%= pepito.getName()%> </h1> <%--the <%= %> tags are used to print out strings, but you can use out.println() too --%>
        <h1> Your address is: <%= pepito.getAddress()%> </h1>
        <h1> Your ID is: <%= pepito.getId()%> </h1>


    </body>
</html>
