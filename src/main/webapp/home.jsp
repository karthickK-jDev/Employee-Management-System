<%@ page import="java.sql.*" %>
    <%@ page import="Employee.*" %>
        <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <title>Home</title>
                <link href="style.css" rel="stylesheet">
            </head>

            <body>
                <%@ include file="bootstrap.jsp" %>
                    <%@ include file="navigation.jsp" %><br><br>
                        <% 	Connection con=connection.ConnectToDB();
                        	String query="select * from employee" ;
                        	Statement s=con.createStatement(); 
                        	ResultSet rs=s.executeQuery(query);
                        %>
                            <% message m=(message)session.getAttribute("msg");
                            		if(m!=null){%>
                                		<div class="alert alert-<%= m.getStyle() %>" role="alert">
                                    		<%= m.getContent() %>
                                        	<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                                		</div>
                                	<% } %>
                                    <% session.removeAttribute("msg"); %>
                                        <div class="row justify-content-center"><br>
                                            <h4 class="text-center">All Employee Details</h4>
                                            <div class="col-md-11">
                                                <table class="table">
                                                    <thead>
                                                        <tr>
                                                            <th scope="col">Name</th>
                                                            <th scope="col">Email</th>
                                                            <th scope="col">Contact</th>
                                                            <th scope="col">Birth Date</th>
                                                            <th scope="col">Gender</th>
                                                            <th scope="col">Qualification</th>
                                                            <th scope="col">Address</th>
                                                            <th scope="col">Update</th>
                                                            <th scope="col">Delete</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <% while(rs.next()){ %>
                                                            <tr>
                                                                <td>
                                                                    <%= rs.getString("name") %>
                                                                </td>
                                                                <td>
                                                                    <%= rs.getString("email") %>
                                                                </td>
                                                                <td>
                                                                    <%= rs.getString("contact") %>
                                                                </td>
                                                                <td>
                                                                    <%= rs.getString("bdate") %>
                                                                </td>
                                                                <td>
                                                                    <%= rs.getString("gender") %>
                                                                </td>
                                                                <td>
                                                                    <%= rs.getString("Qualification") %>
                                                                </td>
                                                                <td>
                                                                    <%= rs.getString("Address") %>
                                                                </td>
                                                                <td><a href="update.jsp?eid=<%= rs.getInt("id")
                                                                        %>">Edit</a></td>
                                                                <td><a href="delete?eid=<%= rs.getInt("id")
                                                                        %>">Delete</a></td>
                                                                <%}%>
                                                            </tr>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
            </body>

            </html>