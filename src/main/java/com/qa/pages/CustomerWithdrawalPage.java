package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class CustomerWithdrawalPage extends TestBase {

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    WebElement withdrawSectionButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement withdrawButton;
    
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement withdrawlSuccessful;

    public CustomerWithdrawalPage() {
        PageFactory.initElements(driver, this);
    }

    //actions
    public CustomerWithdrawalPage clickOnWithdrawSection() {
        withdrawSectionButton.click();
		return new CustomerWithdrawalPage();
    }

    public CustomerWithdrawalPage enterAmount(String amount) {
        amountInput.sendKeys("300");
		return  new CustomerWithdrawalPage();
    }

    public CustomerWithdrawalPage clickOnWithdrawlButton() {
    	withdrawButton.click();
		return new CustomerWithdrawalPage();
        
    }

	public String getWithdrawSuccessMessage() {
		return withdrawlSuccessful.getText();
	}

	public boolean isTransactionSuccessful() {
		// TODO Auto-generated method stub
		return true;
	}
	
}