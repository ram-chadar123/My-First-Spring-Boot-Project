package com.tka.sams.api.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.sams.api.entity.User;
import com.tka.sams.api.model.LoginRequest;

@Repository
public class UserDao {

	@Autowired
	private SessionFactory factory;

	public User loginUser(LoginRequest request) {
		Session session = null;
		User user = null;
		try {
			session = factory.openSession();
			user = session.get(User.class, request.getUsername());
			if(user!=null) {
				if(user.getPassword().equals(request.getPassword())) {
					return user;
				}
			}else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String deleteUserById(String username) {
		
		return null;
	}

	public User updateUser(User user) {
		
		return null;
	}

	public List<User> getAllUser() {
		
		return null;
	}

	public User getUserById(String username) {
		
		return null;
	}

	public User registerUser(User user) {
		
		return null;
	}

}
