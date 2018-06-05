package com.bt.tt.service;

import java.util.List;

import com.bt.tt.dao.User;

public interface TestService {
	List<User> getUsers();
	User getUser(String id);
	void insertUser(User user);
	void deleteUser(String id);
}
