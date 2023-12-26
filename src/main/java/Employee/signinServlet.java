package Employee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class signinServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		String mail = req.getParameter("email");
		String password = req.getParameter("password");

		usersconnection ucon = new usersconnection(connection.ConnectToDB());
		users user = ucon.getLoginData(mail,password);
		if(user==null) {
			message msg = new message("User Not Found !     ","error","danger");
			HttpSession hs = req.getSession();
			hs.setAttribute("msg", msg);
			res.sendRedirect("signin.jsp");
		}else {
			HttpSession hs = req.getSession();
			hs.setAttribute("currentUser", user);
			res.sendRedirect("home.jsp");
		}
		res.setContentType("text/html");
	}
}
