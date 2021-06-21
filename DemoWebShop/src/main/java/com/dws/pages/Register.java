package com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dws.base.TestBase;

public class Register extends TestBase {
	
	@FindBy(xpath="//a[@class='ico-register']")
	public WebElement registerBtn; 
	
	@FindBy(id="gender-male")
	public WebElement male;
	
	@FindBy(id="gender-female")
	public WebElement female;
	
	@FindBy(name="FirstName")
	public WebElement firstName;
	
	@FindBy(name="LastName")
	public WebElement lastName;
	
	@FindBy(name="Email")
	public WebElement email;
	
	@FindBy(name="Password")
	public WebElement password;
	
	@FindBy(name="ConfirmPassword")
	public WebElement confimPassword;
	
	@FindBy(name="register-button")
	public WebElement rgstrBtn;
	
	@FindBy(xpath = "//a[contains(text(),'.com')]")
	public WebElement username;
	
	@FindBy(xpath = "//div[@class='result']")
	public WebElement registerMsg;
	
	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement continueBtn;
}
	