package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import BaseObjects.newNotebookObject;
import org.openqa.selenium.chrome.ChromeDriver;

public class newNotebookTest {
	private WebDriver driver;
	private newNotebookObject newNotebookObject;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:/Programming/selenium-2.53.0/chromedriver.exe");
		driver = new ChromeDriver();
		newNotebookObject = new newNotebookObject(driver);
	}
	
	@Test
	public void succeeded () {
		newNotebookObject.launchNotebookObject();
		AssertJUnit.assertTrue("something went wrong!" , 
				newNotebookObject.launchSuccess());
	}
	
	@AfterTest
	public void stopTest () {
		driver.quit();
	}
}
