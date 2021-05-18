package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ElementActions {

	public WebDriver driver;

	public ElementActions(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isElementDisplayed(By contactUsButton) {
		try {
			this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    ((WebElement) contactUsButton).isDisplayed();
			return true;
		} catch (Exception | Error e) {
			throw e;
		}
	}

	public void scrollToElement(WebElement element) {
		try {
			Actions actions = new Actions(this.driver);
			actions.moveToElement(element);
			actions.perform();

		} catch (Exception | Error e) {
			System.out.println("Unable to scrool");
			throw e;
		}
	}

	public void highlightElement(WebElement element) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) this.driver;
			executor.executeScript("arguments[0].setAttribute('Style',background: yellow; border: 2px solid red;",
					element);
		} catch (Exception | Error e) {
			System.out.println("Unable to highlight the element");
			throw e;
		}
	}

	public boolean clickOnIt(WebElement element) {
		try {
			element.click();
			return true;
		} catch (Exception | Error e) {
			System.out.println("Unable to click on the Element");
			
			throw e;
		}

	}

	public boolean sendKeys(WebElement element, String text) {
		try {
			element.sendKeys(text);
			return true;
		} catch (Exception | Error e) {
			System.out.println("Unable to send the text");
			return false;
		}
	}

	public void acceptalert() {
		driver.switchTo().alert().accept();
	}

	public void declinealert() {
		driver.switchTo().alert().dismiss();
	}

	public void clearTextValue(WebElement element) {
		element.clear();

	}

	public void AssertEqualString(String Actual, String Expected) {
		try {
			Assert.assertEquals(Actual.trim(), Expected.trim());
		} catch (Exception | Error e) {

		}
	}

	public String getElementText(WebElement element) {
		try {
			String s = element.getText();
			return s;
		} catch (Exception | Error e) {
			throw e;
		}
	}

	public void MovetoTwoElementsAndClick(WebElement element1, WebElement element2) throws InterruptedException {
		Actions actions = new Actions(this.driver);
		actions.perform();
		actions.moveToElement(element1);
		Thread.sleep(1000);
		actions.perform();
		actions.moveToElement(element2);
		actions.perform();
		actions.click();
	}

	public void movetoElementandClick(WebElement element) throws Exception {
		Actions actions = new Actions(this.driver);
		actions.perform();
		actions.moveToElement(element);
		Thread.sleep(1000);
		actions.perform();
		actions.click();

	}
	
	public void clickUsingJS(WebElement element)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor) this.driver;
			js.executeScript("arguments[0].click();", element);
			
			
		}
		catch (Exception |Error e)
		{
			System.out.println("Unable to click using Java Script Executor");
		}
	}
	public void selectDropDownvaLue(WebElement element, String s)
	{
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(s);
	}
	
	

}
