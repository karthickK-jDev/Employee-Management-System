package Employee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class updateServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String contact = req.getParameter("contact");
		String bdate = req.getParameter("bdate");
		String gender = req.getParameter("gender");
		String qualification = req.getParameter("qualification");
		String address = req.getParameter("address");
		
		employee e = new employee(id,name,email,contact,bdate,gender,qualification,address);
		employeeconnection ucon = new employeeconnection(connection.ConnectToDB());
		ucon.updateEmployees(e);
		message msg = new message("Data Updated Successfully!     ","success","success");
		HttpSession hs = req.getSession();
		hs.setAttribute("msg", msg);
		res.sendRedirect("home.jsp");
		
		res.setContentType("text/html");
	}
}
