package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CreateAccountPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.RegisteredPage;
import com.crm.qa.util.TestUtil;

public class RegisteredPageTest extends TestBase {
	LoginPage loginPage;
	TestUtil testUtil;
	CreateAccountPage createaccountPage;
	HomePage homePage;
	RegisteredPage registeredPage;
	public RegisteredPageTest() {
	super();    
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 homePage= new HomePage();  
		 createaccountPage= new CreateAccountPage();
		 testUtil= new TestUtil();
		 loginPage= new LoginPage();
		 registeredPage= new RegisteredPage();
		 homePage.clickonSigninLink();
		 registeredPage= loginPage.registeredAccount(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void validateRegisteredPageTitle() {
		String title=registeredPage.verifyRegisteredPageTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "My account - My Store");	
	}
	@Test(priority=2)
	public void LogoImageTest() {
		boolean flag= registeredPage.myStorelogoTitle();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void RegisteredNameTest() {
		Assert.assertTrue(registeredPage.verifyRegisteredUsernameTitle());
	}
	
	@Test(priority=4)
	public void verifyPersonalInfoTest() {
	    registeredPage.clickonpersonalInfo();
		
	}
	@Test(priority=5)
	public void verifymyAddressTest() {
	    registeredPage.clickonmyAddress();
		
	}
	@Test(priority=6)
	public void verifycreditSlipsTest() {
	    registeredPage.clickoncreditSlips();
		
	}
	@Test(priority=7)
	public void verifyOrderHistoryTest() {
	    registeredPage.clickonorderHistory();
		
	}
	@Test(priority=8)
	public void verifyWishlistTest() {
	    registeredPage.clickonWishlistButton();
		
	}
	@Test(priority=9)
	public void verifyhomeButtonTest() {
	    registeredPage.clickonhomeButton();
	    String Homepagetitle= homePage.verifyHomePageTitle();
	    System.out.println(driver.getTitle());
	    Assert.assertEquals(Homepagetitle, "My Store");
	}
	
	@Test(priority=9)
	public void verifylogoutButtonTest() {
	    registeredPage.clickonLogout();
	    String Loginpagetitle= loginPage.verifySignInPageTitle();
	    System.out.println(driver.getTitle());
	    Assert.assertEquals(Loginpagetitle, "Login - My Store");
		
	}
	@Test(priority=10)
	public void TshirtButtonTest() {
		boolean flag= registeredPage.tShirt();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11)
	public void WomenButtonTest() {
		boolean flag= registeredPage.tShirt();
		Assert.assertTrue(flag);
	}
	@AfterMethod()
	public void TearDown() {
		driver.quit();
	}
}
