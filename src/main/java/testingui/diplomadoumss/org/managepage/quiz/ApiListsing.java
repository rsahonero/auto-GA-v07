package testingui.diplomadoumss.org.managepage.quiz;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.WaitMethods;
import testingui.diplomadoumss.org.managepage.BasePage;

public class ApiListsing extends BasePage {

    @FindBy(css="ul[id='tocify-header1']>li[class='tocify-item']>a")
    private WebElement apiNasa;
//   #tocify-header1 > li:nth-child(1) > a

//    @FindBy(css="#//a[contains(text(), 'NASA API Listing')]")
//

    public void clickNasa (){
        WaitMethods.waitJava(1000);
    }


}
