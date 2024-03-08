package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CustomerLoginPage;
import com.qa.pages.CustomerTransactionsPage;
import com.qa.util.TestUtil;

public class CustomerTransactionsTestcase extends TestBase{
	CustomerLoginPage customerloginpage;
	TestUtil testutil;
	CustomerTransactionsPage transactionpage;
	public CustomerTransactionsTestcase() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		customerloginpage = new CustomerLoginPage();
		transactionpage= new CustomerTransactionsPage();
	}
	//Test
			@Test(priority = 1)
			public void customerloginpagetest() {
				
				customerloginpage = customerloginpage.navigatetocustomerselection();
				transactionpage = transactionpage.clickOnTransactionSection();
			}
			@AfterMethod
			public void tearDown(){
				driver.quit();
			}
	
}
	