package com.lxzl.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxzl.db.bean.User;

public interface UserDao extends JpaRepository<User, Long> {
	 
    /** 
     * 根据用户名称查询用户 
     * @param userName 
     * @return 
     */  
    User findByName(String userName);  
}
