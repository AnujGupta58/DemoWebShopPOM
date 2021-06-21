package com.dws.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dws.base.TestBase;
import com.dws.pagesActions.CheckoutActions;
import com.dws.pagesActions.ComputerActions;
import com.dws.pagesActions.HomePageActions;
import com.dws.pagesActions.LoginActions;
import com.dws.pagesActions.ShoppingCartActions;
import com.dws.pagesActions.TopNavigatorActions;

public class OrderPlaceTest {
	

	
	@BeforeTest
	public void setup() {
		TestBase.initialization();
	}

	@Test
	public void orderProcess() throws InterruptedException {
		LoginActions login = new LoginActions();
		TopNavigatorActions tn = new TopNavigatorActions();
		HomePageActions hp = new HomePageActions();
		ComputerActions cp = new ComputerActions();
		ShoppingCartActions sc = new ShoppingCartActions();
		CheckoutActions ca = new  CheckoutActions();
		
		login.login();
		login.setEmail("qwerty@dws.com"); 
		login.setPassword("demoabc");
		login.loginbtn();
		tn.computer();
		cp.gotoCheapComp();
		cp.selectSpecs();
		cp.selectQty("4");
		
		Thread.sleep(5000);
		
		cp.addToCart();

		Thread.sleep(5000);
		
		hp.gotoShoppingCart();
		sc.selectCountry();
		sc.selectState();
		sc.selectZip();
		sc.agreeTC();
		sc.checkOut();
		ca.selectBillingAdd();
		ca.selectShipAdd();
		ca.selectShipMethod();
		ca.selectPaymentMethod();
		ca.selectPaymentInfo();
		ca.confirmOrder();
		
	}
	
}
