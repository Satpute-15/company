package com.example.company;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test() {
		assertEquals(10, 20);
	}
}
