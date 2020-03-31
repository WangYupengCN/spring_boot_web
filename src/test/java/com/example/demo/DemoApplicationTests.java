package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
    void testService(){
	    Long start = System.currentTimeMillis();
        System.err.println(System.currentTimeMillis()-start);
    }

}
