package pageClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	private WebDriver driver;
	
	private By LoginButton = By.xpath("//a[contains(@title,'Log in')]");
	
	private By ContactUsButton = By.xpath("//div[contains(@id,'contact')]");
	private By Logo = By.xpath("//img[contains(@class,'logo')]");
	private By WomenButton = By.xpath("//a[contains(@title,'Women')]");
	private By DressesButton = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	private By TshirtsButton = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
	private By Contactus = By.xpath("//span[contains(@class,'shop')]");
	private By Searchinputfield = By.xpath("//input[contains(@name,'search')]");
	private By SearchButton = By.xpath("//button[contains(@name,'submit_sea')]");
	private By PopularButton = By.xpath("//ul[contains(@id,'home-page')]/li[1]");
	private By BestSellers = By.xpath("//ul[contains(@id,'home-page')]/li[1]");
	private By Followus = By.xpath("//*[@id=\"social_block\"]/h4");


	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public boolean  VerifyLoginButton() {
	
	return driver.findElement(LoginButton).isDisplayed();
		
	}
	
	public boolean VerifycontacusButton()
	{
		return driver.findElement(ContactUsButton).isDisplayed();
	}
	
	public void enterTextinSearchinputfield(String search)
	{
	
		driver.findElement(Searchinputfield).sendKeys(search);
	}

	public boolean verifyFollowusButton()
	{
		return driver.findElement(Followus).isDisplayed();
	}




}
