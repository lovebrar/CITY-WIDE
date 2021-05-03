package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath="//span[@class='shop-phone']")      
	WebElement phoneNumber;
	@FindBy(xpath="//input[@id='email_create']")      
	WebElement emailAddress;
	@FindBy(xpath="//div[@id='contact-link']//a[contains(text(),'Contact us')]")
	WebElement contactUs;
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement yourLogo;
	@FindBy(xpath="//a[@class='login']")
	WebElement signIn;
	@FindBy(xpath="//a[contains(text(),'My orders')]")
	WebElement myOrders;
	@FindBy(xpath="//input[@id='email']")      
	WebElement alreadyregEmail;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement signInButton;
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement createAccount;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);  
	}
		
	public String verifySignInPageTitle() {
		return driver.getTitle();
	}
	
	public CreateAccountPage createAccount(String un) {
		emailAddress.sendKeys(un);
		createAccount.click();
		return new CreateAccountPage();
	}
	public CreateAccountPage createAccount1() {
		emailAddress.sendKeys("brarxjdjdjfyx123@gmail.com");
		createAccount.click();
		return new CreateAccountPage();
	}
	
	public RegisteredPage registeredAccount(String un, String pwd) {
		alreadyregEmail.sendKeys(un);
		password.sendKeys(pwd);
		signInButton.click();
		return new RegisteredPage();
	}
	
	
	
}
