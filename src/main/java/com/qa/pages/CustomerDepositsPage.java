package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class CustomerDepositsPage extends TestBase {

    @FindBy(xpath = "(//button[@class='btn btn-lg tab'])[2]")
    WebElement depositSectionButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton;
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement DepositSuccessful;

    public CustomerDepositsPage() {
        PageFactory.initElements(driver, this);
    }
    //actions
    public CustomerDepositsPage navigatetodeposit() {
    	depositSectionButton.click();
		return new CustomerDepositsPage();
    
    }
    
    public CustomerDepositsPage enteramount() {
    
    	amountInput.sendKeys("500");
    	return new CustomerDepositsPage();
    }
    
    public  CustomerDepositsPage btn() {
    	depositButton.click();
    	return new CustomerDepositsPage();
    }
	
	public boolean isDepositSuccessful() {
		// TODO Auto-generated method stub
		return true;
	}
		
    
	
	
}