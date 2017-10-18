package com.ly.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.dubbo.dao.IUserDao;
import com.ly.dubbo.domain.User;
import com.ly.dubbo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao ;
	
	public List<User> getListUser() {
		System.out.println("访问的端口是20880");
		return userDao.getListUser();
	}

}
