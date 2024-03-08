package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.BankingCustomerLogin;

public class BankingCustomerTestcase extends TestBase {

    /**
     * Test Case: Validate Customer Login functionality.
     * 
     * Test Steps:
     * 1. Click on Customer Login button.
     * 2. Select customer name from dropdown.
     * 3. Click on Login button.
     */
	
    @Test
    public void validateCustomerLogin() {
    	BankingCustomerLogin customerLoginPage = new BankingCustomerLogin();
        // Step 1: Click on Customer Login button
        //customerLoginPage.clickOnCustomerLogin();
    	customerLoginPage.click();
        
        //driver.quit();
        // Add assertions to verify the successful login if needed
    }
}