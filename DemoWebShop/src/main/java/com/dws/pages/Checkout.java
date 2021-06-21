package com.dws.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {

	@FindBy(xpath = "//select[@name='billing_address_id']")
	public WebElement billingAddress;
	
	@FindBy(xpath = "//div[@id='billing-buttons-container']/child::input")
	public WebElement billingContinue;
	
	@FindBy(xpath = "//select[@name='shipping_address_id']")
	public WebElement shippingAddress;
	
	@FindBy(xpath = "//select[@name='shipping_address_id']")
	public WebElement backToshipAdd;   // need to correct xpath
	
	@FindBy(xpath = "//div[@id='shipping-buttons-container']/child::input")
	public WebElement shippingContinue;
	
	@FindBy(css = "input#shippingoption_0")
	public WebElement groundMethod;
	
	@FindBy(css = "input#shippingoption_1")
	public WebElement nextDayAirMethod;
	
	@FindBy(css = "input#shippingoption_2")
	public WebElement day2ndAirMethod;
	
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']/child::input")
	public WebElement methodContinue;
	
	@FindBy(css = "input#paymentmethod_0")
	public WebElement cod;
	
	@FindBy(css = "input#paymentmethod_1")
	public WebElement moneyOrder;
	
	@FindBy(css = "input#paymentmethod_2")
	public WebElement creditCard;
	
	@FindBy(css = "input#paymentmethod_3")
	public WebElement purchaseOrder;
	
	@FindBy(xpath = "//div[@id='payment-method-buttons-container']/child::input")
	public WebElement paymentContinue;
	
	@FindBy(xpath = "//p[contains(text(),'COD')]")
	public WebElement paymentInfo;
	
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']/child::input")
	public WebElement paymentInfoContinue;
	
	@FindBy(xpath = "//div[@id='confirm-order-buttons-container']/child::input")
	public WebElement confirmOrderContinue;
	
	@FindBy(tagName = "strong")
	public WebElement orderPlace;
}
