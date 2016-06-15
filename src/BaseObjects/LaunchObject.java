package BaseObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaunchObject extends mainBase {


	By landing = By.id("productSelection");
	By productselection = By.cssSelector("a.product-link");
	By loginlanding = By.className("prereleaseBody");	
	
	
	public LaunchObject(WebDriver driver) {
		super(driver);
	}
	
	public void launch () {
		launch("https://www.wolframcloud.com/");
		waitForIsDisplayed(landing);
		driver.switchTo().frame(0);
		click(productselection);
		waitForIsDisplayed(loginlanding);
	}
	
	public Boolean successfulLaunchPresent (){
		return waitForIsDisplayed(loginlanding);
	}
	
}
