package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void sum() {
		System.out.println("this is sum-DemoTest");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a + b);
	}

	@Test
	public void sub() {
		System.out.println("this is sub-DemoTest");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}

	@Test
	public void div() {
		System.out.println("this is div-DemoTest");
		int a = 10;
		int b = 20;
		Assert.assertEquals(2, b/a);
	}

	@Test
	public void multi() {
		System.out.println("this is multiplication-DemoTest");
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a * b);
	}

}
