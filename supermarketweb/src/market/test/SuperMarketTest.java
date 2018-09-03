package market.test;

import market.dao.ItemDAO;
import market.data.object.Item;
import market.exceptions.ItemAlreadyExistsException;

public class SuperMarketTest {

	public static void main(String[] args) {

		Item item = new Item();
		item.setCode(1003);
		item.setName("Milk-1Ltr");
		item.setPrice(45);
		
		ItemDAO itemDAO = new ItemDAO();
		boolean isSuccess = false;
		try {
			Item item2 = itemDAO.viewItem(1003);
			isSuccess = itemDAO.createItem(item);
		} catch (Exception e) {
			System.out.println("Item already exists :"+e.getMessage());
			return;
		}
		
		if(isSuccess){
			System.out.println("Item created sucessfully");
		}
		else{
			System.out.println("Some internal please contact customer care");
		}
	}

}
