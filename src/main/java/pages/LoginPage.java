package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static config.WebDriverSetup.*;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(name = "login")
    private WebElement loginButton;

    public void openLoginPage(String url) {
        openPage(url);
    }

    public void enterUsername() {
        waitForElement(usernameInputField);
        usernameInputField.sendKeys("dupa");
    }

    public void enterPassword() {
        waitForElement(passwordInputField);
        passwordInputField.sendKeys("dupa");
    }

    public void pressLoginButton() {
        waitForElement(loginButton);
        loginButton.click();
    }
}