package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
 
	//***************************WEBOBJECTS**************************************
	@FindBy(xpath="//span[@class='shop-phone'] ")      
	WebElement phoneNumber;
	@FindBy(xpath="//div[@id='contact-link']//a[contains(text(),'Contact us')]")
	WebElement contactUs;
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement yourLogo;
	@FindBy(xpath="//a[@class='login']")
	WebElement signIn;
	@FindBy(xpath="//a[contains(text(),'My orders')]")
	WebElement myOrders;
	@FindBy(xpath="//input[@id='search_query_top']")      
	WebElement searchButton;
	@FindBy(xpath="//a[contains(text(),'About us')]")
	WebElement aboutUs;
	//****************************INITIALISE WEBOBJECTS********************************
	public HomePage() {
		PageFactory.initElements(driver, this);  
	}

	//METHOD:
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean myStorelogo() {
		return yourLogo.isDisplayed();
	}
	
	public LoginPage clickonSigninLink() {
		signIn.click();
		return new LoginPage();    
	}
	
	public ContactsPage clickonContactsLink() {
		contactUs.click();
		return new ContactsPage();    
	}
	
}
