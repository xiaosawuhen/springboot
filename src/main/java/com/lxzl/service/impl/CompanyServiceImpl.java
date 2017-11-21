package com.lxzl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxzl.db.bean.Company;
import com.lxzl.db.dao.CompanyDao;
import com.lxzl.service.CompanyService;

@Service("companyService")  
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	@Override
	public Company findByName(String userName) {
		return companyDao.findByName(userName);
	}
}
