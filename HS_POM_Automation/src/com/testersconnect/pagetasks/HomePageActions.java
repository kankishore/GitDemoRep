package com.testersconnect.pagetasks;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testersconnect.pages.HomePage;
import com.testersconnect.pages.LoginPage;
import com.testersconnect.tests.TestCaseBase;

public class HomePageActions {

	
	HomePage hp=PageFactory.initElements(TestCaseBase.driver, HomePage.class);
	
	public void navigateToDeals() {
		hp.menuDeals.click();
		boolean rc=hp.dealsHeader.isDisplayed();
		Assert.assertEquals(rc, true);
	}
	
	public void navigateToCompanies() {
		hp.menuDeals.click();
		boolean rc=hp.dealsHeader.isDisplayed();
		Assert.assertEquals(rc, true);
	}
	
	public void navigateToContacts () {
		hp.menuDeals.click();
		boolean rc=hp.dealsHeader.isDisplayed();
		Assert.assertEquals(rc, true);
	}
}
