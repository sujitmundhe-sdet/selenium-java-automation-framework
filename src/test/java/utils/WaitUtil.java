package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

	WebDriver driver ;
	
	public WaitUtil(WebDriver driver) {
		this.driver = driver ;
		
	}
	
	
	public WebElement waitForElement(By locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(
					Integer.parseInt(ConfigReader.get("timeout"))));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
}
