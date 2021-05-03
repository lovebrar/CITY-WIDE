package com.crm.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class CreateAccountPage extends TestBase{
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement gendermr;
	@FindBy(xpath="	//input[@id='id_gender2']")
	WebElement gendermrs;
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement firstName;
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement lastName;
	@FindBy(xpath="//input[@id='email']")
	WebElement emailAddress;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement passWord;
	@FindBy(xpath="//select[@id='days']")
	WebElement dobDays;
	@FindBy(xpath="//select[@id='months']")
	WebElement dobMonths;
	@FindBy(xpath="//select[@id='years']")
	WebElement dobYears;
	@FindBy(xpath="//input[@id='firstname']")
	WebElement firstNameAdd;
	@FindBy(xpath="//input[@id='lastname']")
	WebElement lastNameAdd;
	@FindBy(xpath="//input[@id='company']")
	WebElement companyName;
	@FindBy(xpath="//input[@id='address1']")
	WebElement addressName;
	@FindBy(xpath="//select[@id='years']")
	WebElement cityName;
	@FindBy(xpath="//select[@id='id_state']")
	WebElement stateName;
	@FindBy(xpath="//input[@id='postcode']")
	WebElement postCode;
	@FindBy(xpath="//select[@id='id_country']")
	WebElement country;
	@FindBy(xpath="//input[@id='phone']")
	WebElement homePhone;
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement mobilePhone;
	@FindBy(xpath="//input[@id='alias']")
	WebElement alias;
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement registerButton;
	
	public CreateAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCreateAccountPageTitle() {
		return driver.getTitle();
	}
	

	public void createNewAccount( String ftName, String ltName,String pswd, String comp, String add, String ctyname, String postname, String phnmb) {
		gendermr.click();
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		passWord.sendKeys(pswd);
		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByValue("4");
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("April ");
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByValue("2018");
		companyName.sendKeys(comp);
		addressName.sendKeys(add);
		cityName.sendKeys(ctyname);
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Illinois");
		postCode.sendKeys(postname);
		mobilePhone.sendKeys(phnmb);
		registerButton.click();
	
	}
}
