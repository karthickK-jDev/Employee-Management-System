package Employee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class employeeServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String mail = req.getParameter("email");
		String contact = req.getParameter("contact");
		String bdate = req.getParameter("bdate");
		String gender = req.getParameter("gender");
		String qualification = req.getParameter("qualification");
		String address = req.getParameter("address");
		
		employee e = new employee(name,mail,contact,bdate,gender,qualification,address);
		employeeconnection ucon = new employeeconnection(connection.ConnectToDB());
		ucon.saveEmployees(e);
		message msg = new message("Data Saved Successfully!     ","success","success");
		HttpSession hs = req.getSession();
		hs.setAttribute("msg", msg);
		res.sendRedirect("home.jsp");
		
		res.setContentType("text/html");
	}
}
