package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sdev.App;


public class AppTest {
	
	@Test(enabled = false)
	public void testlogin1()
	{
		App myapp =new App();
		Assert.assertEquals(0, myapp.userLogin("abc", "abc123"));
	}
	
	@Test
	public void testlogin2()
	{
		App myapp =new App();
		Assert.assertEquals(1, myapp.userLogin("abc", "abc1"));
	}

}
