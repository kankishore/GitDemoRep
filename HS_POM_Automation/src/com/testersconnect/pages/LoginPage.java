package com.testersconnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	@FindBy(css="input[type='email']")
	//@FindBy(xpath="//input[@type='email']")
	public WebElement txtEmail;
	
	@FindBy(css="input[type='password']")
	public WebElement txtPassword;
	
	//label[class*='private-checkbox']>span>input
	@FindBy(xpath="//span[contains(@class,'checkbox__icon private-checkbox__dash')]")
	public WebElement chkbtnRemember;
	
	@FindBy(css="button[class*='login-submit']")
	public WebElement btnLogin;
	
	@FindBy(css="h1")
	public WebElement pageHeading;
	
	@FindBy(xpath="//a/span/span/span[.='Gratis']")
	public WebElement lnkAccount;
}
