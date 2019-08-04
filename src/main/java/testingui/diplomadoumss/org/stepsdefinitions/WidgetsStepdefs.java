package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.login.General;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.login.Widgets;
import testingui.diplomadoumss.org.managepage.login.WidgetsRegister;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class WidgetsStepdefs {
    private Login login;
    private General general;
    private Widgets widgets=new Widgets();

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @And("^click 'General' link on 'Left Panel' page$")
    public void clickGeneralLinkOnLeftPanelPage() {
        general=new General();
        general.goToWidgets();

    }

    @When("^Add 'Widgets'$")
    public void addWidgets() {
        widgets.clickButton();
    }

    @And("^Set \"([^\"]*)\" title, \"([^\"]*)\" status$")
    public void setTitleStatusAndDescription(String title, String status)  {
        WidgetsRegister widgets=new WidgetsRegister();
        widgets.RegisterWidgets(title,status);

    }

    @Then("^The \"([^\"]*)\" must be shown in the table$")
    public void theMustBeShownInTheTable(String exp) throws Throwable {
        String actual=widgets.getWidgetName();
        Assert.assertEquals(actual,exp,"The actual result is not expected");

    }

    @And("^Logout$")
    public void logout() {
        login=new Login();
        login.logout();

    }

    @And("^click Deleted Icon in the 'Test Widgets'$")
    public void clickDeletedIconInTheTestWidgets() {
        widgets.clikDeletedFirstWidget();
    }


    @And("^click Accept popup$")
    public void clickAcceptPopup() {
        widgets.clickAcceptPopup();
    }

    @Then("^the \"([^\"]*)\" register should not shown in the table$")
    public void theRegisterShouldNotShownInTheTable(String exp) throws Throwable {
        boolean actual= widgets.existNameElement(exp);
        Assert.assertFalse(actual,"The element is not deleted");
    }

    @And("^click Edit Icon$")
    public void clickEditIconInTheOffersPageLeftAdvertisement() {
        widgets.clickEditSecondWidget();
    }

    @And("^\"([^\"]*)\"changed to 'Offers Page Left Advertisement'$")
    public void changedToOffersPageLeftAdvertisement(String title) throws Throwable {
        WidgetsRegister widgets=new WidgetsRegister();
        widgets.SetNameWidgets(title);

    }

    @Then("^The \"([^\"]*)\" name should be change$")
    public void theNameShouldBeChange(String name)  {
      boolean actual= widgets.existNameElement(name);
      Assert.assertTrue(actual,"The name is not changed");
    }

    @And("^\"([^\"]*)\" change in the 'Footer hotels booking expedia and other logos'$")
    public void changeInTheFooterHotelsBookingExpediaAndOtherLogos(String status) {
        WidgetsRegister widgets=new WidgetsRegister();
        widgets.SetStateWidget(status);

    }

    @Then("^The \"([^\"]*)\" status should be change$")
    public void theStatusShouldBeChange(String status)  {
        boolean actual= widgets.existStatusElement(status);
        Assert.assertTrue(actual,"The name is not changed");

    }


    @And("^click in the Name link$")
    public void clickInTheNameLink() {
        widgets.clickName();
    }

    @Then("^The name is order by name$")
    public void theNameIsOrderByName() {
     boolean actual= widgets.listNameOrder();
     Assert.assertTrue(actual);

    }

    @And("^click in the WidgetsCode link$")
    public void clickInTheWidgetsCodeLink() {
        widgets.clickWidgetsCode();
    }

    @Then("^The WidgetsCode should be  order by Code$")
    public void theWidgetsCodeShouldBeOrderByCode() {
        boolean actual= widgets.listWidgetOrder();
        Assert.assertTrue(actual);
   }

    @And("^click in the Widget Status link$")
    public void clickInTheWidgetStatusLink() {
      widgets.clickWidgetStatus();
    }

    @Then("^The Widget Status should be order by Status$")
    public void theWidgetStatusShouldBeOrderByStatus() {
        boolean actual= widgets.listWidgetStatusOrder();
        Assert.assertTrue(actual);
    }

    @And("^Click in the WidgetsCode link$")
    public void ClickInTheWidgetsCodeLink(){

        widgets.doubleClickWidgetsCode();
    }

    @Then("^The WidgetsCode should be order by Code desc$")
    public void theWidgetsCodeShouldBeOrderByCodeDesc() {
        boolean actual= widgets.listWidgetOrderDesc();
        Assert.assertTrue(actual);
    }


    @Then("^The Widget Status should be order by Status desc$")
    public void theWidgetStatusShouldBeOrderByStatusDesc() {
        boolean actual= widgets.listWidgetStatusOrderDesc();
        Assert.assertTrue(actual);


    }

    @And("^click in the search$")
    public void clickInTheSearch() {
        widgets.clickSearch();

    }

    @And("^select \"([^\"]*)\"$")
    public void select(String search)  {
        widgets.selectDopdown(search);
         }


    @And("^type \"([^\"]*)\" widget name and click go$")
    public void typeWidgetNameAndClickGo(String name) throws Throwable {
        widgets.typeWidgetName(name);
        widgets.clickGo();
    }

    @Then("^the \"([^\"]*)\" shown be shown in the table$")
    public void theShownBeShownInTheTable(String expected) throws Throwable {
        String actual= widgets.getFirstTable();
        Assert.assertTrue(actual.contains(expected));
    }

}
