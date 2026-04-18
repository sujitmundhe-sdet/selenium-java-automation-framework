package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private static ThreadLocal<WebDriver>  driver = new ThreadLocal<>();
	
	public static void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public static void quiteDriver() {
		driver.get().quit();
		driver.remove();
	}

}
