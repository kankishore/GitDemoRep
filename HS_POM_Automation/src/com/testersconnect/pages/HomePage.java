package com.testersconnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	
	@FindBy(xpath="//span[@class='nav-parent-item-text' and contains(text(),'Deals')]")
	public WebElement menuDeals;
	
	@FindBy(xpath="//i18n-string[.='Deals']")
	public WebElement dealsHeader;
	
}
