package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	
	}
	
	By firstName = By.id("first-name");
	By lastName = By.name("lastName");
	By postalCode = By.name("postalCode");
	By continueBtn = By.id("continue");
	By FinishBtn = By.id("finish");
	By BackToHomeBtn = By.id("back-to-products");
	public void enterDetails(String FirstName,String LastName ,String PostalCode) {
		type(firstName ,FirstName);
		type(lastName ,LastName);
		type(postalCode ,PostalCode);
		
	}
	
	public void clickContinue() {
		click(continueBtn);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FinishBtn));
	}
	
	public void clickFinishBtn() {
		click(FinishBtn);
		wait.until(ExpectedConditions.visibilityOfElementLocated(BackToHomeBtn));
	}
	
	

}
