package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.manageloadpage.LoadPageNasa;
import testingui.diplomadoumss.org.managepage.adminsmanagement.AdminsManagement;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToSecond;

public class LoginStepdefs {

    private Login login;
    private LoadPageNasa loadPageNasa;
    private Dashboard dashboard;

    private AdminsManagement adminsManagement;

    private DriverManager driverManager;

    private WebDriver webDriver;

    @Given("^I Load PHP Travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPHPTravels();
    }

    @And("^Set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^Click 'General' link on 'Left Panel' Page$")
    public void clickGeneralLinkOnLeftPanelPage() throws  Throwable {
        dashboard.clickGeneralExpand();
        avoidToSecond(4);
        dashboard.clickPaymentGatewaysOption();
        avoidToSecond(4);
        dashboard.clickMoveDown();
        avoidToSecond(4);
        dashboard.clickMoveUp();
        avoidToSecond(5);
        dashboard.clickDropdown();
        avoidToSecond(4);
        dashboard.clickRecord();
        dashboard.clickActivate();
        dashboard.clickDeactivate();
        dashboard.clickDeactivatedropdown();
        avoidToSecond(2);
        dashboard.clickChanges();
    }

    @And("^Click 'Accounts' link on 'Left Panel' Page$")
    public void clickAccountsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickAccountsExpand();
    }

    @And("^Click 'Admins' link on 'Accounts Expand'$")
    public void clickAdminsLinkOnAccountsExpand() throws Throwable {
        dashboard.clickAdminsOption();
    }

    @And("^Click 'PRINT' button on 'admin management' page$")
    public void clickPRINTButtonOnAdminManagementPage() throws Throwable {
        dashboard.clickPrintOption();
    }


    @And("^Move Down The Sidebar Menu$")
    public void moveDownTheSidebarMenu() {
        WebDriver driver = webDriver;
        dashboard.moveTheScrollSidebarToDown(driver);
    }

    @Given("^I load Nasa$")
    public void iLoadNasa() throws Throwable {
        loadPageNasa = LoadPageNasa.IloadNasa();
    }

    @And("^click 'Nasa' link on 'Left Panel' page$")
    public void clickNasaLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickNasaApi();
        dashboard.clickNasaApi2();

    }

}
