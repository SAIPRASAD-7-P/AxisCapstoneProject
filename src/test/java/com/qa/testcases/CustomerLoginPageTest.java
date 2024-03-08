package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CustomerLoginPage;
import com.qa.util.TestUtil;

public class CustomerLoginPageTest extends TestBase {
	CustomerLoginPage customerloginpage;
	TestUtil testutil;
	

	public CustomerLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		customerloginpage = new CustomerLoginPage();
	}
//Test
	@Test(priority = 1)
	public void customerloginpagetest() {
		
	
		customerloginpage = customerloginpage.navigatetocustomerselection();
		Assert.assertTrue(customerloginpage.navigatetocustomerhomepage());

	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

	
}
