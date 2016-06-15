package BaseObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class notebookValidatorObject extends mainBase{
	
	private newNotebookObject newNotebookObject;
	
	By openelementlocator = By.id("toolbarFileRenameForm");
	By nbExtensionLocator = By.id("toolbarRenameInputField");
	
	public notebookValidatorObject(WebDriver driver) {
		super(driver);
		newNotebookObject = new newNotebookObject(driver);
		newNotebookObject.launchNotebookObject();
	}
	
	public Boolean ValidateNB () {
		String extension;
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		find(openelementlocator);
		click(openelementlocator);
		extension = find(nbExtensionLocator).getAttribute("value");
		
		if (extension == ".nb"){
			return true;
		}
		else{
			return false;
		}
	}
}
