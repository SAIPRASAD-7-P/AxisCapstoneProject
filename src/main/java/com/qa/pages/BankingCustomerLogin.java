package com.qa.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

@SuppressWarnings("unused")
public class BankingCustomerLogin extends TestBase {

	@FindBy(xpath = "//button[@ng-click='customer()']")
    WebElement customerLoginBtn;
    @FindBy(xpath = "(//*[@id=\"userSelect\"])/option[@value='3']")
    WebElement customeNameBtn;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement lgnBtn;
    
    

    public BankingCustomerLogin() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnCustomerLogin() {
        customerLoginBtn.click();
        //customerDropdownBtn.click();
        customeNameBtn.click();
        lgnBtn.click();        
        
    }

	public void click() {
		// TODO Auto-generated method stub
		
	}

}
