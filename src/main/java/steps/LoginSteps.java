package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static steps.WebDriverSetup.*;

public class LoginSteps {

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        driver.get("localhost:8081");
    }

    @When("User enters user name and password")
    public void userEntersUserNameAndPassword() {

    }

    @Then("User gets confirmation")
    public void userGetsConfirmation() {

    }
}