package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
//define Page Factory-OR Object Repository 
	
	@FindBy(xpath="//a[contains(text(),'Citylink')]")      //no need to write driver.findElement Keyword
	WebElement Citylink;
	
	@FindBy(xpath="//a[contains(text(),'Security')]")
	WebElement Security;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement Login;
	
	@FindBy(xpath="//header[@class='header desktop sticky-nav']//div[@class='container-1300px']//nav//ul[@class='header-nav-list']//li[@class='header-nav-list-item']//a[@class='header-nav-link last outlined'][contains(text(),'Contact Us')]")
	WebElement contactUs;

	@FindBy(xpath="//a[@class='w-inline-block']//img[@class='image']")
	WebElement citywidelogo;
	
//Create constructor of login page and Initialize Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);  //this is pointing to current class object
	}

//Actions/ Methods
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean citywidelogo() {
		return citywidelogo.isDisplayed();
	}
	
	public ContactsPage clickonContactLink() {
		contactUs.click();
		return new ContactsPage();    //returning contacts page Object
	}
	

	public HomePage clickonLoginLink() {
		Login.click();
		return new HomePage();     //returning login page Object
	}
	
	
}
