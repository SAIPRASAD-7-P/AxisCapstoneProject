package com.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.base.TestBase;

public class BankManagerLoginPage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement managerLoginBtn;
    
    
    

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public  BankManagerLoginPage clickOnManagerLogin() {
    	managerLoginBtn.click();
		return new BankManagerLoginPage() ;
    }
}
        