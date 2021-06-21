package com.dws.pagesActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.dws.base.TestBase;
import com.dws.pages.LoginPage;

public class LoginActions extends TestBase{

	LoginPage loginPage;
	
	public LoginActions() {
		this.loginPage = new LoginPage();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.loginPage);
		// TODO Auto-generated constructor stub
	}
	
	public void login() {
		click(loginPage.login);
	}
	
	public void setEmail(String email) {
		type(loginPage.email, email);
	}
	
	public void setPassword(String password) {
		type(loginPage.password, password);
	}
	
	public void loginbtn() {
		click(loginPage.logInbtn);
	}
	
}
