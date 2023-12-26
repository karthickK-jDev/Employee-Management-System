<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Signup</title>
    </head>

    <body>
        <%@ include file="bootstrap.jsp" %><br><br>
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title text-center">Signup</h5>
                            <p class="card-text">
                            <form action="signup" method="post" class="form-group needs-validation" novalidate>

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
                                    <label for="password" class="form-label">Password</label>
                                    <input type="password" class="form-control" required placeholder=" Enter New Password " name="password">
                                    <div class="invalid-feedback">Please Enter Password</div>
                                </div><br><br>

                                <div class="text-center">
                                    <button type="submit" class="btn btn-success">Signup</button>
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