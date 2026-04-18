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
		inventory.addItemToCart("Sauce Labs Bike Light");
		inventory.goToCart();
		cart.verifyItem("Sauce Labs Bike Light");
		cart.checkoutItem();
		checkout.enterDetails("Test","user","411001");
		checkout.clickContinue();

	}
	

}
