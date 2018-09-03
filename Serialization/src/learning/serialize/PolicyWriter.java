package learning.serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PolicyWriter {

	public static void main(String[] args) {

		Policy p = new Policy();
		p.setName("Life-Insurance");
		p.setPolicyId(1001);

		try {
			File f = new File("policy.ser");
			FileOutputStream fio = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fio);
			oos.writeObject(p);
			oos.flush();
			System.out.println("written sucesffuly");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
