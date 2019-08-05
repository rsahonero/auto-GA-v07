package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.manageevents.Event;
import testingui.diplomadoumss.org.managepage.BasePage;

import java.util.List;

public class SocialConnectionsManagement extends BasePage {
    @FindBy(css="a.btn.btn-success.xcrud-action")
    private WebElement Addbutton;

    @FindBy(css="input.xcrud-upload")
    private WebElement attach;

    @FindBy(css=".xcrud-remove-file")
    private WebElement attachDelete;

    @FindBy(css="input.xcrud-input[type=text]")
    private WebElement socialNameText;

    @FindBy(css="[id^='editor']")
    private WebElement socialLinkText;

    @FindBy(css="select.xcrud-input")
    private WebElement socialStatus;

    @FindBy(css="a.btn[data-after='list']")
    private WebElement saveReturnButton;

    @FindBy(css="a.btn[data-after='create']")
    private WebElement saveNewButton;

    @FindBy(css="a.btn[data-after='edit']")
    private WebElement saveEditButton;

    @FindBy(css="a.btn.btn-warning")
    private WebElement returnButton;

    @FindBy(css="tr.xcrud-row:nth-child(7) > td:nth-child(4)")
    private WebElement socialconetiontable;

    @FindBy(css=".img-thumbnail")
    private WebElement image;


    @FindBy(css="tr.xcrud-row:nth-child(1) > td:nth-child(8) > span:nth-child(1) > a:nth-child(3) > i:nth-child(1)")
    private WebElement deletedSocial;

    @FindBy(css="tr.xcrud-row:nth-child(2) > td:nth-child(8) > span:nth-child(1) > a:nth-child(2) > i")
    private WebElement editSocial;

    @FindBy(css="tbody")
    private WebElement socialTable;

    @FindBy(css="tbody tr")
    private List<WebElement> socialRowTable;


    public void clickButton(){
        Event.clickWebElement(Addbutton);
        Event.avoidToUse(2);
    }

    public void setRegisterSocialConection(String name,String link){
        Event.attachment("D://CARS//auto-GA-v07//src//test//resources//image//icon.png",attach);
        Event.avoidToUse(2);
        Event.fillWebElement(socialNameText,name);
        Event.fillWebElement(socialLinkText,link);
    }
    public void clickSaveReturn(){
        Event.clickWebElement(saveReturnButton);
    }




    public String getLastElement() {
        Event.avoidToUse(5);
        return Event.getWebElementText(socialconetiontable);

    }

    public void clickSaveNew() {
        Event.clickWebElement(saveNewButton);
        Event.avoidToUse(2);
    }

    public String getelementRegister() {
        return socialNameText.getAttribute("value");
    }

    public void clickSaveEdit() {
        Event.clickWebElement(saveEditButton);
        Event.avoidToUse(2);
    }

    public void clickReturn() {
        Event.clickWebElement(returnButton);
        Event.avoidToUse(2);
    }

    public boolean getTable() {
        return socialTable.isDisplayed();
    }

    public void AddImage() {
        Event.attachment("D://CARS//auto-GA-v07//src//test//resources//image//icon.png",attach);
        Event.avoidToUse(2);
    }

    public void clickAddimage() {
        Event.attachment("D://CARS//auto-GA-v07//src//test//resources//image//map.png",attach);
        Event.avoidToUse(2);

    }

    public String getImageSrc() {
        return image.getAttribute("src");
    }

    public void clickRemove() {
        Event.clickWebElement(attachDelete);
    }

    public boolean getIsExistImage() {
        if (image == null)
            return true;
        else
            return false;

    }

    public void clickDeletedSocial() {
        Event.clickWebElement(deletedSocial);
    }

    public boolean existNameElement(String exp) {
        return Event.existElement(socialRowTable,exp,3);
    }

    public void clickEditSocial() {
        Event.clickWebElement(editSocial);
        Event.avoidToUse(2);
    }

    public void editNameSocial(String name) {
        Event.fillWebElement(socialNameText,name);
        Event.clickWebElement(saveReturnButton);
        Event.avoidToUse(3);
    }

    public void editLinkSocial(String link) {
        Event.fillWebElement(socialLinkText,link);
        Event.clickWebElement(saveReturnButton);
        Event.avoidToUse(3);
    }

    public boolean existLinkElement(String link) {
        return Event.existElement(socialRowTable,link,4);
    }

    public void selectStatusSocial() {
        Event.selectElement(socialStatus,"No");
        Event.clickWebElement(saveReturnButton);
        Event.avoidToUse(3);
    }

    public boolean existStatusElement(String status) {
        return Event.existElement(socialRowTable,status,6);
    }
}
