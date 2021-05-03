package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CreateAccountPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.RegisteredPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	TestUtil testUtil;
	CreateAccountPage createaccountPage;
	HomePage homePage;
	RegisteredPage registeredPage;
	
	String sheetName = "createaccount";
	public LoginPageTest() {
	super();    
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 homePage= new HomePage();  
		 createaccountPage= new CreateAccountPage();
		 testUtil= new TestUtil();
		 loginPage= new LoginPage();
		 loginPage= homePage.clickonSigninLink();
	}
	
	@Test(priority=1)
	public void validateLoginPageTitle() {
		homePage.clickonSigninLink();
		String title=loginPage.verifySignInPageTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Login - My Store");	
	}
	
	@DataProvider
	public Object[][] getMyStoreTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2, dataProvider="getMyStoreTestData")
	public void validateCreateAccount(String email) {
		homePage.clickonSigninLink();
		loginPage.createAccount(email);	
	}
	
	@Test(priority=3)
	public void validateRegisteredPage() {
		homePage.clickonSigninLink();
		registeredPage= loginPage.registeredAccount(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@AfterMethod()
	public void TearDown() {
		driver.quit();
	}
}
