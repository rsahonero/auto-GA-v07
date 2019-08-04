package testingui.diplomadoumss.org.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import testingui.diplomadoumss.org.core.DriverManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Event {

    public static void clickWebElement(WebElement element){
        isWebElementClickable(element);
        element.click();
    }

    public static WebElement findWebElement(List<WebElement> elements, String content) {
        return elements.stream().filter(element -> content.equals(element.getText())).findAny().orElse(null);
    }


    public static Boolean existElement(List<WebElement> elements, String content, int n) {
        boolean isNameExist = false;
        int i = 0;
        int size = elements.size();
        while (isNameExist==false && i < size) {
            List<WebElement> cells = elements.get(i).findElements(By.cssSelector("td"));
            isNameExist = cells.get(n).getText().contains(content);
            System.out.println(cells.get(n).getText());
            i = i + 1;
        }
        return isNameExist;
    }

    public static List<String> getListElement(List<WebElement> elements,  int n) {
        List<String> rest=new ArrayList<String>();

        for (WebElement e:elements) {
            List<WebElement> cells = e.findElements(By.cssSelector("td"));
            rest.add(cells.get(n).getText());
        }
        return rest;
    }



    public static void fillWebElement(WebElement element, String value){
        isWebElementVisible(element);
        element.clear();
        element.sendKeys(value);
        element.sendKeys(Keys.TAB);
    }

    public static void isWebElementVisible(WebElement element){
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static void isWebElementClickable(WebElement element){
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void avoidToUse(int seconds){
        try{
            Thread.sleep(seconds * 1000);
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }

    public static String getWebElementText(WebElement element) {
        return       element.getText();
    }

    public static void selectElement(WebElement statusFields, String status) {
        Select a=new Select(statusFields);
        a.selectByVisibleText(status);


    }

    public static void attachment(String location, WebElement element) {
        LocalFileDetector detector = new LocalFileDetector();
        File file = detector.getLocalFile(location);
        element.sendKeys(file.getAbsolutePath());
    }
}
