package com.ly.dubbo.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ly.dubbo.domain.User;
import com.ly.dubbo.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	 @RequestMapping(value = "/list", method = RequestMethod.GET)  
	 public String list(Model model) {  
	     List<User> list = userService.getListUser();  
	     model.addAttribute("list", list);  
	     System.out.println(list);
	     //list.jsp + model = ModelAndView  
	     return "list";// /WEB-INF/jsp/"list".jsp  
	 }  
}
