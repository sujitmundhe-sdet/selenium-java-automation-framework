package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;
import utils.ConfigReader;

public class E2ETest extends BaseTest {
	
	@Test
	public void CompleteE2EFlow() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		InventoryPage inventory =new InventoryPage(driver);
		CartPage  cart = new CartPage(driver) ;
		CheckoutPage	checkout = new CheckoutPage(driver);
		
		login.login(ConfigReader.get("username"), ConfigReader.get("password"));
		Thread.sleep(2000);
		inventory.addItemToCart("Sauce Labs Bike Light");
		Thread.sleep(2000);
		inventory.goToCart();
		Thread.sleep(2000);
		cart.verifyItem("Sauce Labs Bike Light");
		Thread.sleep(2000);
		cart.checkoutItem();
		Thread.sleep(2000);
		checkout.enterDetails("Test","user","411001");
		Thread.sleep(2000);
		checkout.clickContinue();
		Thread.sleep(2000);
		
		
	}
	

}
