package com.dws.pagesActions;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.dws.base.TestBase;
import com.dws.pages.Register;


public class RegisterActions extends TestBase {
	
	
	public Register register;
	
	public RegisterActions() {
		this.register = new Register();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.register);
		// TODO Auto-generated constructor stub
	}
	
	public void registerbtn() {
		click(register.registerBtn);
	}
	
	public void gender() {
		click(register.male);
	}
	
	public void setFirstName(String value) {
		type(register.firstName, value);
	}
	
	public void setLastName(String value) {
		type(register.lastName, value);
	}
	
	public void setEmail(String value) {
		type(register.email, value);
	}
	
	public void setPassword(String value) {
		type(register.password, value);
	}
	
	public void setConfirmPassword(String value) {
		type(register.confimPassword, value);
	}
	
	public void clickRegister() {
		click(register.rgstrBtn);
	}
	
}
	