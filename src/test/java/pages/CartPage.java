package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
		
	}
	
	By checkoutBtn = By.name("checkout");
	
	By itemName = By.xpath("//*[@data-test='inventory-item-name']");
	
	public void verifyItem(String productName) {
		Assert.assertEquals(getText(itemName), productName);
		
	}
	
	public void checkoutItem() {
		click(checkoutBtn) ;
	}
	
	
	
	
}
	