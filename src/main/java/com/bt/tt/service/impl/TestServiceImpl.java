package com.bt.tt.service.impl;

import java.util.List;

import com.bt.tt.dao.User;
import com.bt.tt.repository.TestRepository;
import com.bt.tt.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("TestServiceImpl")
public class TestServiceImpl implements TestService {
	
	@Autowired
	@Qualifier("TestRepository")
	private TestRepository testRepository;

	@Override
	public List<User> getUsers() {
		return testRepository.getUsers();
	}

	@Override
	public User getUser(String id) {
		return testRepository.getUser(id);
	}

	@Override
	public void insertUser(User user) {
		testRepository.insertUser(user);
	}

	@Override
	public void deleteUser(String id) {
		testRepository.deleteUser(id);
	}
}
