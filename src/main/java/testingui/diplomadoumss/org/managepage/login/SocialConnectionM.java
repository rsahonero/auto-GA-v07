package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.WaitMethods;
import testingui.diplomadoumss.org.managepage.BasePage;

import java.io.File;

public class SocialConnectionM extends BasePage {
    @FindBy(css="a.btn.btn-success.xcrud-action")
    private WebElement Addbutton;

    @FindBy(css="input.xcrud-upload")
    private WebElement attach;




    public void clickButton(){
        WaitMethods.waitJava(1000);
        Addbutton.click();
        WaitMethods.waitJava(1000);
    }

    public void AttachmentTest(){

        LocalFileDetector detector = new LocalFileDetector();
        File file = detector.getLocalFile("D:\\test.png");
        attach.sendKeys(file.getAbsolutePath());
        // btnUploadFile.click();

    }


}