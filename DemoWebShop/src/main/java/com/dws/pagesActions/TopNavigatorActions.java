package com.dws.pagesActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.dws.base.TestBase;
import com.dws.pages.TopNavigator;

public class TopNavigatorActions extends TestBase {
	
	TopNavigator navigator = new TopNavigator();
	
	public TopNavigatorActions() {
		this.navigator = new TopNavigator();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.navigator);
		// TODO Auto-generated constructor stub
	}
	
	
	public void computer() {
		//click(navigator.computer);
		actions(navigator.computer);
		click(navigator.desktops);
	}
	

}
