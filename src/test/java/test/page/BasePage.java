package test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import webdriver.WebDriverHolder;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage() {
        driver = WebDriverHolder.getWebDriver();
        PageFactory.initElements(driver, this);
    }
}
