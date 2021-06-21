package com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart {

	@FindBy(css = "select#CountryId")
	public WebElement country;
	
	@FindBy(css = "select.state-input")
	public WebElement state;
	
	@FindBy(css = "input#ZipPostalCode")
	public WebElement pincode;
	
	@FindBy(xpath = "//input[@value='Estimate shipping']")
	public WebElement estimateShipping;
	
	@FindBy(css = "input#termsofservice")
	public WebElement termsOfCondition;
	
	@FindBy(css = "button#checkout")
	public WebElement checkOut;
	
	
}
