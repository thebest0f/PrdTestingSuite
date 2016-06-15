package BaseObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mainBase {

	protected WebDriver driver;
	
	public mainBase(WebDriver driver) {this.driver = driver; }
	
	public void launch(String url) {    // navigate to web page
		driver.get(url);
		}
	
	public WebElement find(By locator) {   //use to find page element
		return driver.findElement(locator);
		}
	
	public void click(By locator) {		//use to click on a page element
		find(locator).click();
		}
	
	public void submit (By locator){  //use to submit a page element 
		find(locator).submit();
	}
	
	public void type (String inputText, By locator) { // use to type into text boxes
		find(locator).sendKeys(inputText);
	}
	
	public Boolean isDisplayed(By locator){              // checks if element is displayed
		try {
			return find(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException exception) {
			return false;
		}
	}
	
	

	
	public Boolean waitForIsDisplayed (By locator, Integer... timeout){    // waits and checks if element is displayed
		try {
			waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
					(timeout.length > 0 ? timeout[0] : null));
		} catch (org.openqa.selenium.TimeoutException exception) {
			return false;
		}
		return true;
	}
	
	private void waitFor (ExpectedCondition<WebElement> condition, Integer timeout){           //checks and waits for for condition
		timeout = timeout != null ? timeout : 5;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(condition);
	}	
	
}
