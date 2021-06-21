package com.dws.pagesActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.dws.base.TestBase;
import com.dws.pages.Computer;
import com.dws.pages.HomePage;
import com.dws.pages.TopNavigator;

public class ComputerActions extends TestBase {

	TopNavigator navigator;
	Computer comp;
	
	public ComputerActions() {
		this.comp = new Computer();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory,this.comp);
		// TODO Auto-generated constructor stub
	}
	
		
	public void gotoCheapComp() {
		click(comp.cheap);
	}
	
	public void selectSpecs() {
		click(comp.fast_processor);
		click(comp.ram_4_GB);
		click(comp.HDD_320_GB);
		click(comp.office_sw);
	}
	
	public void selectQty(String value) {
		type(comp.qty, value);
	}

	public void addToCart() {
		click(comp.addToCart);
	}
	
	//to be completed
	public void cartMsg() {
		verifyEquals(comp.addToCartDialog.getText(), "");
	}

	public void gotoSimpleComp() {
		click(comp.simple);
	}
}
