import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DirectoryTest {

    ChromeOptions chromeOptions = new ChromeOptions();
    private WebDriver driver;
    private Directory directory;
    private Tools tools;

    @BeforeTest
    public void BeforeTest(){

        driver = new ChromeDriver(chromeOptions);
        directory = new Directory(driver);
        tools = new Tools(driver);

       driver.get("https://musclewiki.com/");
    }
    @Test(priority = 1)
    public void DirectoryPage(){
        tools.clickTools();
        directory.clickDirectory();

        String expectedUrl = "https://musclewiki.com/Directory";
        String currentUrl = driver.getCurrentUrl();
        boolean correctUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(correctUrl);

        directory.clickFemaleVideoForChinUp();

        String expectedChinUpUrl = "https://musclewiki.com/Bodyweight/Female/Biceps#Chin-Ups";
        String currentChinUpUrl = driver.getCurrentUrl();
        boolean correctChinUpUrl = currentChinUpUrl.contains(expectedChinUpUrl);
        Assert.assertTrue(correctChinUpUrl);
    }
    @Test(priority = 2)
    public void ChooseSquadExercise(){
        tools.clickTools();
        directory.clickDirectory();
        directory.clickSquad();

        String expectedUrl = "https://musclewiki.com/Exercises/Male/Quads#Squat";
        String currentUrl = driver.getCurrentUrl();
        boolean correctUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(correctUrl);
    }
    @AfterTest
    public void AfterTest(){
        driver.close();
        driver.quit();
    }


}
