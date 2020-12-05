package com.android;

import com.android.Dao.Entity.User;
import com.android.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AndroidApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	public void find() {
		String a = "17596567126";
		String b = "yys19980115";
		User findById = userService.find(a,b);
		System.err.println(findById);
	}

}
