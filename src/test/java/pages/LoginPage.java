package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtil;

public class LoginPage extends BasePage{
	
	
	By username = By.id("user-name");
	By password = By.id("password");
	By LoginBtn = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		super(driver) ;
		
	}
	
	public void login(String user , String pwd) {
		
		type(username,user);
		type(password,pwd);
		click(LoginBtn);
		
	}

}
