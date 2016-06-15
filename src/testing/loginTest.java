package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import BaseObjects.loginObject;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginTest {
	
	private WebDriver driver;
	private loginObject loginObject;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:/Programming/selenium-2.53.0/chromedriver.exe");
		driver = new ChromeDriver();
		loginObject = new loginObject(driver);
	}
	
	@Test
	public void succeeded () {
		loginObject.with("pdouglas179@gmail.com", "Monkuy08*");
		AssertJUnit.assertTrue("login has failed, no username present" , 
				loginObject.successfulLoginPresent());
	}
	
	@AfterTest
	public void stopTest () {
		driver.quit();
	}
	
}
