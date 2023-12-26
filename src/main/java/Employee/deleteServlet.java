package Employee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class deleteServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		int delete = Integer.parseInt(req.getParameter("eid"));
		employeeconnection ucon = new employeeconnection(connection.ConnectToDB());
		ucon.deleteEmployee(delete);
		message msg = new message("Data Deleted Successfully!     ","success","danger");
		HttpSession hs = req.getSession();
		hs.setAttribute("msg", msg);
		res.sendRedirect("home.jsp");
		
		res.setContentType("text/html");
	}
}
