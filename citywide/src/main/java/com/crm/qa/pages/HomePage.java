package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
 
	
	@FindBy(xpath="//a[@href='/citylink']  ")      
	WebElement Citylink;
	
	@FindBy(xpath="//a[@href='/automatics']")      
	WebElement Automatics;
	
	@FindBy(xpath="//a[contains(text(),'Security')]")
	WebElement Security;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	WebElement contactUs;

	@FindBy(xpath="//img[@class='image']")
	WebElement citywidelogo;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement login;

	public HomePage() {
		PageFactory.initElements(driver, this);  
	}


	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean citywidelogo() {
		return citywidelogo.isDisplayed();
	}
	
	public LoginPage clickonLoginLink() {
		login.click();
		return new LoginPage();    
	}
	
	public ContactsPage clickonContactLink() {
		contactUs.click();
		return new ContactsPage();    
	}
	
	public SecurityPage clickonSecurityLink() {
		Security.click();
		return new SecurityPage();     
	}
	
	
}
