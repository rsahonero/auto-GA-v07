package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.WaitMethods;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;

public class General extends BasePage {


    @FindBy(css = "a[href$=menu-ui]")
    private WebElement GeneralForm;


    @FindBy(css = "li a[href$='widgets/']")
    private WebElement Widgets;


    @FindBy(css = "li a[href$='social/']")
    private WebElement socialConection;



    public void goToWidgets(){
        Event.clickWebElement(GeneralForm);
        Event.avoidToUse(2);
        Event.clickWebElement(Widgets);
        Event.avoidToUse(3);
    }

    public void gotoSocialConection() {
        Event.clickWebElement(GeneralForm);
        Event.avoidToUse(2);
        Event.clickWebElement(socialConection);
        Event.avoidToUse(3);
    }
}
