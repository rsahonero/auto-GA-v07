package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Accounts') and @aria-expanded='false']")
    private WebElement accountsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'General') and @aria-expanded='false']")
    private WebElement generalExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='ACCOUNTS']//a[contains(., 'Admins')]")
    private WebElement adminsClicked;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul//a[contains(., 'Payment Gateways')]")
    private WebElement  paymentsGaytwaysClicked;

    @FindBy(xpath = "//div[@id=\"accordion\"]//div[@class='panel panel-default'][1]//span")
    private WebElement  movedownClicked;

    @FindBy(xpath = "//div[@id=\"accordion\"]/form[3]/div/div[1]/h4/div/span[1]")
    private WebElement  moveupClicked;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/form/div[1]/select")
    private WebElement  dropdownClicked;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/form/div[1]/select/option[2]")
    private WebElement  recordClicked;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/form/div[2]/input[2]")
    private WebElement  activateClicked;

    @FindBy(xpath = "//*[@id=\"accordion\"]/form[1]/div/div[1]/h4/div/a[2]")
    private WebElement  deactivateClicked;

    @FindBy(xpath = "//*[@id=\"deactivepayonarrival\"]/div[2]/div/form/div[2]/div/div/select/option[1]")
    private WebElement  deactivatedropdownClicked;

    @FindBy(xpath = "//*[@id=\"deactivepaypalexpress\"]/div[2]/div/form/div[3]/button[2]")
    private WebElement  savechangesClicked;

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div[@class='btn-group pull-right']//a[contains(., 'Print')]")
    private WebElement printClicked;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Blog') and @aria-expanded='false']")
    private WebElement blogExpand;
    ////*[@id="Blog"]/li[2]/a
    //@FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='Blog']//a[contains(., 'Blog Categories')]")
//    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul//a[contains(., 'Blog Categories')]")
//    private WebElement blogCategoriesClicked;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='Blog']//a[contains(text(),'Blog Categories')]")
    private WebElement blogCategoriesClicked;

    @FindBy(xpath = "document.querySelector(\"#sidebar > div.social-sidebar")
    private WebElement  sidebarCliked;

    @FindBy(id = "sidebar")
    private WebElement leftPanel;

    @FindBy(xpath = "//div[@class='wrapper']/nav[@id='sidebar']")
    private WebElement sidebar;

    @FindBy(xpath = "//a[contains(text(),'NASA API Listing')]")
    private WebElement NasaApiclicked;

    @FindBy(xpath = "//a[contains(text(),'NASA API Listing')]")
    private WebElement NasaApiclicked2;


    public Dashboard() {
         avoidToSecond(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }

    public Dashboard clickAccountsExpand() {
        clickWebElement(accountsExpand);
        return this;
    }

    public Dashboard clickAdminsOption() {
        clickWebElement(adminsClicked);
        return this;
    }

    public Dashboard clickGeneralExpand() {
        clickWebElement(generalExpand);
        return this;
    }

    public Dashboard clickPaymentGatewaysOption() {
        clickWebElement(paymentsGaytwaysClicked);
        return this;
    }

    public Dashboard clickPrintOption() {
        clickWebElement(printClicked);
        return this;
    }

    public Dashboard clickBlogExpand() {
        clickWebElement(blogExpand);
        return this;
    }


    public void moveTheScrollSidebarToDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('sidebar').style.top = '-100px'");
    }

    public Dashboard clickMoveDown(){
        clickWebElement(movedownClicked);
        return this;
    }
    public Dashboard clickMoveUp(){
        clickWebElement(moveupClicked);
        return this;
    }

    public Dashboard clickDropdown(){
        clickWebElement(dropdownClicked);
        return this;
    }

    public Dashboard clickRecord(){
        clickWebElement(recordClicked);
        return this;
    }
    public Dashboard clickActivate(){
        clickWebElement(activateClicked);
        return this;
    }

    public Dashboard clickDeactivate(){
        clickWebElement(deactivateClicked);
        return this;
    }

    public Dashboard clickDeactivatedropdown(){
        clickWebElement(deactivatedropdownClicked);
        return this;
    }

    public Dashboard clickChanges(){
        clickWebElement(savechangesClicked);
        return this;
    }

    public Dashboard clickNasaApi() {
        clickWebElement(NasaApiclicked);
        return this;
    }

    public Dashboard clickNasaApi2() {
        clickWebElement(NasaApiclicked2);
        return this;
    }


}
