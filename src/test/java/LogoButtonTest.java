import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogoButtonTest {

    ChromeOptions chromeOptions = new ChromeOptions();
    private WebDriver driver;
    private LogoButton logoButton;
    private ChoosingExercises choosingExercises;

    @BeforeTest
    public void BeforeTest(){

        driver = new ChromeDriver(chromeOptions);
        logoButton = new LogoButton(driver);
        choosingExercises = new ChoosingExercises(driver);

        driver.get("https://musclewiki.com/");
    }
    @Test
    public void BackToHomePage(){

        choosingExercises.ClickCalves();
        logoButton.backToHomePage();

        String expectedUrl = "https://musclewiki.com/";
        String currentUrl = driver.getCurrentUrl();
        boolean correctUrl = currentUrl.contains(expectedUrl);
    }
    @AfterTest
    public void AfterTest(){
        driver.close();
        driver.quit();
    }


}
