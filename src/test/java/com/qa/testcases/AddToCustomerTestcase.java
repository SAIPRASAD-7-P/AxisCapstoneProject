package com.qa.testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddCustomerpage;
import com.qa.pages.BankManagerLoginPage;

public class AddToCustomerTestcase extends TestBase {

	 BankManagerLoginPage managerLogin;
	 AddCustomerpage addcustomer;

    public AddToCustomerTestcase() {
        super(); // Constructor call to initialize WebDriver and load URL
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        managerLogin = new BankManagerLoginPage();
        addcustomer = new AddCustomerpage();
    
    }
    @Test(priority = 1)
	public void customerloginpagetest() {
		
	
		managerLogin = managerLogin.clickOnManagerLogin();
		addcustomer = addcustomer.clickOnAddCustomer();
		addcustomer = addcustomer.enterFirstName("sai");
		addcustomer = addcustomer.enterLastName("prasad");
		addcustomer = addcustomer.enterZipCode("533248");
		addcustomer = addcustomer.clickOnAddCustomerBtn();
		Assert.assertTrue(addcustomer.isCustomerAddedSuccessfully(), "Customer was not added successfully.");
		
	}
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}

}