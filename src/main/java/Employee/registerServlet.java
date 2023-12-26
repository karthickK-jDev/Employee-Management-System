package Employee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class registerServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String mail = req.getParameter("email");
		String contact = req.getParameter("contact");
		String bdate = req.getParameter("bdate");
		String gender = req.getParameter("gender");
		String password = req.getParameter("password");
		
		users u = new users(name,mail,contact,bdate,gender,password);
		usersconnection ucon = new usersconnection(connection.ConnectToDB());
		ucon.saveUsers(u);
		res.sendRedirect("signin.jsp");
		
		res.setContentType("text/html");
	}
}
