package com.qa.testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddCustomerpage;
import com.qa.pages.BankManagerLoginPage;
import com.qa.pages.OpenAccountPage;

public class OpenAccountTestcase extends TestBase {

	 BankManagerLoginPage managerLogin;
	 OpenAccountPage openaccount;

    public OpenAccountTestcase() {
        super(); // Constructor call to initialize WebDriver and load URL
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        managerLogin = new BankManagerLoginPage();
        openaccount = new OpenAccountPage();
    
    }
    
    @Test(priority = 1)
	public void customerloginpagetest() {
		
	
		managerLogin = managerLogin.clickOnManagerLogin();
		openaccount = openaccount.clickOnOpenAccount();
		openaccount = openaccount.ClickonCustomerDropdown();
		openaccount = openaccount.ClickonCurrencyDropdown();
		openaccount = openaccount.Processbutton();
		Assert.assertTrue(openaccount.isAccountOpenedSuccessfully(), "Account was not opened successfully.");
    }
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
