import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GenderSelectionTest {

    ChromeOptions chromeOptions = new ChromeOptions();
    private GenderSelection genderSelection;
    private WebDriver driver;

    @BeforeClass
    public void BeforeClass(){

        driver = new ChromeDriver(chromeOptions);
        genderSelection = new GenderSelection(driver);

        driver.get("https://musclewiki.com/");
       driver.manage().window().fullscreen();
    }
    @Test
    public void clickMaleButton() {
        genderSelection.clickMaleButton();
        Assert.assertTrue(genderSelection.displayMaleBackground());
    }

    @Test
    public void clickFemaleButton() {
        genderSelection.clickFemaleButton();
        Assert.assertTrue(genderSelection.isDisplayedFemaleBackground());
    }
    @AfterClass
    public void afterClass(){
        driver.close();
        driver.quit();
    }
}
