package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import BaseObjects.notebookValidatorObject;
import org.openqa.selenium.chrome.ChromeDriver;

public class notebookValidationTest {
	private WebDriver driver;
	private notebookValidatorObject notebookValidatorObject;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:/Programming/selenium-2.53.0/chromedriver.exe");
		driver = new ChromeDriver();
		notebookValidatorObject = new notebookValidatorObject(driver);
	}
	
	@Test
	public void succeeded () {
		notebookValidatorObject.ValidateNB();
		AssertJUnit.assertTrue("something went wrong!" , 
				notebookValidatorObject.ValidateNB());
	}
	
	@AfterTest
	public void stopTest () {
		driver.quit();
	}
}
