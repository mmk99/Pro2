package com.niit.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory sessionFactory;

		public User registerUser(User user) {
	        Session session=sessionFactory.openSession();
	        session.save(user);
	        session.flush();
	        session.close();
	        return user;
		}

		public User login(User user) {
			Session session=sessionFactory.openSession();
			Query query=session.createQuery(
	"from User where username=? and password=?");
			query.setString(0,user.getUsername());
			query.setString(1,user.getPassword());
			User validUser=(User)query.uniqueResult();
			return validUser;
			
		}
		public void updateUser(User user) {
			Session session=sessionFactory.openSession();
			//update user_info set username=?,password=?,email=?,enabled=?,online=? where id=?
			session.update(user);
			session.flush();
			session.close();
		}

}
