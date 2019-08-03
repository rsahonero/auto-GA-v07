package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import testingui.diplomadoumss.org.managepage.login.General;
import testingui.diplomadoumss.org.managepage.login.SocialConnectionsManagement;

public class SocialConectionStepsdefs {
    private General general;
    private SocialConnectionsManagement social=new SocialConnectionsManagement();


    @And("^click 'General' link on 'Social Conection' page$")
    public void clickGeneralLinkOnSocialConectionPage() {
        general= new General();
        general.gotoSocialConection();
    }

    @When("^Add 'Social Conection'$")
    public void addSocialConection() {
         social.clickButton();
    }

    @And("^'Save and Return' of the  register with \"([^\"]*)\" name and \"([^\"]*)\" link$")
    public void saveAndReturnOfTheRegisterWithNameAndLink(String name, String link)  {
        social.setRegisterSocialConection(name,link);

    }

    @Then("^The \"([^\"]*)\" should be shon in the table$")
    public void theShouldBeShonInTheTable(String exp) {
        String actual=social.getLastElement();
        Assert.assertEquals(actual,exp);
    }
}
