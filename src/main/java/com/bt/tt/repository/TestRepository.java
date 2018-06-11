package com.bt.tt.repository;

import java.util.List;

import com.bt.tt.dao.User;
import com.bt.tt.mapper.TestMapper;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("TestRepository")
public class TestRepository {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private TestMapper getMapper() {
		return sqlSessionTemplate.getMapper(TestMapper.class);
	}
	
	public List<User> getUsers() {
		return getMapper().getUsers();
	}
	
	public User getUser(String id) {
		return getMapper().getUser(id);
	}
	
	public void insertUser(User user) {
		getMapper().insertUser(user);
	}
	
	public void deleteUser(String id) {
		getMapper().deleteUser(id);
	}
}
