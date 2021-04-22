package com.crm.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;


public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginpage= new LoginPage();
	}
	
	@Test(priority=1)
	public void validateHomePageTitle() {
		String title=loginpage.verifyHomePageTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Citywide Group | Home");
	}
	
	@Test(priority=2)
	public void CitywideLogoImageTest() {
		boolean flag= loginpage.citywidelogo();
		Assert.assertTrue(flag);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	

}
