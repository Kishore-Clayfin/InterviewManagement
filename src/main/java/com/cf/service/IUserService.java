package com.cf.service;

import java.util.List;

import com.cf.model.User;

public interface IUserService {
	User findById(int id);

	User login(String userName, String password);

	boolean existsUserByUsernameAndPassword(String name, String password);

	void saveUser(User user);

	List<User> viewUserList();

	User updateUser(Integer userId);

	void deleteUser(Integer userId);

	User findUsername(String name);

	boolean existsUserByEmail(String email);
	
	String getAuthentication();
}
