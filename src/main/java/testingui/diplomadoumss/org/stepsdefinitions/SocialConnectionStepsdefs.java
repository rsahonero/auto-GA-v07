package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import testingui.diplomadoumss.org.managepage.login.General;
import testingui.diplomadoumss.org.managepage.login.SocialConnectionM;

public class SocialConnectionStepsdefs {

    private General general;
    private SocialConnectionM social;


    @And("^click 'General' link on 'Social Connection' page$")
    public void clickGeneralLinkOnSocialConectionPage() {
        general= new General();
        general.gotoSocialConnection();
    }

    @When("^Add 'Social Connection'$")
    public void addSocialConnection() {
        social= new SocialConnectionM();
        social.clickButton();
        social.AttachmentTest();

    }
}
