package learning.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PolicyReader {

	public static void main(String[] args) {

		try {
			File f = new File("policy.ser");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Policy policy = (Policy) ois.readObject();
			System.out.println(policy.getName());
			System.out.println(policy.getPolicyId());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
