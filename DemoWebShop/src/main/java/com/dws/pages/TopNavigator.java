package com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dws.base.TestBase;

public class TopNavigator extends TestBase {
	
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Books')]")
	public WebElement books;
	
	@FindBy(xpath = "//ul[@class='top-menu']//child::li[2]//a[contains(text(),'Computer')]")
	public WebElement computer;
	
	@FindBy(xpath = "//ul[@class='top-menu']//child::li[3]//a[contains(text(),'Electronics')]")
	public WebElement electronics;
	
	@FindBy(xpath = "//ul[@class='top-menu']//child::li[4]//a[contains(text(),'App')]")
	public WebElement apparel_shoes;
	
	@FindBy(xpath = "//ul[@class='top-menu']//child::li[5]//a[contains(text(),'Digi')]")
	public WebElement digital_downloads;
	
	@FindBy(xpath = "//ul[@class='top-menu']//child::li[6]//a[contains(text(),'Jew')]")
	public WebElement jewelry;
	
	@FindBy(xpath = "//ul[@class='top-menu']//child::li[7]/a[contains(text(),'Gift')]")
	public WebElement gift_cards;
	
	//ul[@class='sublist firstLevel']//child::li[1]//a[contains(text(),'Des')]
	
	@FindBy(xpath = "//ul[@class='top-menu']/li[2]/child::ul/li[1]/a")
	public WebElement desktops;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li[2]/child::ul/li[1]/a")
	public WebElement notebooks;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li[2]/child::ul/li[3]/a")
	public WebElement accessories;
	
	@FindBy(xpath = "//li[contains(text(),'exists')]")
	public WebElement errorMsg;
}
