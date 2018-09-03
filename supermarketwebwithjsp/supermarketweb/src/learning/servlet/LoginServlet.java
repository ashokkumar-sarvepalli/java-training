package learning.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServletContext sc = getServletContext();
		// data stored in the web.xml
		String userName = sc.getInitParameter("username");
		// the user entered data from the html pages
		String userNameEntered = request.getParameter("uname");
		
		String password = sc.getInitParameter("password");
		String passwordEntered = request.getParameter("pwd");
		if(userName.equals(userNameEntered) && password.equals(passwordEntered)){
			HttpSession session = request.getSession();
			session.setAttribute("username", userNameEntered);
			//request.getSession().setMaxInactiveInterval(30);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/itemview.html");
			//response.getWriter().print("Secret answer is wrong");
			rd.forward(request, response);
			System.out.println(response.getStatus());
			
		}else{
			response.sendRedirect("http://www.google.com");
		}
			
	}

}
