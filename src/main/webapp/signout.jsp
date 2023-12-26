<%@ page import="Employee.*" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>SignOut</title>
        </head>

        <body>
            <% 	session.getAttribute("currentUser");
	            session.removeAttribute("currentUser");
	            message msg=new message("Signout Successfully!","success","success");
	            session.setAttribute("msg",msg);
	            response.sendRedirect("signin.jsp");
            %>
        </body>

        </html>