package test.step;

import test.page.AboutPage;
import test.page.DXOMarkPage;

public class UserStep {

    public void openMainPage() {
        new DXOMarkPage().openBrowser();
    }

    public boolean iNavigationPanelDisplayed() {
        return new DXOMarkPage().iNavigationPanelDisplayed();
    }

    public AboutPage aboutButtonClick() {
        return new DXOMarkPage().aboutButtonClick();
    }

    public boolean isLabelDisplayed() {
        return new AboutPage().isLabelDisplayed();
    }
}
