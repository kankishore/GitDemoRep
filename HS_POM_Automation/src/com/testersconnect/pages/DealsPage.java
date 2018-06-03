package com.testersconnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealsPage {

	
	@FindBy(xpath="//span[contains(@data-key,'addDeal')]")
	public WebElement btnCreateDeal;
	
	@FindBy(css="input[data-field='dealname']")
	public WebElement txtDealName;
	
	@FindBy(xpath="//label[contains(text(),'Deal stage')]/../div")
	public WebElement ddDealStage;
	
	@FindBy(xpath="//label[contains(text(),'Deal owner')]/../div")
	public WebElement ddDealOwner;
	
	
	
	
}
