
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ChoosingExercises extends BasePage {

    ChromeOptions chromeOptions = new ChromeOptions();
    private WebDriver driver;


    public ChoosingExercises(WebDriver driver) {
        super(driver);
    }

    //First Test
    @FindBy(css = "#section_options > button:nth-child(2)")
    private WebElement stretches;

    public void clickStretches() {
        stretches.click();
    }


    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/img[6]")
    private WebElement chests;

    public void clickChestMuscle() {
        chests.click();
    }

    @FindBy(css = "#heading-leftbox > h1")
    private WebElement chestText;

    public String getChestTitle() {
        return chestText.getText();
    }

    @FindBy(id = "Exercises")
    private WebElement StretchesText;

    public String getStretchesTitle() {
        return StretchesText.getText();
    }

    // Second test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.row.content-menu:nth-child(1) div.col-xs-12.col-sm-12.col-md-9.col-lg-9:nth-child(2) div.section-buttons > button.section-button:nth-child(3)")
    private WebElement bodyWeight;
        public void ClickBodyWeight() {
            bodyWeight.click();
    }

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[2]/img[11]")
    private WebElement abdominals;

    public void ClickAbdominals() {
        abdominals.click();
    }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div:nth-child(1) div:nth-child(1) div:nth-child(1) > h1:nth-child(1)")
    private WebElement abdominalsTitle;

    public String getAbdominalsTitle() {
        return abdominalsTitle.getText();
    }

    @FindBy(id = "Exercises")
    private WebElement bodyweightTitle;

    public String getBodyweightTittle() {
        return bodyweightTitle.getText();
    }

    //Third Test
    @FindBy(xpath = "//button[contains(text(),'Barbell')]")
    private WebElement barbell;

    public void ClickBarbell() {
        barbell.click();
    }

    @FindBy(xpath = "//div[@id='muscle-map']//img[@id='biceps-a']")
    private WebElement biceps;

    public void ClickBiceps() {
        biceps.click();
    }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div:nth-child(1) div:nth-child(1) div:nth-child(1) > h1:nth-child(1)")
    private WebElement BicepsTitle;

    public String getBicepsTitle() {
        return BicepsTitle.getText();
    }

    @FindBy(css = "#Exercises")
    private WebElement BarbellTitle;

    public String getBarbellTitle() {
        return BarbellTitle.getText();
    }

    //Fourth Test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.row.content-menu:nth-child(1) div.col-xs-12.col-sm-12.col-md-9.col-lg-9:nth-child(2) div.section-buttons > button.section-button:nth-child(5)")
    private WebElement dumbbells;

    public void ClickDumbbells() {
        dumbbells.click();
    }

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[2]/img[17]")
    private WebElement traps;

    public void ClickTrapsMidBack() {
        traps.click();
    }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div:nth-child(1) div:nth-child(1) div:nth-child(1) > h1:nth-child(1)")
    private WebElement TrapsMidBackTitle;

    public String getTrapsMidBackTitle() {
        return TrapsMidBackTitle.getText();
    }

    @FindBy(css = "#Exercises")
    private WebElement DumbbellsTitle;

    public String getDumbbellsTitle() {
        return DumbbellsTitle.getText();
    }

    //Fifth Test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.row.content-menu:nth-child(1) div.col-xs-12.col-sm-12.col-md-9.col-lg-9:nth-child(2) div.section-buttons > button.section-button:nth-child(6)")
        private WebElement kettlebells;
            public void ClickKettlebels() {
                kettlebells.click();
            }
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/img[19]")
        private WebElement shoulder;
            public void shoulderss(){
                shoulder.click();
            }

       /*     public static void ClickShoulders(WebDriver ldriver, String xpath){
                Actions act = new Actions(ldriver);
                act.moveToElement(ldriver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/img[19]"))).click().build().perform();
            }*/

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div:nth-child(1) div:nth-child(1) div:nth-child(1) > h1:nth-child(1)")
        private WebElement shouldersTitle;
            public String getShouldersTitle(){
              return  shouldersTitle.getText();
            }
    @FindBy(css ="#Exercises")
        private WebElement kettlebellsTitle;
            public String getKettlebellsTitle(){
                return kettlebellsTitle.getText();
            }
//Sixth Test
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/img[31]")
        private WebElement calves;
            public void ClickCalves(){
                calves.click();
            }
    @FindBy(css= "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div:nth-child(1) div:nth-child(1) div:nth-child(1) > h1:nth-child(1)")
        private WebElement calvesTitle;
            public String getCalvesTitle(){
                return calvesTitle.getText();
            }
    @FindBy(css = "#Exercises")
        private WebElement FeaturedExercisesTitle;
            public String getFeaturedExercisesTitle(){
                return FeaturedExercisesTitle.getText();
            }
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[3]")
     private WebElement bodyWeightforCalves;
            public void ClickBodyWeightForCalves(){
                bodyWeightforCalves.click();
            }

}