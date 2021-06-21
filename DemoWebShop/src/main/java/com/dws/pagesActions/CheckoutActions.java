package com.dws.pagesActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.dws.base.TestBase;
import com.dws.pages.Checkout;

public class CheckoutActions extends TestBase {

	Checkout checkout;
	
	public CheckoutActions() {
		this.checkout = new Checkout();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.checkout);
	} 
	
	public void selectBillingAdd() {
		selectByIndex(checkout.billingAddress, 0);
		click(checkout.billingContinue);
	}
	
	public void selectShipAdd() {
		selectByIndex(checkout.shippingAddress, 0);
		click(checkout.shippingContinue);
	}
	
	public void selectShipMethod() {
		click(checkout.groundMethod);
		click(checkout.methodContinue);
	}
	
	public void selectPaymentMethod() {
		click(checkout.cod);
		click(checkout.paymentContinue);
	}
	
	public void selectPaymentInfo() {
		verifyEquals(checkout.paymentInfo.getText(), "You will pay by COD");
		click(checkout.paymentInfoContinue);
	}
	
	public void confirmOrder() {
		click(checkout.confirmOrderContinue);
	}
	
	
}
