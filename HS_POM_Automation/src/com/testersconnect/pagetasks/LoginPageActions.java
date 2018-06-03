package com.testersconnect.pagetasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testersconnect.pages.LoginPage;
import com.testersconnect.tests.TestCaseBase;


public class LoginPageActions {

	//WebDriver driver;
	LoginPage lp=PageFactory.initElements(TestCaseBase.driver, LoginPage.class);
	public void login() {
		
		
		lp.txtEmail.sendKeys("kankishore@gmail.com");
		lp.txtPassword.sendKeys("Hubspot@123");
		lp.chkbtnRemember.click();
		lp.btnLogin.click();
		
		//Verify that login is successful
		String h1=lp.pageHeading.getText();
		Assert.assertEquals(h1, "HubSpot Accounts");//1
		boolean rc=lp.lnkAccount.isDisplayed();
		Assert.assertEquals(rc, true);
		
		lp.lnkAccount.click();
		
	}
	
	
}
