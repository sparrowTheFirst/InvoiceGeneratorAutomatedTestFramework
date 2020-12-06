package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import static config.WebDriverSetup.*;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    @Before
    public void setup() {
        init();
    }

    @After
    public void quit() {
//        tearDown();
    }

    @Given("User is on login page {string}")
    public void userIsOnLoginPage(String url) {
        loginPage.openLoginPage(url);
    }

    @When("User enters user name and password")
    public void userEntersUserNameAndPassword() {
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.pressLoginButton();
    }

    @Then("User gets confirmation")
    public void userGetsConfirmation() {

    }
}