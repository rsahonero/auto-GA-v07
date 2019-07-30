package testingui.diplomadoumss.org.manageloadpage;

import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

public class LoadPageNasa {


    public static LoadPage loadNasa1(){
        DriverManager.getInstance().getWebDriver()
                .navigate().to(PropertyAccesor.getInstance().getURL());

        return new LoadPage();
    }
}
