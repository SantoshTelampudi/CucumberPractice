package stepDefentions;

import org.openqa.selenium.By;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClass.HomePage;
import utility.ElementActions;



public class AllStepDefentionfile {
	
	
	ElementActions elementactions = new ElementActions(DriverFactory.getDriver());
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	
   
   @Given("User enters the URL")
   public void user_enters_the_URL() {
       DriverFactory.getDriver().get("http://automationpractice.com/index.php");
     
       
   }

   @When("user lands in the Home Page")
   public void user_lands_in_the_home_page() {
      System.out.println("User is in HomePage");
       
   }

   @Then("Veriify LoginIn button")
   public void veriify_login_in_button() throws InterruptedException {
	   
	   homepage.VerifyLoginButton();       
       
   }

   @Then("Verify contactUs button")
   public void verify_contact_us_button() throws Exception {
	  // DriverFactory.getDriver().findElement(By.xpath("//div[@id=\"contact-link\"]")).isDisplayed(); 
	   homepage.VerifycontacusButton();
       
   }

   @Then("Verify followus button")
   public void verify_followus_button() throws Exception {
	   homepage.verifyFollowusButton();
       
   }

   @Then("Verify user is able to enter {string} in SearchBar")
   public void verify_user_is_able_to_enter_in_search_bar(String string){
       homepage.enterTextinSearchinputfield(string);
       
   }

}
