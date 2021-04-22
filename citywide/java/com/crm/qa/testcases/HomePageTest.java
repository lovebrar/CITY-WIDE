package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	HomePage homePage;
	
	
	
	public HomePageTest() {
		super();    //base class constructor will be called and properties will be initialized
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginPage= new LoginPage();    //so i can access login page class methods
		 testUtil= new TestUtil();
		 contactsPage= new ContactsPage();
		 homePage= new HomePage();
		 homePage= loginPage.clickonLoginLink();
	}
	
	
	@Test(priority=1)
	public void validateHomePageTitle() {
		String title=homePage.verifyHomePageTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Login | Citywide Group");
		
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
