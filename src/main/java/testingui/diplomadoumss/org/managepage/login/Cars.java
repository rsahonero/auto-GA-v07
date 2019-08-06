package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

public class Cars extends BasePage {

    @FindBy(css = "a[href$=Cars]")
    private WebElement carForm;

    @FindBy(css = "li a[href$=cars]")
    private WebElement carSubForm;


    public void goToCars(){
        carForm.click();
        carSubForm.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
