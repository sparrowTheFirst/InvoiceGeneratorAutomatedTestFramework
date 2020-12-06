package steps;

import config.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverManager;

import java.util.concurrent.TimeUnit;

public class BaseSteps {

    @Before
    public void before() {
        DriverManager.setWebDriver(DriverFactory.createBrowser("CHROME"));
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DriverManager.getWebDriver().get("localhost:8081");
    }

    @After
    public void after() {
//        DriverManager.getWebDriver().quit();
    }
}