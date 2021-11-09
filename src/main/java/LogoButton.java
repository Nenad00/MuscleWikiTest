import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoButton extends BasePage{

    public LogoButton(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#logobutton")
        private WebElement logoButton;
           public void backToHomePage(){
               logoButton.click();
           }


}
