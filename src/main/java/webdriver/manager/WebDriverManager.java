package webdriver.manager;

public interface WebDriverManager {

    void setupWebDriver(String driverType);

    void closeWebDriver();
}
