package com.lxzl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxzl.db.bean.User;
import com.lxzl.db.dao.UserDao;
import com.lxzl.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {

    @Autowired  
    private UserDao userDao;  
    
	@Override
	public User findByUserName(String userName) {
		return userDao.findByName(userName);
	}

	@Override
	public User seve(User user) {
		return userDao.save(user);
	}
}
