package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.BroserType;
import testingui.diplomadoumss.org.core.Browser;
import testingui.diplomadoumss.org.core.DriverFactory;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Accounts') and @aria-expanded='false']")
    private WebElement accountsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='ACCOUNTS']//a[contains(., 'Admins')]")
    private WebElement adminsClicked;

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div[@class='btn-group pull-right']//a[contains(., 'Print')]")
    private WebElement printClicked;

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div[@class='btn-group pull-right']//a[contains(., ' Export into CSV')]")
    private WebElement exportIntoCsvClicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//div//button[@type='button' and @data-limit='all' and contains(text(), 'All')]")
    private WebElement allClicked;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_first_name']")
    private WebElement clickDescOrderFirstNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_first_name']")
    private WebElement clickAscOrderFirstNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_last_name']")
    private WebElement clickDescOrderLastNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_last_name']")
    private WebElement clickAscOrderLastNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_email']")
    private WebElement clickDescOrderEmailColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_email']")
    private WebElement clickAscOrderEmailColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_status']")
    private WebElement clickDescOrderActiveColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_status']")
    private WebElement clickAscOrderActiveColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_last_login']")
    private WebElement clickDescOrderLastLoginColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_last_login']")
    private WebElement clickAscOrderLastLoginColumn;

    @FindBy(xpath = "//td//span[@class='btn-group']//a[@title='Edit' and @href='https://www.phptravels.net/admin/accounts/admins/edit/39']")
    private WebElement editClicked;

    @FindBy(xpath = "//td//span[@class='btn-group']//a[@title='DELETE' and @id='39']")
    private WebElement deleteClicked;

    @FindBy(xpath = "//button[@class='btn btn-success' and @type='submit' and contains(text(), 'Add')]")
    private WebElement addClicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//div//button[@type='button' and @data-limit='10' and contains(text(), '10')]")
    private WebElement number10Clicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//div//button[@type='button' and @data-limit='25' and contains(text(), '25')]")
    private WebElement number25Clicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//div//button[@type='button' and @data-limit='50' and contains(text(), '50')]")
    private WebElement number50Clicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//div//button[@type='button' and @data-limit='100' and contains(text(), '100')]")
    private WebElement number100Clicked;

    @FindBy(xpath = "//div[@class='xcrud-nav']//a[@class='xcrud-search-toggle btn btn-default' and contains(text(), 'Search')]")
    private WebElement searchClicked;

    @FindBy(xpath = "//input[@name='phrase' and @type='text']")
    private WebElement phraseTextField;

    @FindBy(xpath = "//span[@class='btn-group']//a[@data-search='1' and contains(text(), 'Go')]")
    private WebElement goClicked;

    @FindBy(xpath = "//span[@class='btn-group']//a[@data-search='0' and contains(text(), 'Reset')]")
    private WebElement resetClicked;

    @FindBy(xpath = "//a/strong[contains(text(), 'Logout')]")
    private WebElement logautLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'General') and @aria-expanded='false']")
    private WebElement generalExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul//a[contains(., 'Payment Gateways')]")
    private WebElement  paymentsGaytwaysClicked;

    @FindBy(xpath = "//*[@id=\"accordion\"]/form[3]/div/div[1]/h4/div/span[2]")
    private WebElement  movedownClicked;

    @FindBy(xpath = "//*[@id=\"accordion\"]/form[2]/div/div[1]/h4/div/span[1]")
    private WebElement  moveupClicked;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/form/div[1]/select")
    private WebElement  activateClicked;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/form/div[1]/select/option[3]")
    private WebElement  activaterecordClicked;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/form/div[2]/input[2]")
    private WebElement  activatebuttonClicked;

    @FindBy(xpath = "//*[@id=\"accordion\"]/form[4]/div/div[1]/h4/div/a[2]")
    private WebElement  desactivatebuttonClicked;

    @FindBy(xpath = "//*[@id=\"deactivestripe\"]/div[2]/div/form/div[2]/div/div/select")
    private WebElement  desactivatedropClicked;

    @FindBy(xpath = "//*[@id=\"deactivestripe\"]/div[2]/div/form/div[2]/div/div/select/option[3]")
    private WebElement  desactivaterecordClicked;

    @FindBy(xpath = "//*[@id=\"deactivepaypalexpress\"]/div[2]/div/form/div[3]/button[2]")
    private WebElement  saveclicked;

    @FindBy(xpath = "//*[@id=\"deactivebanktransfer\"]/div[2]/div/form/div[1]/button/span")
    private WebElement  closepopupclicked;

    @FindBy(xpath = "//*[@id=\"deactivebanktransfer\"]/div[2]/div/form/div[3]/button[1]")
    private WebElement  buttonCloseClicked;

    @FindBy(xpath = "//*[@id=\"menu-ui\"]/li[6]/a")
    private WebElement expandSliderClicked;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/div")
    private WebElement checkSliderClicked;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[10]/span/a[1]")
    private WebElement viewSliderClicked;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/a")
    private WebElement viewreturnClicked;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/a[1]")
    private WebElement printsliderClicked;

    @FindBy(xpath = " //*[@id=\"order_49\"]")
    private WebElement ordersliderClicked;

    //JaimeOjeda
    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Blog') and @aria-expanded='false']")
    private WebElement blogExpand;

    /*@FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='Blog']//a[contains(., 'Blog Categories')]")
    private WebElement blogCategoriesClicked;*/

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='Blog']//a[contains(., 'Posts')]")
    private WebElement subMenuPosts;

    @FindBy(id = "sidebar")
    private WebElement leftPanel;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Name')]")
    private WebElement tableHeaderName;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Category')]")
    private WebElement tableHeaderCategory;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Date')]")
    private WebElement tableHeaderDate;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Order')]")
    private WebElement tableHeaderOrder;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Status')]")
    private WebElement tableHeaderStatus;

    @FindBy(xpath = "//div[@class='xcrud-list-container']/table//th[contains(text(),'Thumb')]")
    private WebElement tableHeaderThumb;

    @FindBy(xpath = "//div[@id='content']/div[@class='panel panel-default']/div/div/div/div/div/div/a[contains(text(),'Print')]")
    private WebElement buttonPrint;

    public void logoutLink() {
        clickWebElement(logautLink);
        avoidToUse(4);
    }

    public Dashboard() {
        avoidToUse(3);
        //avoidToSecond(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(By.xpath(String.format(PANEL_LEFT_OPTION,"Hotels", "Rooms")));
        //clickWebElement(carsExpand);
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

    public Dashboard clickPrintOption() {
        clickWebElement(printClicked);
        return this;
    }

    public Dashboard clickExportIntoCsvOption() {
        clickWebElement(exportIntoCsvClicked);
        return this;
    }

    public Dashboard clickAllOption() {
        clickWebElement(allClicked);
        return this;
    }

    public Dashboard clickDescOrderFirstNameColumnOption() {
        clickWebElement(clickDescOrderFirstNameColumn);
        return this;
    }

    public Dashboard clickAscOrderFirstNameColumnOption() {
        avoidToUse(3);
        clickWebElement(clickAscOrderFirstNameColumn);
        return this;
    }

    public Dashboard clickDescOrderLastNameColumnOption() {
        avoidToUse(3);
        clickWebElement(clickDescOrderLastNameColumn);
        return this;
    }

    public Dashboard clickAscOrderLastNameColumnOption() {
        avoidToUse(3);
        clickWebElement(clickAscOrderLastNameColumn);
        return this;
    }

    public Dashboard clickDescOrderEmailColumnOption() {
        avoidToUse(3);
        clickWebElement(clickDescOrderEmailColumn);
        return this;
    }

    public Dashboard clickAscOrderEmailColumnOption() {
        avoidToUse(3);
        clickWebElement(clickAscOrderEmailColumn);
        return this;
    }

    public Dashboard clickDescOrderActiveColumnOption() {
        avoidToUse(3);
        clickWebElement(clickDescOrderActiveColumn);
        return this;
    }

    public Dashboard clickAscOrderActiveColumnOption() {
        avoidToUse(3);
        clickWebElement(clickAscOrderActiveColumn);
        return this;
    }

    public Dashboard clickDescOrderLastLoginColumnOption() {
        avoidToUse(3);
        clickWebElement(clickDescOrderLastLoginColumn);
        return this;
    }

    public Dashboard clickAscOrderLastLoginColumnOption() {
        avoidToUse(3);
        clickWebElement(clickAscOrderLastLoginColumn);
        return this;
    }

    public Dashboard clickEditOption(Boolean status) {
        if (status) {
            clickWebElement(editClicked);
        }
        return this;
    }

    public Dashboard clickDeleteOption(Boolean status) {
        if (status) {
            clickWebElement(deleteClicked);
        }
        return this;
    }

    public Dashboard clickAddOption() {
        clickWebElement(addClicked);
        return this;
    }

    public Dashboard clickNumber10Option() {
        clickWebElement(number10Clicked);
        return this;
    }

    public Dashboard clickNumber25Option() {
        clickWebElement(number25Clicked);
        return this;
    }

    public Dashboard clickNumber50Option() {
        clickWebElement(number50Clicked);
        return this;
    }

    public Dashboard clickNumber100Option() {
        clickWebElement(number100Clicked);
        return this;
    }

    public Dashboard clickSearchOption() {
        clickWebElement(searchClicked);
        return this;
    }

    public Dashboard setPhrase(String phrase) {
        fillWebElement(phraseTextField, phrase);
        return this;
    }

    public Dashboard clickGoOption() {
        clickWebElement(goClicked);
        return this;
    }

    public Dashboard clickResetOption() {
        clickWebElement(resetClicked);
        return this;
    }

    public Dashboard clickMoveDown(){
        clickWebElement(movedownClicked);
        return this;
    }

    public Dashboard clickSlidercheck(){
        clickWebElement(checkSliderClicked);
        return this;
    }

    public Dashboard clickSliderexpand(){
        clickWebElement(expandSliderClicked);
        return this;
    }

    public Dashboard clickSliderView(){
        clickWebElement(viewSliderClicked);
        return this;
    }

    public Dashboard clickreturnview(){
        clickWebElement(viewreturnClicked);
        return this;
    }

    public Dashboard clickprintSlider(){
        clickWebElement(printsliderClicked);
        return this;
    }

    public Dashboard clickorderSlider(){
        clickWebElement(ordersliderClicked);
        return this;
    }

    public Dashboard clickdropup(){
        clickWebElement(moveupClicked);
        return this;
    }

    public Dashboard clickactivate(){
        clickWebElement(activateClicked);
        return this;
    }

    public Dashboard clickactivaterecord(){
        clickWebElement(activaterecordClicked);
        return this;
    }

    public Dashboard clickactivatebutton(){
        clickWebElement(activatebuttonClicked);
        return this;
    }

    public Dashboard clickdesactivatebutton(){
        clickWebElement(desactivatebuttonClicked);
        return this;
    }

    public Dashboard clickclosepopup(){
        clickWebElement(closepopupclicked);
        return this;
    }

    public Dashboard clickbuttonClose(){
        clickWebElement(buttonCloseClicked);
        return this;
    }

    public Dashboard clickdesactivatedrop(){
        clickWebElement(desactivatedropClicked);
        return this;
    }

    public Dashboard clickOnPostsOption() {
        clickWebElement(subMenuPosts);
        return this;
    }

    public Dashboard clickdesactivaterecord(){
        clickWebElement(desactivaterecordClicked);
        return this;
    }

    public void clickOnTableHeaderName() {
        clickWebElement(tableHeaderName);
    }

    public void clickOnTableHeaderCategory() {
        avoidToUse(3);
        clickWebElement(tableHeaderCategory);
    }

    public void clickOnTableHeaderDate() {
        clickWebElement(tableHeaderDate);
    }

    public void clickOnTableHeaderOrder() {
        clickWebElement(tableHeaderOrder);
    }

    public void clickOnTableHeaderStatus() {
        clickWebElement(tableHeaderStatus);
    }

    public void clickOnTableHeaderThumb() {
        clickWebElement(tableHeaderThumb);
    }

    public Dashboard clicksave(){
        clickWebElement(saveclicked);
        return this;
    }

    public Dashboard clickPaymentGatewaysOption() {
        clickWebElement(paymentsGaytwaysClicked);
        return this;
    }

    public Dashboard clickGeneralExpand() {
        clickWebElement(generalExpand);
        return this;
    }
}