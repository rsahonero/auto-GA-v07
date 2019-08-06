package testingui.diplomadoumss.org.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testingui.diplomadoumss.org.core.DriverManager;

public class Event {

    public static void clickWebElement(WebElement webElement) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement)).click();
        //webElement.click();
    }

    public static void clickWebElement(By by) {
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(by)).click();
        //DriverManager.getInstance().getWebDriver().findElement(by).click();
    }

    public static void fillWebElement(WebElement element, String value){
        isWebElementVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public static void isWebElementVisible(WebElement element){
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static void isWebElementClickable(WebElement element){
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void avoidToUse(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public static String getWebElementText(WebElement element) {
        return element.getText();
    }
}
