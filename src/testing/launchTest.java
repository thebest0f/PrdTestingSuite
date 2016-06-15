package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import BaseObjects.LaunchObject;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchTest {
	
	private WebDriver driver;
	private LaunchObject LaunchObject;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:/Programming/selenium-2.53.0/chromedriver.exe");
		driver = new ChromeDriver();
		LaunchObject = new LaunchObject(driver);
	}
	
	@Test
	public void sucess () {
		LaunchObject.launch();
		AssertJUnit.assertTrue("Expected Object not Present" , 
				LaunchObject.successfulLaunchPresent());
	}
	
	@AfterTest
	public void stopTest () {
		driver.quit();
	}
	
}
