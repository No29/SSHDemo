package com.yx.sms.application.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yx.sms.application.HelloWorldService;
import com.yx.sms.application.TestService;
@Service
public class HelloWorldServiceImpl implements HelloWorldService {
	
	@Autowired
	TestService testService;
	@Override
	public String getNewName(String userName) {
		// TODO Auto-generated method stub
		return userName+"----------"+testService.PrintString(userName);
	}

}
