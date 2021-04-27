package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase {
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	String sheetName = "contacts";
	
	public ContactPageTest() {
		super();    
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage= new HomePage();    
		 testUtil= new TestUtil();
		 contactsPage= new ContactsPage();
		 contactsPage= homePage.clickonContactLink();
	}
	
	
	@Test(priority=1)
	public void validateContactsPageTitle() {
		String title=contactsPage.verifyContactsPageTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Contact Us | Citywide Group");
	}
	
	
	 //@DataProvider
		public Object[][] getCitywideTestData(){
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
	    
	 //   @Test(priority=3, dataProvider="getCitywideTestData")
	    public void createNewQueryTest(String firstName, String lastName,String emailAdd,  String companyName, String msgName){
	    	homePage.clickonContactLink();
	    	contactsPage.createNewQuery(firstName, lastName,emailAdd, companyName, msgName);
	    }
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
