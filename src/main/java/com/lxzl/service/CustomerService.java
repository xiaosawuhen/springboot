package com.lxzl.service;

import com.lxzl.db.bean.Customer;

public interface CustomerService {

    /** 
     * 根据客户名称获取客户信息
     * @param userName 
     * @return 
     */  
	Customer findByUserName(String userName);  
    
    
    /**
     * 添加客户信息
     * @param user
     * @return
     */
	Customer seve(Customer user);
}
