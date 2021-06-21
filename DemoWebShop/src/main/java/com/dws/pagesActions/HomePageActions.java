package com.dws.pagesActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.dws.base.TestBase;
import com.dws.pages.HomePage;

public class HomePageActions extends TestBase {

	HomePage homePage;
	
	public HomePageActions() {
		this.homePage = new HomePage();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.homePage);
		
	}
	
	public String username() {
		String user = homePage.username.getText();
		
		return user;
	}
	
	public void logoff() {
		click(homePage.logout);
	}
	
	public void gotoShoppingCart() {
		click(homePage.shoppingCart);
	}
	
	public void gotoWishlist() {
		click(homePage.wishlist);
	}
}
