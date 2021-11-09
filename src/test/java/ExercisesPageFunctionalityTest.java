import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class ExercisesPageFunctionalityTest {

    ChromeOptions chromeOptions  = new ChromeOptions();
    private WebDriver driver;
    private GenderSelection genderSelection;
    private ChoosingExercises choosingExercises;
    private ExercisesPageFunctionality exercisesPageFunctionality;
    private LogoButton logoButton;


    @BeforeClass
    public void BeforeClass(){
        driver = new ChromeDriver(chromeOptions);
        exercisesPageFunctionality = new ExercisesPageFunctionality(driver);
        genderSelection = new GenderSelection(driver);
        choosingExercises = new ChoosingExercises(driver);
        logoButton = new LogoButton(driver);

        driver.get("https://musclewiki.com/");
    }
    @Test(priority = 1)
    public void muscleDescription(){
            genderSelection.clickMaleButton();
            choosingExercises.ClickCalves();
      exercisesPageFunctionality.ClickMore();

        String expectedUrl = "https://musclewiki.com/Muscle/Calves";
        String currentUrl  = driver.getCurrentUrl();
        boolean correctUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(correctUrl);

      Assert.assertEquals(exercisesPageFunctionality.getDescriptionTitle(), "Calves");
      Assert.assertEquals(exercisesPageFunctionality.getTitleOFImgCalves(), "image by Användare:Chrizz");
      Assert.assertEquals(exercisesPageFunctionality.getDescriptionOfMuscle(), "The calves are composed of two muscles, the gastrocnemius and the soleus. Both muscles are active every time the ankle joint flexes. In other words, the calves are involved every time you take a step, stand up, or jump.");
    }
    @Test(priority = 2)
    public void examplesForWorkout(){
         logoButton.backToHomePage();
            genderSelection.clickMaleButton();
            choosingExercises.ClickCalves();

      Assert.assertEquals(exercisesPageFunctionality.getNameOfTheExercise(), "Seated Calf Raises");
      Assert.assertEquals(exercisesPageFunctionality.getDifficultyOfExercise(), "Difficulty: Beginner");

      exercisesPageFunctionality.getFrontVideoOfExercise();
      exercisesPageFunctionality.getSiteVideoOfExercise();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        exercisesPageFunctionality.getStep1ForExercise();
      exercisesPageFunctionality.getStep2ForExercise();
      exercisesPageFunctionality.getStep3ForExercise();
    }
    @Test(priority = 3)
    public void clickNextPage(){
            logoButton.backToHomePage();
            genderSelection.clickMaleButton();
            choosingExercises.ClickCalves();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");

        exercisesPageFunctionality.ClickMoreFeatured();

        String expectedUrl = "https://musclewiki.com/Exercises/Male/Calves/2";
        String currentUrl = driver.getCurrentUrl();
        boolean isCorrectUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(isCorrectUrl);

    }
    @AfterClass
    public void AfterClass(){
        driver.close();
        driver.quit();
}


}
