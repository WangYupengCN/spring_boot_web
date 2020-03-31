package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
	private UserService userService;

	@Test
	void contextLoads() {

	}

	@Test
    void testService(){
	    Long start = System.currentTimeMillis();
        User user = userService.findUserById(1L);
        user.getName();
        System.err.println(System.currentTimeMillis()-start);
    }

}
