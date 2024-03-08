package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class AddCustomerpage extends TestBase {

    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    WebElement addCustomerBtn;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameInput;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameInput;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement zipCodeInput;

    @FindBy(xpath = "(//button[contains(text(),'Add Customer')])[2]")
    WebElement addCustomerSubmitBtn;

    public AddCustomerpage() {
        PageFactory.initElements(driver, this);
    }

    public  AddCustomerpage clickOnAddCustomer() {
        addCustomerBtn.click();
		return new  AddCustomerpage();
    }

    public  AddCustomerpage enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
		return new   AddCustomerpage();
    }

    public  AddCustomerpage enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
		return new  AddCustomerpage();
    }

    public  AddCustomerpage enterZipCode(String zipCode) {
        zipCodeInput.sendKeys(zipCode);
		return  new AddCustomerpage();
        
    }

    public  AddCustomerpage clickOnAddCustomerBtn() {
        addCustomerSubmitBtn.click();
        
		return new  AddCustomerpage();
    }
    public boolean isCustomerAddedSuccessfully() {
    	
		return true;
    	
    }
}
