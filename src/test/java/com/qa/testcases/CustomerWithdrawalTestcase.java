package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.CustomerLoginPage;
import com.qa.pages.CustomerWithdrawalPage;
import com.qa.util.TestUtil;

public class CustomerWithdrawalTestcase extends TestBase{
	CustomerLoginPage customerloginpage;
	TestUtil testutil;
	CustomerWithdrawalPage withdrawalpage;
	public CustomerWithdrawalTestcase() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		customerloginpage = new CustomerLoginPage();
		withdrawalpage= new CustomerWithdrawalPage();
	}
	
	//Test
		@Test(priority = 1)
		public void customerloginpagetest() {
			
		
			customerloginpage = customerloginpage.navigatetocustomerselection();
			
			withdrawalpage = withdrawalpage.clickOnWithdrawSection();
			
			withdrawalpage = withdrawalpage.enterAmount("300");
			
			withdrawalpage = withdrawalpage.clickOnWithdrawlButton();
			Assert.assertTrue(withdrawalpage.isTransactionSuccessful(), "Amount was not Withdrawed successfully.");
			}
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		
		}


}
