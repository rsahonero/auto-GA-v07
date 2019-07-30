package testingui.diplomadoumss.org.manageevents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testingui.diplomadoumss.org.core.DriverManager;

public class Event {

    public static void clickWebElement(WebElement webElement) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public static void fielWebElement(WebElement webElement, String value) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(value);
    }

//    public static void moveToElment (WebElement webElement ){
//        DriverManager.getInstance().getWebDriverWait().until()
//    }

    public static void isWebElementVisible(WebElement element){
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static void avoidToSecond(Integer seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
