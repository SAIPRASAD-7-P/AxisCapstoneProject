package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.CustomerLoginPage;
import com.qa.pages.CustomerDepositsPage;
import com.qa.util.TestUtil;

public class CustomerDepositsTestcase extends TestBase {
	CustomerLoginPage customerloginpage;
	TestUtil testutil;
	CustomerDepositsPage depositpage;
	

	public CustomerDepositsTestcase() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		customerloginpage = new CustomerLoginPage();
		depositpage = new CustomerDepositsPage();
	}
//Test
	@Test(priority = 1)
	public void customerloginpagetest() {
		
		customerloginpage = customerloginpage.navigatetocustomerselection();
		depositpage = depositpage.navigatetodeposit();
		depositpage = depositpage.enteramount();
		depositpage = depositpage.btn();
		Assert.assertTrue(depositpage.isDepositSuccessful(), "Amount was not deposited successfully.");
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}   

}
