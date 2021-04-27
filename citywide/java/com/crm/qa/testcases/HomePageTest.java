package com.crm.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


public class HomePageTest extends TestBase {
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage= new HomePage();
	}
	
	@Test(priority=1)
	public void validateHomePageTitle() {
		String title=homePage.verifyHomePageTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Citywide Group | Home");
	}
	
	@Test(priority=2)
	public void CitywideLogoImageTest() {
		boolean flag= homePage.citywidelogo();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	

}
