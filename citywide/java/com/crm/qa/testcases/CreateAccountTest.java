package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CreateAccountPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class CreateAccountTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	TestUtil testUtil;
	CreateAccountPage createaccountPage;
	
	String sheetName = "credentials";
	
	public CreateAccountTest() {
		super();    
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 homePage= new HomePage();  
		 createaccountPage= new CreateAccountPage();
		 testUtil= new TestUtil();
		 loginPage= new LoginPage();
		 homePage.clickonSigninLink();
		 createaccountPage= loginPage.createAccount1();
	}
	
	
	@Test(priority=1)
	public void validateCreateAccountPageTitle() {
		String title=createaccountPage.verifyCreateAccountPageTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Login - My Store");
	}
	
	
	 @DataProvider
		public Object[][] getMyStoreTestData(){
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}

	 @Test(priority=2, dataProvider="getMyStoreTestData")
	    public void createNewContactTest(String firstname, String lastname, String password, String company, String address, String city, String postalcode, String mobilephone ){
	    	loginPage.createAccount1();
	    	createaccountPage.createNewAccount(firstname, lastname, password, company, address, city, postalcode, mobilephone);
	    }
	
	
	 @AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
