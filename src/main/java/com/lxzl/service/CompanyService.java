package com.lxzl.service;

import com.lxzl.db.bean.Company;

public interface CompanyService {

    /** 
     * 根据公司名稱称取得公司信息
     * @param userName 
     * @return 
     */  
	Company findByName(String userName);  
}
