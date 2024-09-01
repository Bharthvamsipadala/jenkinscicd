package stepDefinitions;

import io.cucumber.java.en.*;

public class RegistrationSteps {

    @Given("User is on Registration page")
    public void user_is_on_registration_page() {
        System.out.println("User navigates to Registration page");
    }

    @When("User enters valid details")
    public void user_enters_valid_details() {
        System.out.println("User enters valid details");
    }

    @And("User submits the registration form")
    public void user_submits_the_registration_form() {
        System.out.println("User submits the form");
    }

    @Then("User should be registered successfully")
    public void user_should_be_registered_successfully() {
        System.out.println("User is registered successfully");
    }
}
