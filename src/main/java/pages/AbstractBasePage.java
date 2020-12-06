package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverManager;

import java.util.Arrays;
import java.util.function.Function;

public abstract class AbstractBasePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public AbstractBasePage() {
        this.driver = DriverManager.getWebDriver();
        this.wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public <V> V waitUntil(final Function<? super WebDriver, V> isTrue) {
        return getWait().until(isTrue);
    }

    protected boolean isPageLoaded(final WebElement... webElements) {
        waitUntil(ExpectedConditions.visibilityOfAllElements(webElements));
        return Arrays.stream(webElements).map(WebElement::isDisplayed).findFirst().isPresent();
    }
}