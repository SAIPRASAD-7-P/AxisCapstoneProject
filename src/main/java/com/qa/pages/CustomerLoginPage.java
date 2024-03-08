package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class CustomerLoginPage extends TestBase{
		
		//Page Factory - OR:
		@FindBy(xpath="//button[contains(text(),'Customer Login')]")
		WebElement customerloginbutton;
		
		@FindBy(xpath="//select[@id='userSelect']")
		WebElement dropdown;
		
		@FindBy(xpath="//option[contains(text(),'Hermoine Granger')]")
		WebElement name;
		
		@FindBy(xpath="//button[contains(text(),'Login')]")
		WebElement Loginbutton;
		
		@FindBy(xpath="//span[contains(text(),'Hermoine Granger')]")
		WebElement message;
		
		@FindBy(xpath="(//button[@class='btn btn-lg tab'])[2]")
		WebElement deposit;
		
		@FindBy(xpath="//button[@ng-click='withdrawl()']")
		WebElement withdrawl;
		
		@FindBy(xpath="//button[@ng-click='transactions()']")
		WebElement Transactions;
		
//		@FindBy(xpath="//button[@class='btn btn-lg tab'])[2]")
//		WebElement CustomerDepositclick;
//		
//	    @FindBy(xpath="//button[@class='btn btn-lg tab'])[3]")
//	    WebElement withdrawalclick;
//		
		
		
		
		
		//Initializing the Page Objects:
		public CustomerLoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public CustomerLoginPage navigatetocustomerselection() {
		customerloginbutton.click();
		dropdown.click();
		name.click();
		Loginbutton.click();
		return new CustomerLoginPage();
		}
		public boolean navigatetocustomerhomepage() {
		return message.isDisplayed();
		}
	
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public CustomerDepositsPage navigatetodeposit() {
			deposit.click();
			return new CustomerDepositsPage();
			
		}
		
		public CustomerWithdrawalPage navigatetowithdrawl(){
			withdrawl.click();
			return new CustomerWithdrawalPage();
		}
	
		public CustomerTransactionsPage navigatetotransactions() {
			Transactions.click();
			return new CustomerTransactionsPage();
			
		}
		
}

