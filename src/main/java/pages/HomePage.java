package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage
        extends AbstractBasePage {

    @FindBy(tagName = "h1")
    public WebElement homePageLabel;

    public boolean isHomePageLoaded() {
        return isPageLoaded(homePageLabel) && homePageLabel.getText().contains("Welcome on Home Page of PDF Invoice Printer");
    }
}