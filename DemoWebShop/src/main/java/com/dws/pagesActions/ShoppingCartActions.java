package com.dws.pagesActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.dws.base.TestBase;
import com.dws.pages.ShoppingCart;
import com.dws.pages.TopNavigator;

public class ShoppingCartActions extends TestBase {

	TopNavigator navigator;
	ShoppingCart cart;
	
	public ShoppingCartActions() {
		this.cart = new ShoppingCart();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.cart);
		
	}
	
	
	public void selectCountry() {
		selectByValue(cart.country, "India");
	}
	
	public void selectState() {
		selectByValue(cart.state, "Other (Non US)");
	}
	
	public void selectZip() {
		type(cart.pincode, "226020");
	}
	
	public void agreeTC(){
		click(cart.termsOfCondition);
	}
	
	public void checkOut() {
		click(cart.checkOut);
	}
}
