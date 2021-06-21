package com.dws.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dws.base.TestBase;
import com.dws.pagesActions.HomePageActions;

public class HomeTest {
	
	LoginTest login = new LoginTest();

	@BeforeTest
	public void setup() {
		TestBase.initialization();
	}
	
	@Test
	public void home() throws InterruptedException {
		login.login();
		HomePageActions actions = new HomePageActions();
		
		TestBase.verifyEquals(actions.username(), "qwerty@dws");
		
		Thread.sleep(5000);
		
		actions.logoff();
		
		
	}
}
