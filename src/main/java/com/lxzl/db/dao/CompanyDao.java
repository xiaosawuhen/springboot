package com.lxzl.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxzl.db.bean.Company;

public interface CompanyDao extends JpaRepository<Company, Long> {

    /** 
     * 根据公司名稱称查询公司
     * @param userName 
     * @return 
     */  
	Company findByName(String userName);  
}
