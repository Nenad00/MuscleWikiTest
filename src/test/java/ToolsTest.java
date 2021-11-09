import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolsTest {

    ChromeOptions chromeOptions = new ChromeOptions();
    private  Tools tools;
    private WebDriver driver;

    @BeforeClass
    public void BeforeClass(){
    driver = new ChromeDriver(chromeOptions);
    tools = new Tools(driver);

        driver.get("https://musclewiki.com/");
    }
    @Test
    public void ClickTools(){
        tools.clickTools();

        Assert.assertEquals(tools.getCalorieCalculator(),"Calorie Calculator");
        Assert.assertEquals(tools.getMacroCalculator(), "Macro Calculator");
        Assert.assertEquals(tools.getOneRepMaxCalculator(), "One Rep Max Calculator");
        Assert.assertEquals(tools.getDirectory(), "Directory");
    }
    @AfterTest
    public void AfterTest(){
        driver.close();
        driver.quit();
    }




    }

