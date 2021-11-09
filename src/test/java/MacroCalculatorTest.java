import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

  public class MacroCalculatorTest {

      ChromeOptions chromeOptions = new ChromeOptions();
      private WebDriver driver;
      private Tools tools;
      private MacroCalculator macroCalculator;

      @BeforeTest
      private void BeforeTest() {
          driver = new ChromeDriver(chromeOptions);
          tools = new Tools(driver);
          macroCalculator = new MacroCalculator(driver);

          driver.get("https://musclewiki.com/");
      }
      @Test(priority = 1)
      public void MacroCalculatorSite(){
          tools.clickTools();
        macroCalculator.clickMacroCalculator();

            String expectedUrl = "https://musclewiki.com/Macro_calculator";
            String currentUrl = driver.getCurrentUrl();
            boolean correctUrl = currentUrl.contains(expectedUrl);
        Assert.assertTrue(correctUrl);
        Assert.assertEquals(macroCalculator.getMacroCalculatorTitle(), "Macro calculator");
      }
    @Test(priority = 2)
      public void MacroCalculatorDescriptionMore(){
        tools.clickTools();
        macroCalculator.clickMacroCalculator();
          macroCalculator.clickMore();

          String expectedUrl = "https://musclewiki.com/Macronutrients";
          String currentUrl = driver.getCurrentUrl();
          boolean correctedUrl = currentUrl.contains(expectedUrl);

          Assert.assertTrue(correctedUrl);
          Assert.assertEquals(macroCalculator.getMacronutrientsDescription(), "Macronutrients");
    }
    @Test(priority = 3)
      public void calculateMacronutrientsModerate(){
          tools.clickTools();
          macroCalculator.clickMacroCalculator();

            driver.manage().window().fullscreen();

          macroCalculator.clickModerate();
          macroCalculator.setCalories();
          macroCalculator.clickPlusInMealsPerDay();
          macroCalculator.clickCalculateMacro();

          Assert.assertEquals(macroCalculator.getCarbsModerate(), "Carbs\n" +
                                                                    "50%\n" +
                                                                 "Grams/day\n" +
                                                                    "463\n" +
                                                                 "Grams/meal\n" +
                                                                      "154");
          Assert.assertEquals(macroCalculator.getProteinModerate(), "Protein\n" +
                                                                      "30%\n" +
                                                                  "Grams/day\n" +
                                                                      "278\n" +
                                                                  "Grams/meal\n" +
                                                                       "93");
          Assert.assertEquals(macroCalculator.getFatModerate(),    "Fat\n" +
                                                                    "20%\n" +
                                                                 "Grams/day\n" +
                                                                    "82\n" +
                                                                "Grams/meal\n" +
                                                                    "27" );
          Assert.assertEquals(macroCalculator.getCrabsProteinFatModerate(), "Carbs:463g Protein:278g Fat:82g");
      }
      @Test(priority = 4)
      public void calculateMacronutrientsHighCarb(){
          macroCalculator.clickHighCarb();

          Assert.assertEquals(macroCalculator.getCarbsHighCarb(), "Carbs\n" +
                                                                           "60%\n" +
                                                                        "Grams/day\n" +
                                                                           "555\n" +
                                                                       "Grams/meal\n" +
                                                                           "185");
          Assert.assertEquals(macroCalculator.getProteinHighCarb(),"Protein\n" +
                                                                              "25%\n" +
                                                                           "Grams/day\n" +
                                                                              "231\n" +
                                                                           "Grams/meal\n" +
                                                                              "77");
          Assert.assertEquals(macroCalculator.getFatHighCarb(),    "Fat\n" +
                                                                            "15%\n" +
                                                                         "Grams/day\n" +
                                                                            "62\n" +
                                                                         "Grams/meal\n" +
                                                                            "21");
          Assert.assertEquals(macroCalculator.getCarbsProteinFatHighCarbs(), "Carbs:555g Protein:231g Fat:62g");
      }
    @Test(priority = 5)
    public void calculateMacronutrientsZoneDiet(){
          macroCalculator.clickZoneDiet();

          Assert.assertEquals(macroCalculator.getCarbsZoneDiet(), "Carbs\n" +
                                                                            "40%\n" +
                                                                          "Grams/day\n" +
                                                                            "370\n" +
                                                                          "Grams/meal\n" +
                                                                            "123" );
          Assert.assertEquals(macroCalculator.getProteinZoneDiet(),"Protein\n" +
                                                                             "30%\n" +
                                                                           "Grams/day\n" +
                                                                             "278\n" +
                                                                           "Grams/meal\n" +
                                                                              "93" );
          Assert.assertEquals(macroCalculator.getFatZoneDiet(),"Fat\n" +
                                                                         "30%\n" +
                                                                       "Grams/day\n" +
                                                                          "123\n" +
                                                                       "Grams/meal\n" +
                                                                          "41" );
          Assert.assertEquals(macroCalculator.getCarbsProteinFatZoneDiet(), "Carbs:370g Protein:278g Fat:123g");
    }
    @Test(priority = 6)
    public void calculateMacronutrientsZoneDietLowCarb(){
        macroCalculator.clickLowCarb();

        Assert.assertEquals(macroCalculator.getCarbLowCarb(), "Carbs\n" +
                                                                        "25%\n" +
                                                                      "Grams/day\n" +
                                                                        "231\n" +
                                                                      "Grams/meal\n" +
                                                                         "77" );
        Assert.assertEquals(macroCalculator.getProteinLowCarb(),  "Protein\n" +
                                                                           "45%\n" +
                                                                         "Grams/day\n" +
                                                                           "416\n" +
                                                                         "Grams/meal\n" +
                                                                           "139" );
        Assert.assertEquals(macroCalculator.getFatLowCarb(),   "Fat\n" +
                                                                       "30%\n" +
                                                                     "Grams/day\n" +
                                                                       "123\n" +
                                                                     "Grams/meal\n" +
                                                                       "41");
        Assert.assertEquals(macroCalculator.getCarbProteinFatLowCarb(), "Carbs:231g Protein:416g Fat:123g");
    }
    @Test(priority = 7)
    public void FindMyDailyNeedsButton(){
          macroCalculator.clickFindMyDailyNeeds();

          String expectedUrl = "https://musclewiki.com/Calorie_calculator";
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

