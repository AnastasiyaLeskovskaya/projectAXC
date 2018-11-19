package test.test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import test.step.UserStep;

public class MainPageTest extends BaseTest {

    UserStep userStep;

    @BeforeSuite
    private void initialize() {
        userStep = new UserStep();
    }

    @Test
    public void assertWiggleIconIsDisplayed() {
        userStep.openMainPage();
        Assert.assertTrue(userStep.iNavigationPanelDisplayed(), "Main page is not opened!");
    }

    @Test
    public void isNewPageOpened() {
        userStep.openMainPage();
        userStep.aboutButtonClick();
        Assert.assertTrue(userStep.isLabelDisplayed(), "About page is not opened!");
    }
}
