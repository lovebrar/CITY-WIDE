package com.crm.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	public HomePage() {
		PageFactory.initElements(driver, this);  //this is pointing to current class object
	}
	
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	
}
