package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {
	
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver initilizewebdriver()
	{
		WebDriverManager.chromedriver().setup();
		tlDriver.set(new ChromeDriver());
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	
	}

	public static WebDriver getDriver() {
		
		return tlDriver.get();
		
	}
}
