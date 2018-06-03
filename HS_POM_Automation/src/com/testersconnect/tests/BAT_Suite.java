

package com.testersconnect.tests;

import org.testng.annotations.Test;

import com.testersconnect.pagetasks.DealsPageActions;
import com.testersconnect.pagetasks.LoginPageActions;

public class BAT_Suite extends TestCaseBase {

	
	@Test(priority=1)
	public void verifyHSLogin() {
		LoginPageActions lpa=new LoginPageActions();
		lpa.login();
		
	}
	
	@Test(priority=2)
	public void verifyCreateDeal() {
		DealsPageActions dpa=new DealsPageActions();
		dpa.createDeal();
	}
	
	
	
}
