package utilities;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        return driver;
    }

    public static void setWebDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }
}