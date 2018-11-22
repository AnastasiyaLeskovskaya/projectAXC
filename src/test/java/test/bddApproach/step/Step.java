package test.bddApproach.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import test.page.AboutPage;
import test.page.DXOMarkPage;
import webdriver.manager.WebDriverManager;
import webdriver.manager.WebDriverManagerImpl;

public class Step {

    private WebDriverManager manager;

    @Given("^Start page is opened by default$")
    public void setUp() {
        manager = new WebDriverManagerImpl();
        manager.setupWebDriver("chr");
    }

    @Given("^User navigates to About page$")
    public void openAboutPage() {
        new AboutPage().openBrowser();
    }

    @When("^User navigates to DXOMark page$")
    public void openMainPage() {
        new DXOMarkPage().openBrowser();
    }


    @When("^User click about item in navigation menu$")
    public void aboutButtonClick() {
        new DXOMarkPage().aboutButtonClick();
    }

    @When("^User clicks language icon$")
    public void aboutButtonLanguageIconClick() {
        new AboutPage().languageIconClick();
    }

    @When("^User click DOMMark item$")
    public void doMMarkItemClick() {
        new AboutPage().doMarkItem();
    }

    @And("^Chooses Chinese language item$")
    public void chineseLanguageClick() {
        new AboutPage().chineseLangClick();
    }

    @And("^Check, that home language is English$")
    public void verifyEngLanguage() {
        Assert.assertEquals(new AboutPage().verifyLanguage(), "English", "Language is not English");
    }

    @Then("^About page is opened$")
    public void verifyAboutPage() {
        Assert.assertTrue(new AboutPage().isLabelDisplayed(), "About page is non opened");
    }

    @Then("^Home language is changed on Chinese$")
    public void verifyChinLanguage() {
        Assert.assertEquals(new AboutPage().verifyLanguage(), "Chinese", "Language is not change");
    }

    @Then("^DXOMark page is opened$")
    public void verifyMainPage() {
        Assert.assertTrue(new DXOMarkPage().iNavigationPanelDisplayed(), "DXOMark page is not opened");
    }
}
