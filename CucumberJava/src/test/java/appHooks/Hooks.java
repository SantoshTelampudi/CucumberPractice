package appHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.CofigProperties;

public class Hooks {

	private DriverFactory driverfactory;
	private WebDriver driver;
	private CofigProperties config;
	Properties prop;
	
	
	@Before(order=0)
	public void getPrperty()
	{
		config = new CofigProperties();
		prop = config.intilizeProp();
		
	}
	
	@Before(order=1)
	public void launchBrowser()
	{
		String Browsername = prop.getProperty("browser");
		driverfactory = new DriverFactory();
		driver = driverfactory.initilizewebdriver();
		
	}
	
	@AfterStep
	public void scenarioPassed(Scenario sc)
	{
		if(sc.isFailed()==false)
		{
			String Screenshot = sc.getName().replaceAll("_"," ");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcePath,"image/png", Screenshot); 
		}
	}
	
	@After(order=0)
	public void quitBroswer()
	{
		driver.quit();
	}
	
	@After(order=1)
	public void scenarioFailed(Scenario sc)
	{
		if(sc.isFailed())
		{
			String Screenshot = sc.getName().replaceAll("_"," ");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcePath,"image/png", Screenshot); 
		}
	}
}
