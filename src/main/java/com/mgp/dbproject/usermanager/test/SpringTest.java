package com.mgp.dbproject.usermanager.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mgp.dbproject.usermanager.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration( {"classpath:applicationContext.xml"} )
public class SpringTest {
    
	@Autowired
	private UserService userService;
	
	@Test
	public void test(){
		userService.removeUser();
	}
}
