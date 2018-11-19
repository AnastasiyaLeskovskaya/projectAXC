package webdriver.manager;


import webdriver.WebDriverHolder;
import webdriver.factory.WebDriverFactory;
import webdriver.factory.WebDriverFactoryImpl;

public class WebDriverManagerImpl implements WebDriverManager {

    public void setupWebDriver(String driverType) {
        WebDriverFactory factory = new WebDriverFactoryImpl();
        WebDriverHolder.setWebDriver(factory.getDriver(driverType));
    }

    public void closeWebDriver() {
        if (null != WebDriverHolder.getWebDriver()) {
            WebDriverHolder.getWebDriver().quit();
        }
    }
}
