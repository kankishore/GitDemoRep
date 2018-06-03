package com.testersconnect.pagetasks;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.testersconnect.pages.DealsPage;
import com.testersconnect.pages.HomePage;
import com.testersconnect.tests.TestCaseBase;

public class DealsPageActions {

	
	DealsPage dp=PageFactory.initElements(TestCaseBase.driver, DealsPage.class);

	
	public void createDeal() {
		HomePageActions hpa=new HomePageActions();
		hpa.navigateToDeals();
		
		dp.btnCreateDeal.click();
		dp.txtDealName.sendKeys("Deal1");
		Select sl=new Select(dp.ddDealStage);
		sl.selectByVisibleText("Contract Sent");
		
		
		
		
	}
	
	
	
	
}
