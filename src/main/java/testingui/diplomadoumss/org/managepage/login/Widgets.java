package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;

import java.util.List;

public class Widgets extends BasePage {
    @FindBy(css = "button[type='submit']")
    private WebElement Addbutton;

    @FindBy(css = "tr.xcrud-row:nth-child(1) > td:nth-child(3)")
    private WebElement widgetName;

    @FindBy(css = "tr.xcrud-row:nth-child(1) span:nth-child(1) a:nth-child(2) i")
    private WebElement firstDelete;

    @FindBy(css = "tr.xcrud-row:nth-child(2) span:nth-child(1) a:nth-child(1) i")
    private WebElement secondEdit;

    @FindBy(css = "tbody tr")
    private List<WebElement> tableName;

    @FindBy(css = "th.xcrud-column:nth-child(3)")
    private WebElement nameLink;

    @FindBy(css = "th.xcrud-column:nth-child(4)")
    private WebElement widgetsLink;

    @FindBy(css = "th.xcrud-column:nth-child(5)")
    private WebElement widgetStatus;

    @FindBy(css ="a.xcrud-search-toggle")
    private WebElement searchButton;

    @FindBy(css ="select.xcrud-columns-select")
    private WebElement selectSearch;

    @FindBy(css ="input.xcrud-searchdata")
    private WebElement searcTesxField;

    @FindBy(css ="a.xcrud-action.btn-primary")
    private WebElement goButton;

    @FindBy(css =".xcrud-row > td")
    private List<WebElement> listTable;

    public String getFirstTable(){
        Event.avoidToUse(3);
        return listTable.get(2).getText();
    }


    public void clickButton(){
        Event.clickWebElement(Addbutton);
    }

    public String getWidgetName(){
        return Event.getWebElementText(widgetName);
    }

    public void clikDeletedFirstWidget(){
        Event.clickWebElement(firstDelete);
    }


    public boolean existNameElement(String wiggetName) {
        //n=2 es name
     return Event.existElement(tableName,wiggetName,2);
    }

    public void clickEditSecondWidget() {
       Event.clickWebElement(secondEdit);
    }


    public boolean existStatusElement(String status) {
        if(status.equals("Enable"))
            status="Yes";
        else
            status="No";
        return Event.existElement(tableName,status,4);
    }

    public void clickName() {
      Event.clickWebElement(nameLink);
      Event.avoidToUse(4);
    }

    public boolean listNameOrder() {
        return nameLink.getAttribute("data-order").contains("asc");
    }

    public void clickWidgetsCode() {
        Event.clickWebElement(widgetsLink);
        Event.avoidToUse(4);
    }
    public boolean listWidgetOrder() {
        return widgetsLink.getAttribute("data-order").contains("asc");
    }

    public boolean listWidgetOrderDesc() {
         return widgetsLink.getAttribute("data-order").contains("desc");
    }

    public void clickWidgetStatus() {
        Event.clickWebElement(widgetStatus);
        Event.avoidToUse(4);
    }
    public boolean listWidgetStatusOrder() {
        return widgetStatus.getAttribute("data-order").contains("asc");
    }

    public void doubleClickWidgetsCode() {
        Event.clickWebElement(widgetsLink);
        Event.avoidToUse(2);

    }

    public boolean listWidgetStatusOrderDesc() {
        return widgetStatus.getAttribute("data-order").contains("desc");
    }

    public void clickSearch() {
        Event.clickWebElement(searchButton);
    }

    public void selectDopdown(String search) {
        Event.selectElement(selectSearch,search);
    }

    public void typeWidgetName(String name) {
        Event.fillWebElement(searcTesxField,name);
    }

    public void clickGo() {
        Event.clickWebElement(goButton);
    }

    public void clickAcceptPopup() {
        Event.avoidToUse(2);
        webDriver.switchTo().alert().accept();
        Event.avoidToUse(3);
    }
}
