package testingui.diplomadoumss.org.stepsdefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import testingui.diplomadoumss.org.managepage.login.General;
import testingui.diplomadoumss.org.managepage.login.SocialConnectionsManagement;

public class SocialConnectionStepsdefs {
    private General general;
    private SocialConnectionsManagement social=new SocialConnectionsManagement();
    private String imagebuffer;

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
        social.clickSaveReturn();

    }

    @Then("^The \"([^\"]*)\" should be shon in the table$")
    public void theShouldBeShonInTheTable(String exp) {
        String actual=social.getLastElement();
        Assert.assertEquals(actual,exp);
    }

    @And("^'Save & New' of the  register with \"([^\"]*)\" name and \"([^\"]*)\" link$")
    public void saveNewOfTheRegisterWithNameAndLink(String name, String url) throws Throwable {
        social.setRegisterSocialConection(name,url);
        social.clickSaveNew();
    }


    @Then("^The 'Social Name' should blank$")
    public void theSocialNameShouldBlank() {
        String actual=social.getelementRegister();
        Assert.assertEquals(actual,"");
    }

    @And("^'Save & Edit' of the  register with \"([^\"]*)\" name and \"([^\"]*)\" link$")
    public void saveEditOfTheRegisterWithNameAndLink(String name, String url) {
        social.setRegisterSocialConection(name,url);
        social.clickSaveEdit();
    }

    @Then("^The \"([^\"]*)\" should shown$")
    public void theShouldShown(String exp) {
        String actual=social.getelementRegister();
        Assert.assertEquals(actual,exp);
    }

    @And("^'Return' of the  register$")
    public void returnOfTheRegister() {
        social.clickReturn();
    }

    @Then("^The table should shown$")
    public void theTableShouldShown() {
        boolean actual=social.getTable();
        Assert.assertTrue(actual);

    }

    @And("^Add a imagen$")
    public void addAImagen() {
        social.AddImage();
        imagebuffer=social.getImageSrc();
    }

    @And("^Click Add the other image$")
    public void clickAddTheOtherImage() {
        social.clickAddimage();
    }

    @Then("^The image should be update$")
    public void theImageShouldBeUpdate() {
        String actual= social.getImageSrc();
        Assert.assertNotEquals(actual,imagebuffer);
    }

    @And("^Delete image$")
    public void deleteImage() {
        social.clickRemove();
    }

    @Then("^The image is not shown$")
    public void theImageIsNotShown() {
        boolean actual=social.getIsExistImage();
        Assert.assertFalse(actual);
    }


    @When("^deleted 'Social Conection'$")
    public void deletedSocialConection() {
        social.clickDeletedSocial();
    }

    @Then("^The \"([^\"]*)\" must not shown in the 'Social Conection' table$")
    public void theMustNotShownInTheSocialConectionTable(String exp) throws Throwable {
        boolean actual= social.existNameElement(exp);
        Assert.assertFalse(actual,"The element is not deleted");
    }

    @When("^Edit 'Social Conection'$")
    public void editSocialConection() {

        social.clickEditSocial();

    }

    @And("^the 'Twitter' changes \"([^\"]*)\"$")
    public void theTwitterChanges(String name) throws Throwable {
        social.editNameSocial(name);
    }

    @Then("^The \"([^\"]*)\" must be shown in the 'Social Conection' table$")
    public void theMustBeShownInTheSocialConectionTable(String exp) throws Throwable {
        boolean actual= social.existNameElement(exp);
        Assert.assertTrue(actual,"The element is not deleted");
    }

    @And("^the 'https://twitter\\.com/phptravels' changes \"([^\"]*)\"$")
    public void theHttpsTwitterComPhptravelsChanges(String link) throws Throwable {
        social.editLinkSocial(link);
    }

    @Then("^The \"([^\"]*)\" must be shown in the 'Social Conection' link$")
    public void theMustBeShownInTheSocialConectionLink(String link) throws Throwable {
        boolean actual= social.existLinkElement(link);
        Assert.assertTrue(actual,"The element is not deleted");
    }

    @And("^the 'Yes' changes to 'No'$")
    public void theYesChangesToNo() {
        social.selectStatusSocial();
    }

    @Then("^The \"([^\"]*)\" must be shown in the 'Social Conection' Status$")
    public void theMustBeShownInTheSocialConectionStatus(String status) throws Throwable {
        boolean actual= social.existStatusElement(status);
        Assert.assertTrue(actual,"The element is not deleted");
    }
}
