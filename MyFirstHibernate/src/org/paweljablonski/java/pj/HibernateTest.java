package org.paweljablonski.java.pj;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		UserDetails user = new UserDetails();
		user.setUserAge(24);
		user.setUserName("UserNo1");
		user.setDateOfBought(new Date());
		user.setDescription("Description of User 1");

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(user);
	session.getTransaction().commit();
	session.close();
	
	user = null;
	
	session = sessionFactory.openSession();
	session.beginTransaction();
	user = (UserDetails) session.get(UserDetails.class, 1);
	
	System.out.println("Retrieved name from db: " + user.getUserName());
	
	}

}
