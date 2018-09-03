package learning.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import market.dao.ItemDAO;
import market.data.object.Item;
import market.exceptions.ItemNotFoundException;

/**
 * Servlet implementation class ItemServlet
 */

public class ItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ItemServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String itemId = request.getParameter("itemid");
		ItemDAO itemDAO = new ItemDAO();
		try {
			Item item = itemDAO.viewItem(Integer.parseInt(itemId));
			if(item==null){
				response.getWriter().append("Some problem with server pls try again after some time");
				return;
			}
			
			response.getWriter().append("Item name : "+item.getName()+",Item Price :"+item.getPrice());
		
		} catch (NumberFormatException e) {
			response.getWriter().append("Invalid Input entered It should be a number");
		} catch (ItemNotFoundException e) {
			response.getWriter().append("Entered item code is not found in the database");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
