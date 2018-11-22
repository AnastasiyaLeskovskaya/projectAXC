package test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.exception.LanguageDefinitionException;
import webdriver.WebDriverHolder;

public class AboutPage extends BasePage {

    private final String BASE_URL = "https://www.dxomark.com/about-us/";

    @FindBy(xpath = "//div[@class='text-inner text-center']//h1")
    private WebElement label;

    @FindBy(css = "i.icon-angle-down")
    private WebElement languageIcon;

    @FindBy(xpath = "//a[@hreflang ='cn']")
    private WebElement chineseLang;

    @FindBy(xpath = "//*[@id='menu-item-14612']/a")
    private WebElement aboutClick;

    @FindBy(xpath = "//*[@id='logo']/a/img[2]")
    private WebElement doMarkItem;

    @FindBy(xpath = "//*[@id='masthead']//i[@class='image-icon']//img")
    private WebElement currentLanguage;

    public void openBrowser() {
        WebDriverHolder.getWebDriver().get(BASE_URL);
    }

    public boolean isLabelDisplayed() {
        return label.isDisplayed();
    }

    public AboutPage languageIconClick(){
        languageIcon.click();
        return this;
    }

    public AboutPage chineseLangClick(){
        chineseLang.click();
        return this;
    }

    public AboutPage doMarkItem(){
        doMarkItem.click();
        return this;
    }

    public String verifyLanguage() {
        String currentLang = currentLanguage.getAttribute("alt");
        try {
            switch (currentLang) {
                case "English":
                    return "English";
                case "中文":
                    return "Chinese";
            }throw new LanguageDefinitionException();
        }catch (LanguageDefinitionException e){
            return "";
        }
    }
}
