package com.lxzl.service;

import com.lxzl.db.bean.User;

/**
 * @author wnn
 *
 */
public interface UserService {

    /** 
     * 根据用户名称获取用户信息
     * @param userName 
     * @return 
     */  
    User findByUserName(String userName);  
    
    
    /**
     * 添加用户信息
     * @param user
     * @return
     */
    User seve(User user);
}
