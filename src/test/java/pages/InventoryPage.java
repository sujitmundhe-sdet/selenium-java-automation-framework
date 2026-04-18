package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage extends BasePage {
	
		
	
	public InventoryPage(WebDriver driver) {
		super(driver);
	}
	
	
	By 	shopping_cart = By.className("shopping_cart_container");
	
//	String productName = "Sauce Labs Backpack" ;
//	String xpath = String.format("//*[text()='%s']//following::button[1]", productName) ;
//	By add_to_Cart_button = By.xpath(xpath);
	
	
	public By getAddToCartButton(String productName) {
		String xpath = String.format("//*[text()='%s']//following::button[1]", productName) ;
		return By.xpath(xpath);
	}
	
	public void addItemToCart(String productName) {
		WebElement AddToCartButton = driver.findElement(getAddToCartButton(productName));
		AddToCartButton.click();
	}
	
	public void goToCart() {
		click(shopping_cart) ;
	}
	
	
	
	

}
