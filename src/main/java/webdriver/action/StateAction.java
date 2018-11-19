//package webdriver.action;
//
//import com.epam.lab.webdriver.WebDriverHolder;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import ru.yandex.qatools.htmlelements.element.HtmlElement;
//
//public class StateAction {
//
//    public static boolean isElementDisplayed(WebElement webElement) {
//        try {
//            return webElement.isDisplayed();
//        } catch (Exception e) {
//            return false;
//        }
//    }
//
//    public static boolean isElementDisplayed(HtmlElement element) {
//        return isElementDisplayed(element.getWrappedElement());
//    }
//
//    public static boolean isElementDisplayed(By locator) {
//        return WebDriverHolder.getWebDriver().findElements(locator).size() > 0;
//    }
//
//    public static boolean isElementEnabled(WebElement webElement) {
//        return isElementDisplayed(webElement) && webElement.isEnabled();
//    }
//
//    public static boolean isElementEnabled(HtmlElement element) {
//        return isElementEnabled(element.getWrappedElement());
//    }
//}