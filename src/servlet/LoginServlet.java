package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.UserService;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("user");
		String password=request.getParameter("password"); 
		UserService service=new UserService();
		boolean willlike= service.loginService(username, password);   
		if(willlike){
			request.getRequestDispatcher("/html/right.html").forward(request, response);
			HttpSession session=request.getSession(); 
			session.setAttribute("name", username);
		}
		else request.getRequestDispatcher("/html/welcome.html").forward(request, response);
	}
	public void init() throws ServletException {
		
	}

}
