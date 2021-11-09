import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GenderSelection extends BasePage {

    public GenderSelection(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "sexchoosermalelabel")
    private WebElement maleButton;

    public void clickMaleButton(){
        maleButton.click();
    }

    @FindBy(id = "sexchooserfemalelabel")
    private WebElement femaleButton;

    public void clickFemaleButton(){
        femaleButton.click();
    }

    @FindBy(id = "background")
    private WebElement maleBackground;

    public boolean displayMaleBackground(){
       return maleBackground.isDisplayed();

    }

    @FindBy(id = "background-female")
    private WebElement femaleBackground;

    public boolean isDisplayedFemaleBackground(){
         return femaleButton.isDisplayed();
    }

    @FindBy(id = "logobutton")
    private  WebElement logoButton;

    public void clickLogoButton(){
        logoButton.click();
    }

}
