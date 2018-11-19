package webdriver.factory;

import org.openqa.selenium.WebDriver;
import webdriver.driver.DriverType;

public interface WebDriverFactory {

    void initWebDriver();

    WebDriver getDriver(String driverType);

    DriverType defineDriverType(String driverType);
}
