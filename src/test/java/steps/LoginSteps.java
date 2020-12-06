package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        Assert.assertTrue(loginPage.isLoginPageLoaded());
    }

    @When("User enters user name {string} and password {string}")
    public void userEntersUserNameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.pressLoginButton();
    }

    @Then("User gets confirmation")
    public void userGetsConfirmation() {
        Assert.assertTrue(homePage.isHomePageLoaded());
    }
}