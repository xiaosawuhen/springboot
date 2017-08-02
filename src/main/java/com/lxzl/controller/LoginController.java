package com.lxzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lxzl.bean.Company;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginpage() {

		ModelAndView mv = new ModelAndView();

		Company company = new Company();

		mv.addObject(company);

		mv.setViewName("login");

		return mv;
	}

	@RequestMapping("/test")
	public String test(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", "保存用户成功！");// 使用addFlashAttribute,参数不会出现在url地址栏中
//		ModelAndView mv = new ModelAndView("");// redirect模式
		return "redirect:/";
	}
}
