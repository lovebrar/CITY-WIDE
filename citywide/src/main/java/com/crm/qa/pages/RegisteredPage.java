package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class RegisteredPage extends TestBase {
	@FindBy(xpath="//span[contains(text(),'My personal information')]")      
	WebElement personalInfo;
	@FindBy(xpath="//span[contains(text(),'My addresses')]")      
	WebElement myAddress;
	@FindBy(xpath="//span[contains(text(),'My credit slips')]")      
	WebElement myCreditSlips;
	@FindBy(xpath="//span[contains(text(),'Order history and details')]")      
	WebElement orderHistory;
	@FindBy(xpath="//span[contains(text(),'My wishlists')]")      
	WebElement wishListButton;
	@FindBy(xpath="	//span[contains(text(),'Home')]")      
	WebElement homeButton;
	@FindBy(xpath="//span[contains(text(),'love brar')]")      
	WebElement registereduserName;
	@FindBy(xpath="//div[@class='shopping_cart']")      
	WebElement shoppingcartButton;
	@FindBy(xpath="//input[@id='search_query_top']")      
	WebElement searchButton;
	@FindBy(xpath="	//h4[contains(text(),'Categories')]")      
	WebElement categoriesButton;
	@FindBy(xpath="	//a[contains(text(),'My account')]")      
	WebElement myAccountButton;
	@FindBy(xpath="	//section[@id='block_contact_infos']//div")      
	WebElement storeInfoButton;
	@FindBy(xpath="		//a[contains(text(),'support@seleniumframework.com')]")      
	WebElement storeEmailButton;
	@FindBy(xpath="	//span[contains(text(),'(347) 466-7432')]")      
	WebElement storePhoneButton;
	@FindBy(xpath="	//img[@class='logo img-responsive']")      
	WebElement myStorelogo;
	@FindBy(xpath="//span[@class='shop-phone']")      
	WebElement myStorephone;
	@FindBy(xpath="//div[@id='contact-link']//a[contains(text(),'Contact us')]")      
	WebElement contactUsButton;
	@FindBy(xpath="//a[@class='sf-with-ul'][contains(text(),'Women')]")      
	WebElement womenButton;
	@FindBy(xpath="//a[@class='logout']")      
	WebElement logOutButton;
	@FindBy(xpath="//body[@id='my-account']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]")      
	WebElement tshirtButton;
	@FindBy(xpath="//li[@class='sfHover']//a[@class='sf-with-ul'][contains(text(),'Dresses')]")      
	WebElement dressesButton;
	@FindBy(xpath="//li[@class='sfHover']//ul[@style='display: none;']//li//a[contains(text(),'Casual Dresses')]")      
	WebElement casualDressesButton;
	
	@FindBy(xpath="//li[@class='sfHover']//ul[@class='submenu-container clearfix first-in-line-xs']//li//a[contains(text(),'Evening Dresses')]")      
	WebElement eveningDressesButton;
	
	public RegisteredPage() {
		PageFactory.initElements(driver, this);  
	}

	public String verifyRegisteredPageTitle() {
		return driver.getTitle();
	}
	public boolean verifyRegisteredUsernameTitle() {
		return registereduserName.isDisplayed();
	}
	public boolean myStorelogoTitle() {
		return myStorelogo.isDisplayed();
	}
	public boolean phoneNum() {
		return myStorephone.isDisplayed();	
	}
	
	public boolean verifyStoreInformation() {
		return storeEmailButton.isDisplayed();
	}
	public boolean verifyStoreInformation1() {
		return storePhoneButton.isDisplayed();
	}
	public boolean verifyStoreInformation2() {
		return storePhoneButton.isDisplayed();
	}
	
	public PersonalInfoPage clickonpersonalInfo() {
		personalInfo.click();
		return new PersonalInfoPage();   
	}
	
	public CreditSlipsPage clickoncreditSlips() {
		myCreditSlips.click();
		return new CreditSlipsPage();
	}
	
	public MyAddressPage clickonmyAddress() {
		myAddress.click();
		return new MyAddressPage();
	}
	public WishListPage clickonWishlistButton() {
		wishListButton.click();
		return new WishListPage();
	}
	public OrderHistoryPage clickonorderHistory() {
		orderHistory.click();
		return new OrderHistoryPage();
	}
	
	public HomePage clickonhomeButton() {
		homeButton.click();
		return new HomePage();
	}
	
	public LoginPage clickonLogout() {
		logOutButton.click();
		return new LoginPage();
	}

	public void clickOnWomenLink(){
		Actions action = new Actions(driver);
		action.moveToElement(womenButton).build().perform();
		casualDressesButton.click();	
	}
	
	public void clickOndressesLink(){
		Actions action = new Actions(driver);
		action.moveToElement(dressesButton).build().perform();
		eveningDressesButton.click();	
	}
	public boolean tShirt() {
		return dressesButton.isDisplayed();	
	}
}
