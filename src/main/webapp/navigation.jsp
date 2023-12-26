<%@ page import="Employee.*" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Navigation</title>
        </head>

        <body>
            <% users u=(users)session.getAttribute("currentUser"); %>
                <%@ include file="bootstrap.jsp" %>
                    <nav class="navbar navbar-expand-lg bg-body-tertiary">
                        <div class="container-fluid">
                            <a class="navbar-brand" href="home.jsp">Employee Management System</a>
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                            	aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                                    <li class="nav-item">
                                        <a class="nav-link active" aria-current="page" href="home.jsp">Home</a>
                                    </li>
                                    <% if(u==null) {%>
                                        <li class="nav-item">
                                            <a class="nav-link" href="signin.jsp">Signin</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="signup.jsp">Signup</a>
                                        </li>
                                    	<%} else{%>
                                            <li class="nav-item">
                                                <a class="nav-link" href="add.jsp">Add Employee</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="signout.jsp">Signout</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="#">Profile(<%= u.getName() %>)</a>
                                            </li>
										<% }%>
                                </ul>
                            </div>
                        </div>
                    </nav>
        </body>

        </html>