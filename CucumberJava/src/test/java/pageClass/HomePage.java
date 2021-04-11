package pageClass;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import utility.ElementActions;

public class HomePage extends ElementActions {
	

	public WebDriver driver;
	
	//private By LoginButton = By.xpath("//a[contains(@title,'Log in')]");
	@FindBy(xpath = "//a[contains(@title,'Log in')]")
	WebElement LoginButton;
	
	@FindBy(xpath = "\"//div[contains(@id,'contact')]")
	WebElement ContactUsButton;
	
	@FindBy(xpath="//img[contains(@class,'logo')]")
	WebElement Logo;
	
	@FindBy(xpath="//a[contains(@title,'Women')]")
	WebElement WomenButton;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement DressesButton;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement TshirtsButton;
	
	@FindBy(xpath="//input[contains(@name,'search')]")
	WebElement SearchInputField;
	
	@FindBy(xpath="\"//button[contains(@name,'submit_sea')]\"")
	WebElement SearchButton;
	

	@FindBy(xpath="//ul[contains(@id,'home-page')]/li[1]")
	WebElement BestSellers;
	
	@FindBy(xpath="//*[@id=\"social_block\"]/h4")
	WebElement Followus;
	
	


	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void  VerifyLoginButton() throws InterruptedException {
		
		Thread.sleep(1000);
		try {
			Assert.assertTrue(isElementDisplayed(LoginButton));
		}
		catch (Exception | Error e)
		{
			System.out.println("Unable to find Element");
		}
	}
	public void VerifycontacusButton() throws Exception
	{
		Thread.sleep(1000);
		try {
			Assert.assertTrue(isElementDisplayed(ContactUsButton));
		}
		catch (Exception | Error e)
		{
			System.out.println("Hi");
		}
	}
	
	public void enterTextinSearchinputfield(String search)
	{
	
		sendKeys(SearchInputField,"New Models");
	}

	public void verifyFollowusButton() throws Exception
	{
		Thread.sleep(1000);
		try {
			Assert.assertTrue(isElementDisplayed(Followus));
		}
		catch (Exception | Error e)
		{
			System.out.println("Hi");
		}
	}




}
