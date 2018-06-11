package com.bt.tt.mapper;

import java.util.List;

import com.bt.tt.dao.User;

public interface TestMapper {
	List<User> getUsers();
	User getUser(String id);
	void insertUser(User user);
	void deleteUser(String id);
}
