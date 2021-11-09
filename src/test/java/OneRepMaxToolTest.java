import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OneRepMaxToolTest {

    ChromeOptions chromeOptions = new ChromeOptions();
    private WebDriver driver;
    private OneRepMaxTool oneRepMaxTool;
    private Tools tools;

    @BeforeTest
    public void BeforeTest(){

        driver = new ChromeDriver(chromeOptions);
        tools = new Tools(driver);
        oneRepMaxTool = new OneRepMaxTool(driver);

        driver.get("https://musclewiki.com/");
    }
    @Test(priority = 1)
    public void OneRepMaxToolSite(){
            tools.clickTools();
            oneRepMaxTool.clickOneRepMaxTool();

            String expectedUrl = "https://musclewiki.com/One_rep_max_tool";
            String currentUrl = driver.getCurrentUrl();
            boolean correctUrl = currentUrl.contains(expectedUrl);

        Assert.assertEquals(oneRepMaxTool.getRepMaxToolTitle(), "One rep max tool");
        Assert.assertEquals(oneRepMaxTool.getShortDescriptionForOneRepMaxTool(), "Just do a set to failure on any exercise, then enter in how much weight you did and how many reps you finished into the form below.");
    }
    @Test(priority = 2)
    public void getYourOneRepMaxInLBS(){
        oneRepMaxTool.clickLBS();
        oneRepMaxTool.setNumberOfReps();
        oneRepMaxTool.setWeightLiftedLBS();
        oneRepMaxTool.clickGoButton();

        Assert.assertEquals(oneRepMaxTool.getYourOneRepMaxInLBS(), "Your one-rep max is: 207 LBS");

        Assert.assertEquals(oneRepMaxTool.get95PercentEffortToLiftInLBS(), "197\n" +
                                                                       "LBS\n" +
                                                                       "95%");

        Assert.assertEquals(oneRepMaxTool.get50PercentToLiftInLBS(), "104\n" +
                                                                        "LBS\n" +
                                                                        "50%");
    }
    @Test(priority = 3)
    public void getYourOneRepMaxInKG(){
        oneRepMaxTool.clickKG();
        oneRepMaxTool.setNumberOfReps();
        oneRepMaxTool.setWeightLiftedKg();
        oneRepMaxTool.clickGoButton();

        Assert.assertEquals(oneRepMaxTool.getOneRepMaxInKG(), "Your one-rep max is: 93 KG");

        Assert.assertEquals(oneRepMaxTool.get50PercentEffortToLiftInKg(), "47\n" +
                                                                                  "KG\n" +
                                                                                  "50%");

        Assert.assertEquals(oneRepMaxTool.get95PercentEffortToLiftInKG(),"88\n" +
                                                                                 "KG\n" +
                                                                                 "95%");
    }



}
