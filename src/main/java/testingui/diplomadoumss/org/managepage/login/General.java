package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.WaitMethods;
import testingui.diplomadoumss.org.managepage.BasePage;

public class General extends BasePage {


    @FindBy(css = "a[href$=menu-ui]")
    private WebElement GeneralForm;


 //   @FindBy(css = "li a[href$='widgets/']")
 //   private WebElement Widgets;


    @FindBy(css = "li a[href$='social/']")
    private WebElement socialConnection;



 //   public void goToWidgets(){
  //      GeneralForm.click();
 //       WaitMethods.waitJava(1000);
 //       Widgets.click();
 //       WaitMethods.waitJava(1000);
  //  }

    public void gotoSocialConnection() {
        GeneralForm.click();
        WaitMethods.waitJava(1000);
        socialConnection.click();
        WaitMethods.waitJava(1000);

    }
}
