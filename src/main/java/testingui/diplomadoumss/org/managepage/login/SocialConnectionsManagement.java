package testingui.diplomadoumss.org.managepage.login;

import cucumber.runtime.io.Resource;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.WaitMethods;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;

import java.io.File;

import static com.google.common.io.Resources.getResource;

public class SocialConnectionsManagement extends BasePage {
    @FindBy(css="a.btn.btn-success.xcrud-action")
    private WebElement Addbutton;

    @FindBy(css="input.xcrud-upload")
    private WebElement attach;

    @FindBy(css="input.xcrud-input[type=text]")
    private WebElement socialNameText;

    @FindBy(css="[id^='editor']")
    private WebElement socialLinkText;

    @FindBy(css="a.btn[data-after='list']")
    private WebElement saveReturnButton;

    @FindBy(css="tr.xcrud-row:nth-child(7) > td:nth-child(4)")
    private WebElement socialconetiontable;



    public void clickButton(){
        Event.clickWebElement(Addbutton);
        Event.avoidToUse(2);
    }

    public void setRegisterSocialConection(String name,String link){
       Event.attachment("D://CARS//auto-GA-v07//src//test//resources//image//icon.png",attach);
       Event.avoidToUse(2);
       Event.fillWebElement(socialNameText,name);
       Event.fillWebElement(socialLinkText,link);
       Event.clickWebElement(saveReturnButton);
    }


    public String getLastElement() {
         Event.avoidToUse(5);
        return Event.getWebElementText(socialconetiontable);

    }
}
