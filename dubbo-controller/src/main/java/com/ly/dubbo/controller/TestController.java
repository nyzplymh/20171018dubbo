package com.ly.dubbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ly.dubbo.domain.User;
import com.ly.dubbo.service.IUserService;
import com.ly.dubbo.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
    @RequestMapping("/test")
    @ResponseBody
    public String testSay(@RequestParam(value = "name",defaultValue = "") String name) throws Exception{
        StringBuffer sb = new StringBuffer();
        sb.append("Dubbo: ").append(testService.build(name));
        return sb.toString();
    }
    
	@RequestMapping("/testDubbo")
	@ResponseBody
	public String sayDubbo(){
		String str = testService.testSayDubbo();
		return str;
	}

	@RequestMapping("/testSay")
	@ResponseBody
	public String sayHello(String name){
		String str = testService.say(name);
		return str;
	}
	
	@Autowired
	private IUserService userService;
	
	 @RequestMapping(value = "/list", method = RequestMethod.GET)  
	 public String list(Model model) {  
	     List<User> list = userService.getListUser();  
	     model.addAttribute("list", list);  
	     return "list";// /WEB-INF/jsp/"list".jsp  
	 }  
}
