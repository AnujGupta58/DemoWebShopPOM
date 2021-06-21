package com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Computer {

	@FindBy(xpath = "//a[contains(text(),'cheap')]")
	public WebElement cheap;
	
	@FindBy(xpath = "//a[contains(text(),'Simple')]")
	public WebElement simple;
	
	@FindBy(xpath = "//input[starts-with(@id,'add-to-cart')]")
	public WebElement addToCart;
	
	@FindBy(xpath = "//label[contains(text(),'Slow')]/preceding-sibling::input")
	public WebElement slow_processor;
	
	@FindBy(xpath = "//label[contains(text(),'Medium')]/preceding-sibling::input")
	public WebElement medium_processor;
	
	@FindBy(xpath = "//label[contains(text(),'Fast')]/preceding-sibling::input")
	public WebElement fast_processor;
	
	@FindBy(xpath = "//label[contains(text(),'8 GB')]/preceding-sibling::input")
	public WebElement ram_8_GB;
	
	@FindBy(xpath = "//label[contains(text(),'2 GB')]/preceding-sibling::input")
	public WebElement ram_2_GB;
	
	@FindBy(xpath = "//label[contains(text(),'4 GB')]/preceding-sibling::input")
	public WebElement ram_4_GB;
	
	@FindBy(xpath = "//label[contains(text(),'320 GB')]/preceding-sibling::input")
	public WebElement HDD_320_GB;
	
	@FindBy(xpath = "//label[contains(text(),'400 GB')]/preceding-sibling::input")
	public WebElement HDD_400_GB;
	
	@FindBy(xpath = "//label[contains(text(),'Image Viever')]/preceding-sibling::input")
	public WebElement image_sw;
	
	@FindBy(xpath = "//label[contains(text(),'Office Suite  [+100.00]')]/preceding-sibling::input")
	public WebElement office_sw;
	
	@FindBy(xpath = "//label[contains(text(),'Other')]/preceding-sibling::input")
	public WebElement otherOffice_sw;
	
	@FindBy(css = "input.qty-input")
	public WebElement qty;
	
	@FindBy(css = "p.content")
	public WebElement addToCartDialog;
}
