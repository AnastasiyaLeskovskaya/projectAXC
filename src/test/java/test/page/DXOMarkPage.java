package test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.WebDriverHolder;

public class DXOMarkPage extends BasePage {

    private static final String BASE_URL = "http://www.dxomark.com";

    @FindBy (xpath = "//li[@id='menu-item-28']//a")
    private WebElement aboutButtonl;

    @FindBy (css = "div.logo-top")
    private WebElement topLogo;

    @FindBy (css = "input#s.search-field.mb-0")
    private WebElement search;

    @FindBy (css = "i.icon-angle-down ")
    private WebElement language;

    public void openBrowser() {
        WebDriverHolder.getWebDriver().get(BASE_URL);
    }

    public boolean iNavigationPanelDisplayed() {
        return topLogo.isDisplayed();
    }

    public AboutPage aboutButtonClick(){
        aboutButtonl.click();
        return new AboutPage();
    }

}
