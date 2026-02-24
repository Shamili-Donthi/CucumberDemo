package stepDefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Netbanking landing page");
	}

	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String username, String password) {
	    System.out.println(username + "and password is" +password );
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page is displayed");
	}

	@Then("cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cards are displayed");
	}
	
	@When("User login into application")
	public void user_login_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		

	  
	}

}
