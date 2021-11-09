import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class ChoosingExercisesTest {

    ChromeOptions chromeOptions = new ChromeOptions();
    private GenderSelection genderSelection;
    private WebDriver driver;
    private ChoosingExercises choosingExercises;
    private LogoButton logoButton;



    @BeforeClass
    public void BeforeClass(){
        driver = new ChromeDriver(chromeOptions);
        genderSelection = new GenderSelection(driver);
        choosingExercises = new ChoosingExercises(driver);
        logoButton = new LogoButton(driver);

        driver.get("https://musclewiki.com/");
    }


    @Test(priority = 1)
    public void chooseStretchForChests(){
            genderSelection.clickMaleButton();
        choosingExercises.clickStretches();
        choosingExercises.clickChestMuscle();

        String expectedUrl = "https://musclewiki.com/Stretches/Male/Chest";
        String currentUrl = driver.getCurrentUrl();
        boolean correctUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(correctUrl);

        Assert.assertEquals(choosingExercises.getChestTitle(), "Chest");
        Assert.assertEquals(choosingExercises.getStretchesTitle(), "Stretches");
    }
    @Test(priority = 2)
    public void chooseBodyweightForAbdominals(){
        logoButton.backToHomePage();
        genderSelection.clickFemaleButton();
    choosingExercises.ClickBodyWeight();
    choosingExercises.ClickAbdominals();

    String expectedUrl = "https://musclewiki.com/Bodyweight/Female/Abdominals";
    String currentUrl = driver.getCurrentUrl();
    boolean correctUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(correctUrl);

    Assert.assertEquals(choosingExercises.getAbdominalsTitle(),"Abdominals");
    Assert.assertEquals(choosingExercises.getBodyweightTittle(), "Bodyweight");
    }
    @Test(priority = 3)
    public void chooseBarbellForBiceps(){
          logoButton.backToHomePage();
            genderSelection.clickMaleButton();
      choosingExercises.ClickBarbell();
      choosingExercises.ClickBiceps();

      String expectedUrl = "https://musclewiki.com/Barbell/Male/Biceps";
      String currentUrl = driver.getCurrentUrl();
      boolean correctUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(correctUrl);

      Assert.assertEquals(choosingExercises.getBicepsTitle(), "Biceps");
      Assert.assertEquals(choosingExercises.getBarbellTitle(), "Barbell");
    }
    @Test(priority = 4)
    public void chooseDumbbellsForTrapsMidBack(){
        logoButton.backToHomePage();
        genderSelection.clickFemaleButton();
    choosingExercises.ClickDumbbells();
    choosingExercises.ClickTrapsMidBack();

    String expectedUrl = "https://musclewiki.com/Dumbbells/Female/Traps_middle";
    String currentUrl = driver.getCurrentUrl();
    boolean correctUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(correctUrl);

    Assert.assertEquals(choosingExercises.getTrapsMidBackTitle(), "Traps (mid-back)");
    Assert.assertEquals(choosingExercises.getDumbbellsTitle(),"Dumbbells");
    }
    @Test(priority = 5)
    public void chooseKettlebellsForShoulders(){
            logoButton.backToHomePage();
            genderSelection.clickMaleButton();

      choosingExercises.ClickKettlebels();
      choosingExercises.shoulderss();

      String expectedUrl = "https://musclewiki.com/Kettlebells/Male/Shoulders";
      String currentUrl = driver.getCurrentUrl();
      boolean correctUrl = currentUrl.contains(expectedUrl);
      Assert.assertTrue(correctUrl);

      Assert.assertEquals(choosingExercises.getShouldersTitle(), "Shoulders");
      Assert.assertEquals(choosingExercises.getKettlebellsTitle(), "Kettlebells");

    }
    @Test(priority = 6)
    public void featuredExercisesForCalves(){
            logoButton.backToHomePage();
            choosingExercises.ClickKettlebels();
            genderSelection.clickMaleButton();
        choosingExercises.ClickCalves();
        Assert.assertEquals(choosingExercises.getCalvesTitle(), "Calves");
        Assert.assertEquals(choosingExercises.getFeaturedExercisesTitle(), "Featured Exercises");

        String expectedUrl = "https://musclewiki.com/Exercises/Male/Calves";
        String currentUrl  = driver.getCurrentUrl();
        boolean correctUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(correctUrl);

        choosingExercises.ClickBodyWeightForCalves();

        String expected1Url = "https://musclewiki.com/Bodyweight/Male/Calves";
        String current1Url  = driver.getCurrentUrl();
        boolean correct1Url = current1Url.contains(expected1Url);
        Assert.assertTrue(correct1Url);

        Assert.assertEquals(choosingExercises.getCalvesTitle(), "Calves");
        Assert.assertEquals(choosingExercises.getBodyweightTittle(), "Bodyweight");
    }

    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
   }




}
