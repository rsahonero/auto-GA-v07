package testingui.diplomadoumss.org.managepage.login;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.WaitMethods;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    @FindBy(css = "input[name='email']")
    private WebElement emailTextField;

    @FindBy(css = "input[name='password']")
    private WebElement passwordTextField;

    @FindBy(css = "button[type=submit]")
    private WebElement loguinButton;


    public void setCredentials() {
        emailTextField.sendKeys(PropertyAccesor.getInstance().getUsername());
        passwordTextField.sendKeys(PropertyAccesor.getInstance().getPassword());
        loguinButton.click();
        WaitMethods.waitJava(10000);

    }
}
