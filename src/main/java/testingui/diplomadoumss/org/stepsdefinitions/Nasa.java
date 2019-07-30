package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.manageloadpage.LoadPageNasa;

public class Nasa {
    public LoadPage nasa;
    @Given("^I load Nasa$")
    public void iLoadNasa() {
        nasa= LoadPageNasa.loadNasa1();

    }

    @And("^click 'Nasa Api Listing'$")
    public void clickNasaApiListing() {
    }

    @And("^click 'Nasa Api Listing' second time$")
    public void clickNasaApiListingSecondTime() {
    }

    @And("^click 'Earth'$")
    public void clickEarth() {

    }

    @And("^click 'Imagery'$")
    public void clickImagery() {
    }



    @Then("^'obtener' el link de la seccion Get$")
    public void obtenerElLinkDeLaSeccionGet() {
    }
}
