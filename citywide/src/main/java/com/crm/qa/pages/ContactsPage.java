package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//label[contains(text(),'First Name')]")
	WebElement firstName;
	
	@FindBy(xpath="//label[contains(text(),'Last Name')]")
	WebElement lastName;
	
	@FindBy(xpath="//label[contains(text(),'Email Address')]")
	WebElement emailAddress;
	
	@FindBy(xpath="//label[contains(text(),'Your Company')]")
	WebElement companyName;
	
	@FindBy(xpath="//label[contains(text(),'Your Message')]")
	WebElement messageyName;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement sendMessagebutton;
	
	
	@FindBy(xpath="//h1[@class='heading-style-2 contact-page']")
	WebElement contactsLabel;
	

	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifycontactsLabel() {
		return contactsLabel.isDisplayed();
	}
	
	public String verifyContactsPageTitle() {
		return driver.getTitle();
	}
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}

	public void createNewQuery(String ftname, String ltname, String emailadd, String cmpname, String msgname) {
		firstName.sendKeys(ftname);
		lastName.sendKeys(ltname);
		emailAddress.sendKeys(emailadd);
		companyName.sendKeys(cmpname);
		messageyName.sendKeys(msgname);
		sendMessagebutton.click();
	}
}
