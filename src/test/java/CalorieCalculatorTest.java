import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalorieCalculatorTest  {

    ChromeOptions chromeOptions = new ChromeOptions();
    private CalorieCalculator calorieCalculator;
    private Tools tools;
    private WebDriver driver;


    @BeforeTest
    private void BeforeTest(){

        driver = new ChromeDriver(chromeOptions);
        calorieCalculator = new CalorieCalculator(driver);
        tools = new Tools(driver);

        driver.get("https://musclewiki.com/");
    }
    @Test(priority = 1)
    public void CalorieCalculatorSite(){
        calorieCalculator.clickTools();
        calorieCalculator.clickCalorieCalculator();

        String expectedUrl = "https://musclewiki.com/Calorie_calculator";
        String currentUrl = driver.getCurrentUrl();
        boolean correctUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(correctUrl);

        Assert.assertEquals(calorieCalculator.getCalorieCalculatorTitle(), "Calorie Calculator");
        Assert.assertEquals(calorieCalculator.getDescriptionTextForCalorieCalculator(), "The Calorie Calculator can be used to estimate the calories you need to consume each day. This calculator can also provide some simple guidelines if you want to gain or lose weight.");

    }
    @Test(priority = 2)
    public void HarrisBenedict(){
        calorieCalculator.ClickHarrisBenedict();

        String expectedUrl = "https://musclewiki.com/Harris%E2%80%93Benedict_equation";
        String currentUrl = driver.getCurrentUrl();
        boolean correctUrl = currentUrl.contains(expectedUrl);

        Assert.assertTrue(correctUrl);
        Assert.assertEquals(calorieCalculator.getDescriptionForHarrisBenedictCalculation(), "The Harris–Benedict equation (also called the Harris-Benedict principle) is a method used to estimate an individual's basal metabolic rate (BMR) and daily kilocalorie requirements. The estimated BMR value is multiplied by a number that corresponds to the individual's activity level. The resulting number is the recommended daily kilocalorie intake to maintain current body weight.");
    }
    @Test(priority = 3)
    public void ImperialButton(){
            calorieCalculator.clickTools();
            calorieCalculator.clickCalorieCalculator();

       calorieCalculator.clickImperial();
       Assert.assertEquals(calorieCalculator.getLBS(), "Weight\n" +
                                                                  "\n" +
                                                                 "LBS");
       Assert.assertEquals(calorieCalculator.getfoot(), "Height\n" +
                                                            ""+"'" + " " +"\"");
    }
    @Test(priority = 4)
    public void MetricButton(){
        calorieCalculator.clickMetric();

        Assert.assertEquals(calorieCalculator.getKG(), "Weight\n" +
                                                                  "\n" +
                                                                   "KG");
        Assert.assertEquals(calorieCalculator.getCM(), "Height\n"+
                                                                  "\n" +
                                                                   "CM");
    }
    @Test(priority = 5)
    public void CalculatingCaloriesForMale(){
            calorieCalculator.clickTools();
            calorieCalculator.clickCalorieCalculator();
            calorieCalculator.clickMetric();
            calorieCalculator.clickMale();
            calorieCalculator.setAge();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        calorieCalculator.setWeightInKG();
        calorieCalculator.setHeightInCM();
        calorieCalculator.clickRegularityOfExercise();
        calorieCalculator.clickModerateExercise();
        calorieCalculator.clickWeightVariation();
        calorieCalculator.clickGain025KgPerWeek();
        calorieCalculator.clickCalculateButton();

        Assert.assertEquals(calorieCalculator.getConsume(), "You would have to consume : 3699 calories");

    }

  /*  @Test(priority = 6) // Cannot set Weight and Height correctly
    public void CalculatingCalorieForFemale() throws InterruptedException {
        calorieCalculator.clickTools();
        calorieCalculator.clickCalorieCalculator();
        calorieCalculator.clickImperial();
        calorieCalculator.clickFemaleInCalorieCalculator();


        calorieCalculator.setAge();

        calorieCalculator.setWeightInLBS();


        calorieCalculator.setHeightInFoot();
        calorieCalculator.setHeightInFoot2();

        calorieCalculator.clickRegularityOfExercise();
        calorieCalculator.clickModerateExercise();
        calorieCalculator.clickWeightVariation();
        calorieCalculator.clickGain025KgPerWeek();
        calorieCalculator.clickCalculateButton();

        Assert.assertEquals(calorieCalculator.HowMuchFemaleTooConsumeCalories(), "You would have to consume : 2635 calories\n");

    }*/



 @AfterTest
   public void AfterTest(){
        driver.close();
        driver.quit();
 }


}
