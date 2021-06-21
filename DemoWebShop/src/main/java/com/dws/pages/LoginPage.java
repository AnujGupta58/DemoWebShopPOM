package com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath = "//a[@class='ico-login']")
	public WebElement login;
	
	@FindBy(xpath="//input[@value='Register']")
	public WebElement registerBtn;
	
	@FindBy(id="Email")
	public WebElement email;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy(id="RememberMe")
	public WebElement rememberMe;
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	public WebElement forgotPassword;
	
	@FindBy(xpath="//input[@value='Log in']")
	public WebElement logInbtn;
}
