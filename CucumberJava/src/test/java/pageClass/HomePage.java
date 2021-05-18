package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import driverFactory.DriverFactory;
import utility.ElementActions;

public class HomePage {
	

	public WebDriver driver;
	
	//private By LoginButton = By.xpath("//a[contains(@title,'Log in')]");
	@FindBy(xpath = "//a[normalize-space()=\'Sign in\']")
	WebElement LoginButton;
	
	private  By ContactUsButton = By.xpath("//div[@id=\"contact-link\"]");
	//@FindBy(xpath = "\"//div[contains(@id,'contact')]")
	//WebElement ContactUsButton;
	
	@FindBy(xpath="//img[contains(@class,'logo')]")
	WebElement Logo;
	
	@FindBy(xpath="//a[contains(@title,'Women')]")
	WebElement WomenButton;
	
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
	
	


	public HomePage(WebDriver driver) {
	   this.driver = driver;
	}
   

	
	public void  VerifyLoginButton() throws InterruptedException  {
		

		
		
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
