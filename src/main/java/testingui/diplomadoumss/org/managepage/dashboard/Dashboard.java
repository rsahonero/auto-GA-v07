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

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div[@class='btn-group pull-right']//a[contains(., 'Print')]")
    private WebElement printClicked;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Blog') and @aria-expanded='false']")
    private WebElement blogExpand;
    ////*[@id="Blog"]/li[2]/a
    //@FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='Blog']//a[contains(., 'Blog Categories')]")
    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='Blog']//a[contains(text(),'Blog Categories')]")
    private WebElement blogCategoriesClicked;

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

    public Dashboard clickBlogCategoriesOption() {
        clickWebElement(blogCategoriesClicked);
        return this;
    }

    public void moveTheScrollSidebarToDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('sidebar').style.top = '-100px'");
    }
}
