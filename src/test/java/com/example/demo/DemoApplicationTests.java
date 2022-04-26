package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

	@Resource
	private RepeatStrDemo repeatStrDemo;

	@Resource
	private ReplaceStrDemo replaceStrDemo;

	@Test
	void replace() {
		System.out.println(repeatStrDemo.removeRepeatStr("aabcccbbad"));
	}

	@Test
	void repeat() {
		System.out.println(replaceStrDemo.replace("abcccbad"));
	}

}
