<%@ page import="Employee.*" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Add Employee</title>
        </head>

        <body>
            <%@ include file="bootstrap.jsp" %>
                <%@ include file="navigation.jsp" %><br><br>
                    <div class="row justify-content-center">
                        <div class="col-md-8">
                            ' <div class="card">
                                <div class="card-body">
                                    <h5 class="card-title text-center">Add Employee Details</h5>
                                    <p class="card-text">
                                    <form action="employee" method="post" class="form-group needs-validation" novalidate>

                                        <div>
                                            <label for="name" class="form-label">Name</label>
                                            <input type="text" name="name" class="form-control" required placeholder=" Enter Your Name ">
                                            <div class="invalid-feedback">Please Enter Name</div>
                                        </div>

                                        <div>
                                            <label for="email" class="form-label">E-Mail</label>
                                            <input type="email" name="email" class="form-control" required placeholder=" Enter Your E-Mail ">
                                            <div class="invalid-feedback">Please Enter E-Mail</div>
                                        </div>

                                        <div>
                                            <label for="contact" class="form-label">Contact</label>
                                            <input type="text" name="contact" class="form-control" required placeholder=" Enter Your Number ">
                                            <div class="invalid-feedback">Please Enter Contact</div>
                                        </div>

                                        <div>
                                            <label for="bdate" class="form-label">Birth Date</label>
                                            <input type="date" name="bdate" class="form-control" required>
                                            <div class="invalid-feedback">Please Choose/Enter Birthday Date</div>
                                        </div>

                                        <div>
                                            <label for="gender" class="form-label">Gender</label><br>
                                            <input type="radio" name="gender" value="Male" class="form-check-input" required>Male
                                            <input type="radio" name="gender" value="Female" class="form-check-input" required>Female<br>
                                            <div class="invalid-feedback">Please Choose Gender</div>
                                        </div>

                                        <div>
                                            <label for="qualification" class="form-label">Qualification</label>
                                            <input type="text" name="qualification" class="form-control" required placeholder=" Enter Your Qualification ">
                                            <div class="invalid-feedback">Please Enter Qualification</div>
                                        </div>

                                        <div>
                                            <label for="address" class="form-label">Address</label>
                                            <input type="text" name="address" class="form-control" required placeholder=" Enter Your Address ">
                                            <div class="invalid-feedback">Please Enter Address</div>
                                        </div><br><br>

                                        <div class="text-center">
                                            <button type="submit" class="btn btn-success">Save</button>
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