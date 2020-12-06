package pages;

import org.openqa.selenium.support.PageFactory;

import static config.WebDriverSetup.*;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }
}
