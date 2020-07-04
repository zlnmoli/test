package com.qa.test;

import org.testng.annotations.Test;

import com.qa.base.Second2;

public class Second2Test {
	
	Second2 s = new Second2();
	@Test
	public void a(){
		System.out.println(s.test());
		System.out.println("你好..................................");
	}
}
