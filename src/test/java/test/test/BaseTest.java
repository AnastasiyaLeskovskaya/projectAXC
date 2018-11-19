package test.test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import webdriver.manager.WebDriverManager;
import webdriver.manager.WebDriverManagerImpl;

public class BaseTest {

    private WebDriverManager manager;

    @BeforeSuite
    public void initBrowser() {
        manager = new WebDriverManagerImpl();
        manager.setupWebDriver("chr");
    }

    @AfterSuite
    public void exitBrowser() {
        manager.closeWebDriver();
    }
}
