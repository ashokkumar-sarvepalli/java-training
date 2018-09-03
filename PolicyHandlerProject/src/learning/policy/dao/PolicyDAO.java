package learning.policy.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import learning.policy.pojo.Policy;

public class PolicyDAO {

	public List<Policy> viewAllPolices() {

		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file

		// creating seession factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		String hql = "from Policy";
		Query query = session.createQuery(hql);
		List<Policy> policyList = query.list();

		return policyList;

	}

}
