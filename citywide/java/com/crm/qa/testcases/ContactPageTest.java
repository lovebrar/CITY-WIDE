package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase {
	LoginPage loginPage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	String sheetName = "contacts";
	
	public ContactPageTest() {
		super();    //base class constructor will be called and properties will be initialized
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginPage= new LoginPage();    //so i can access login page class methods
		 testUtil= new TestUtil();
		 contactsPage= new ContactsPage();
		 contactsPage= loginPage.clickonContactLink();
	}
	
	@Test(priority=1)
	public void  verifyContactsLabelTest() {
    Assert.assertTrue( contactsPage.verifycontactsLabel(), "contact label is missing on the page");        
	}
	
	@Test(priority=2)
	public void validateContactsPageTitle() {
		String title=contactsPage.verifyContactsPageTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Contact Us | Citywide Group");
	}
	
	
	 @DataProvider
		public Object[][] getCitywideTestData(){
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
	    
	    @Test(priority=3, dataProvider="getCitywideTestData")
	    public void createNewQueryTest(String firstName, String lastName,String emailAdd,  String companyName, String msgName){
	    	loginPage.clickonContactLink();
	    	contactsPage.createNewQuery(firstName, lastName,emailAdd, companyName, msgName);
	    }
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
