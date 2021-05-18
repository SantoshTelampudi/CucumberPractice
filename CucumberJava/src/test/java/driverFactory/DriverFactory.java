package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {
	
	
	public static WebDriver driver;

	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver initilizewebdriver()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		options.setHeadless(true);
		WebDriverManager.chromedriver().setup();
		tlDriver.set(new ChromeDriver(options));
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	
	}

	public static WebDriver getDriver() {
		
		return tlDriver.get();
		
	}

}
