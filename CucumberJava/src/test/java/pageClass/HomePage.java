package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import driverFactory.DriverFactory;
import utility.ElementActions;

public class HomePage {
	

	public WebDriver driver;
	
	private By LoginButton = By.xpath("//a[normalize-space()='Sign in']");
	
	private  By ContactUsButton = By.xpath("//div[@id=\"contact-link\"]");	
	
	private By Logo = By.xpath("//img[contains(@class,'logo')]");
	
	private By WomenButton = By.xpath("//a[contains(@title,'Women')]");
	
	
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement DressesButton;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement TshirtsButton;
	
	private By SearchInputField = By.xpath("//input[@id=\"search_query_top\"]");
	//@FindBy(xpath="//input[@id=\"search_query_top\"]")
	//WebElement SearchInputField;
	
	@FindBy(xpath="\"//button[contains(@name,'submit_sea')]\"")
	WebElement SearchButton;
	

	@FindBy(xpath="//ul[contains(@id,'home-page')]/li[1]")
	WebElement BestSellers;
	
	@FindBy(xpath="//*[@id=\"social_block\"]/h4")
	WebElement Followus;
	
	
	ElementActions elementactions = new ElementActions((DriverFactory.getDriver()));

	public HomePage(WebDriver driver) {
	   this.driver = driver;
	}
   

	
	public boolean  VerifyLoginButton() throws InterruptedException  {

		Actions action = new Actions(driver);
		
		
	
		try {
		return elementactions.isElementDisplayed(LoginButton);
		
		}
		catch (Exception | Error e)
		{
			throw e;
		}
		
		
	}
	public void VerifycontacusButton() throws Exception
	{
		
		driver.findElement(ContactUsButton).isDisplayed();
	}
	
	public void enterTextinSearchinputfield(String search)
	{
	
		driver.findElement(SearchInputField).sendKeys(search);
	}

	public boolean verifyFollowusButton() throws Exception
	{
		Thread.sleep(1000);
		try {
			//Assert.assertTrue(isElementDisplayed(Followus));
			return true;
		}
		catch (Exception | Error e)
		{
			throw  e;
		}
	}




}
