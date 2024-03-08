package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;

public class OpenAccountPage extends TestBase {

    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement openAccountBtn;

    @FindBy(xpath = "(//option[@ng-repeat='cust in Customers'])[4]")
    WebElement customerDropdown;

    @FindBy(xpath = "//option[@value='Rupee']")
    WebElement currencyDropdown;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processBtn;

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public OpenAccountPage clickOnOpenAccount() {
        openAccountBtn.click();
		return new OpenAccountPage();
    }
    public OpenAccountPage ClickonCustomerDropdown() {
        customerDropdown.click();
		return new  OpenAccountPage();
        
    }
    public OpenAccountPage ClickonCurrencyDropdown() 
    {
    	currencyDropdown.click();
    	
		return new OpenAccountPage();
		
    }
    public OpenAccountPage Processbutton() {
    	processBtn.click();
		return new OpenAccountPage();
    }

	public boolean isAccountOpenedSuccessfully() {
		// TODO Auto-generated method stub
		return true;
	}
}
  
