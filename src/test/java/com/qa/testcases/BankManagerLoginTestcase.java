package com.qa.testcases;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.BankManagerLoginPage;


public class BankManagerLoginTestcase extends TestBase {

	 BankManagerLoginPage managerlogin;

    public BankManagerLoginTestcase() {
        super(); // Constructor call to initialize WebDriver and load URL
    }

    @BeforeMethod
	public void setUp() throws IOException {
		initialization();
		managerlogin = new BankManagerLoginPage();
	}
//Test
	@Test(priority = 1)
	public void customerloginpagetest() {
		
	
		managerlogin = managerlogin.clickOnManagerLogin();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
