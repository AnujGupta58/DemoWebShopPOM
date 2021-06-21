package com.dws.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dws.base.TestBase;
import com.dws.pagesActions.RegisterActions;

public class RegisterTest {

	@BeforeTest
	public void setup() {
		TestBase.initialization();
	}
	
	@Test
	public void register() {
		RegisterActions actions = new RegisterActions();
		actions.registerbtn();	
		actions.gender();
		actions.setFirstName("ABC");
		actions.setLastName("DEF");
		actions.setEmail("qwerty@dws.com");
		actions.setPassword("demoabc");
		actions.setConfirmPassword("demoabc");
		actions.clickRegister();
	}
	
	@AfterTest
	public void close() {
		//TestBase.tearDown();
	}
}
