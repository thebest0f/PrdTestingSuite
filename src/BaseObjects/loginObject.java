package BaseObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginObject extends mainBase {

	By usernameLocator = By.id("email");
	By passwordLocator = By.id("password");
	By loginFormLocator = By.id("signInForm");
	By successfulUsername = By.id("landingLayout");	
	
	private LaunchObject LaunchObject;
	
	public loginObject(WebDriver driver) {
		super(driver);
		LaunchObject = new LaunchObject(driver);
		LaunchObject.launch();
	}
	
	public void with (String username, String password) {
		type (username, usernameLocator);
		type (password, passwordLocator);
		submit(passwordLocator);
	}
	
	public Boolean successfulLoginPresent (){
		return waitForIsDisplayed(successfulUsername, 10);
	}
}
