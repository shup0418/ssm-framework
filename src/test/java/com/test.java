package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.User;
import com.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class test {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Test
	public void test() {
		User u = userService.getUserById("102");
		System.out.println(u.getUserNm());
	}
}
