package stepDefentions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is in homepage")
	public void user_is_in_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Im in Homepage is loaded");
	   
	}

	@Given("Clicked on Signin button")
	public void clicked_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I clicked on Signin button");
	   
	}

	@When("user is in Signin Page")
	public void user_is_in_signin_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Im in sign in page");
	   
	}

	@Then("Verify whether user is able to enter")
	public void verify_whether_user_is_able_to_enter() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Im entered credentials as");
	   
	}

	@Then("Verify user is able to click on SignIn button")
	public void verify_user_is_able_to_click_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I clicked on Signin Button");
	   
	}

}
