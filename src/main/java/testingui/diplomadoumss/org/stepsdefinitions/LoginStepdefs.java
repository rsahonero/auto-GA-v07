package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.login.General;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoginStepdefs {
 private Login login;
//    private Cars cars;
    private General general;
//    private Widgets widgets=new Widgets();
//
    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

//    @And("^click 'Cars' link on 'Left Panel' page$")
//    public void clickCarsLinkOnLeftPanelPage() {
//      cars= CarPage.goTOCarsSubform();
//      cars.goToCars();
//
//    }

 //   @And("^click 'General' link on 'Left Panel' page$")
 //   public void clickGeneralLinkOnLeftPanelPage() {
 //       general=new General();
 //       general.goToWidgets();


//    }

//    @When("^Add 'Widgets'$")
//    public void addWidgets() {
//        widgets.clickButton();
 //   }

//    @And("^Set \"([^\"]*)\" title, \"([^\"]*)\" status$")
//    public void setTitleStatusAndDescription(String title, String status)  {
//        WidgetsRegister widgets=new WidgetsRegister();
//        widgets.RegisterWidgets(title,status);

//    }

    /*@Then("^Verify that the \"([^\"]*)\" is created$")
    public void verifyThatTheIsCreated(String exp) throws Throwable {
     String actual=widgets.getWidgetName();
     String expected=exp;

    }*/
}
