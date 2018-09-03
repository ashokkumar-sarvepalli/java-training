package learning.policy.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import learning.policy.dao.PolicyDAO;
import learning.policy.pojo.Policy;

/**
 * Servlet implementation class PolicyViewer
 */

public class PolicyViewer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PolicyViewer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = getServletContext();
		String uname = sc.getInitParameter("username");
		String pwd = sc.getInitParameter("password");
		
		//String ppwd = request.getParameter("xxx");
		//int dummy = ppwd.length();
		
		String unameEntered = request.getParameter("uname");
		String passwordEntered = request.getParameter("password");
		
		if(uname.equalsIgnoreCase(unameEntered) && pwd.equals(passwordEntered)) {

			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			
			// interacct with the dao layer fetch all policies and redirect to jsp
			
			PolicyDAO pd = new PolicyDAO();
			
			List<Policy> policyList = pd.viewAllPolices();
		
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view.jsp");
			request.setAttribute("policylist", policyList);
			rd.forward(request, response);
			
			
		}
		else {
			
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			request.setAttribute("loginstatus", "failed");
			rd.forward(request, response);
		}
		doGet(request, response);
	}

}
