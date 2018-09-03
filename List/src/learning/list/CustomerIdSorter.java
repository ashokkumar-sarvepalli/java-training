package learning.list;

import java.util.Comparator;

public class CustomerIdSorter implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1==null || o2==null){
			return 0;
		}
		if(o1.getCustId()>o2.getCustId()){
			return 1;
		}
		
		else if(o1.getCustId()<o2.getCustId()){
			return -1;
		}
		return 0;
	}

}
