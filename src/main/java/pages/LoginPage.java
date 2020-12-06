package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage
        extends AbstractBasePage {

    @FindBy(name = "username")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(name = "login")
    private WebElement loginButton;

    public boolean isLoginPageLoaded() {
        return isPageLoaded(usernameInputField, passwordInputField, loginButton);
    }

    public void enterUsername(String username) {
        waitUntil(ExpectedConditions.visibilityOf(usernameInputField));
        usernameInputField.sendKeys(username);
    }

    public void enterPassword(String password) {
        waitUntil(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }

    public void pressLoginButton() {
        waitUntil(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }
}