package com.backstage;

import com.backstage.Dao.Entity.User;
import com.backstage.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BackstageApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		String a = "17596567126";
		String b = "yys19980115";
		String c = "admim";
		String d = "123456";
		User find = userService.find(c,d);
		System.err.println(find);
	}

}
