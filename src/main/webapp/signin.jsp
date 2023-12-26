<%@ page import="Employee.*" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Signin</title>
        </head>

        <body>
            <%@ include file="bootstrap.jsp" %><br><br><br><br><br><br>
                <div class="row justify-content-center">
                    <div class="col-md-6">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title text-center">Signin</h5>
                                <% message m=(message)session.getAttribute("msg");
                                		if(m!=null){%>
                                    		<div class="alert alert-<%= m.getStyle() %>" role="alert">
                                        		<%= m.getContent() %>
                                            	<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                                    		</div>
                                    	<% } %>
                                 <% session.removeAttribute("msg"); %>
                                            <p class="card-text">
                                            <form action="signin" method="post" class="form-group needs-validation"
                                                novalidate>

                                                <div>
                                                    <label for="email" class="form-label">E-Mail</label>
                                                    <input type="email" name="email" class="form-control" required placeholder=" Enter Your E-Mail ">
                                                    <div class="invalid-feedback">Please Enter E-Mail</div>
                                                </div>

                                                <div>
                                                    <label for="password" class="form-label">Password</label>
                                                    <input type="password" class="form-control" required placeholder=" Enter New Password " name="password">
                                                    <div class="invalid-feedback">Please Enter Password</div>
                                                </div><br><br>

                                                <div class="text-center">
                                                    <button type="submit" class="btn btn-success">Signin</button>
                                                </div><br>
                                                <div class="text-center">
                                                    <p>Not registered yet? <a href="signup.jsp">create a new account</a>
                                                    </p>
                                                </div>
                                            </form>
                                            </p>
                            </div>
                        </div>
                    </div>
                </div>
                <script src="validation.js"></script>
        </body>

        </html>