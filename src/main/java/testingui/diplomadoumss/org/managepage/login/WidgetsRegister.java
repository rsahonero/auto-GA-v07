package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import testingui.diplomadoumss.org.core.WaitMethods;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;

public class WidgetsRegister extends BasePage {

    @FindBy(css="input[name='title']")
    private WebElement titleFields;

    @FindBy(css="select[name='status']")
    private WebElement statusFields;

    @FindBy(css="button.btn-primary")
    private WebElement addButton;

    public void RegisterWidgets(String title,String status){
        Event.fillWebElement(titleFields,title);
        Event.selectElement(statusFields,status);
        Event.clickWebElement(addButton);
        Event.avoidToUse(3);
    }

    public void SetNameWidgets(String title) {
        Event.fillWebElement(titleFields,title);
        Event.clickWebElement(addButton);
        Event.avoidToUse(3);
    }

    public void SetStateWidget(String status) {
        Event.selectElement(statusFields,status);
        Event.clickWebElement(addButton);
        Event.avoidToUse(3);

    }
}
