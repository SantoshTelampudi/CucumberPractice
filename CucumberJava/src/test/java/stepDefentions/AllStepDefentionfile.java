package stepDefentions;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClass.HomePage;



public class AllStepDefentionfile {
	
	
	
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
   public void veriify_login_in_button() {
	   
	   Assert.assertTrue(homepage.VerifyLoginButton());       
       
   }

   @Then("Verify contactUs button")
   public void verify_contact_us_button() {
	   Assert.assertTrue(homepage.VerifycontacusButton());  
       
   }

   @Then("Verify followus button")
   public void verify_followus_button() {
	   Assert.assertTrue(homepage.verifyFollowusButton());
       
   }

   @Then("Verify user is able to enter {string} in SearchBar")
   public void verify_user_is_able_to_enter_in_search_bar(String string){
       homepage.enterTextinSearchinputfield(string);
       
   }

}
