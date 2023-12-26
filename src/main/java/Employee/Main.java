package Employee;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
public class Main extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)
throws IOException,ServletException
{
response.setContentType("text/html");

response.sendRedirect("signin.jsp");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
