package com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
	
	@FindBy(xpath = "//a[contains(text(),'.com')]")
	public WebElement username;
	
	@FindBy(css = "a.ico-logout")
	public WebElement logout;
	
	@FindBy(xpath = "//span[contains(text(),\"cart\")]")
	public WebElement shoppingCart;
	
	@FindBy(xpath = "//span[contains(text(),\"Wish\")]")
	public WebElement wishlist;
}
