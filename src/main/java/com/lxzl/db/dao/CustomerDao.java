package com.lxzl.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxzl.db.bean.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long>{

    /** 
     * 根据客户名称查询客户
     * @param userName 
     * @return 
     */  
	Customer findByName(String userName);  
}
