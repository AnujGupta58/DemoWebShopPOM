package com.dws.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dws.base.TestBase;
import com.dws.pagesActions.LoginActions;

public class LoginTest {

	@BeforeTest
	public void setup() {
		TestBase.initialization();
	}
	
	@Test
	public void login() {
		LoginActions actions = new LoginActions();
		actions.login();
		actions.setEmail("qwerty@dws.com"); 
		actions.setPassword("demoabc");
		actions.loginbtn();
	}
}
