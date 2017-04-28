package com.niit.dao;

import com.niit.model.User;

public interface UserDao {
	User registerUser(User user);
	User login(User user);
	void updateUser(User user);
	User getUser(int id);
}
