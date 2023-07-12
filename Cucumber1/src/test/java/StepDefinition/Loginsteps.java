package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("Inside step-User is on login page");
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
	    System.out.println("inside step-User enter username and password");
	}

	@And("Click on login button")
	public void click_on_login_button() {
	   System.out.println("Click on login button");
	}

	@Then("Home page should be display")
	public void home_page_should_be_display() {
		System.out.println("Inside step-Home page should be display");
	}



}
