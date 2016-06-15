package BaseObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class newNotebookObject extends mainBase{

	By dropdownLocator = By.className("newNotebookBtn-dropdown"); 
	By notebookbuttonLocator = By.id("nb");
	By notebookIndicator = By.className("mbody");
	
	private loginObject loginObject;
	
	public newNotebookObject(WebDriver driver) {
		super(driver);
		loginObject = new loginObject(driver);
		loginObject.with("pdouglas179@gmail.com", "Monkuy08*");
	}
	
	public void launchNotebookObject () {
		waitForIsDisplayed(dropdownLocator);
		find(dropdownLocator);
		click(dropdownLocator);
		find(notebookbuttonLocator);
		click(notebookbuttonLocator);
	}
	public Boolean launchSuccess (){
		return waitForIsDisplayed(notebookIndicator, 10);
	}
}
