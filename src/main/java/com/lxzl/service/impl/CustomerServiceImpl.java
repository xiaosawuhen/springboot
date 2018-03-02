package com.lxzl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxzl.db.bean.Customer;
import com.lxzl.db.dao.CustomerDao;
import com.lxzl.service.CustomerService;

@Service("customerService") 
public class CustomerServiceImpl implements CustomerService {

    @Autowired  
    private CustomerDao customerDao;  
    
	@Override
	public Customer findByUserName(String userName) {
		return customerDao.findByName(userName);
	}

	@Override
	public Customer seve(Customer user) {
		return customerDao.save(user);
	}

}
