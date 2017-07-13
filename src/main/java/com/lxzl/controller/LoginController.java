package com.lxzl.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lxzl.bean.Company;

@RestController
@EnableAutoConfiguration()
public class LoginController {

    @RequestMapping(value = {"/",""})
    public ModelAndView helloboot(){

    	ModelAndView mv = new ModelAndView();
    	
    	Company company = new Company();
    	company.setName("XXXX有限公司");
    	
    	mv.addObject(company);
    	
    	mv.setViewName("index");
    	
        return mv;
    }
}
