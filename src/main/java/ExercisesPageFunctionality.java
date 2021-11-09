import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class ExercisesPageFunctionality extends BasePage{

    ChromeOptions chromeOptions = new ChromeOptions();
    private WebDriver driver;

    public ExercisesPageFunctionality(WebDriver driver){
        super(driver);
    }

//First Test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div:nth-child(1) p:nth-child(3) > a:nth-child(1)")
        private WebElement more;
            public void ClickMore() {
                more.click();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div:nth-child(2) div.container:nth-child(1) div.body div:nth-child(1) > h1:nth-child(1)")
        private WebElement descriptionTitle;
            public String getDescriptionTitle(){
                return descriptionTitle.getText();
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container:nth-child(1) div.body div.mw-content-ltr:nth-child(5) div.thumb.tright:nth-child(1) div.thumbinner div.thumbcaption a.external.text > i:nth-child(1)")
        private WebElement TitleOfImgCalves;
            public String getTitleOFImgCalves(){
                return TitleOfImgCalves.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container:nth-child(1) div.body div:nth-child(1) div.mw-content-ltr:nth-child(5) > p:nth-child(5)")
     private WebElement descriptionOfMuscle;
            public String getDescriptionOfMuscle(){
                return descriptionOfMuscle.getText();
            }
//Second Test
    @FindBy(css = "#Seated-Calf-Raises")
     private WebElement nameOfExercise;
            public String getNameOfTheExercise(){
                   return nameOfExercise.getText();
            }
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/p[2]")
     private WebElement difficultyOfExercise;
            public String getDifficultyOfExercise(){
               return difficultyOfExercise.getText();
            }



    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/p[3]/a[1]/img[1]")
     private WebElement frontVideoOfExercise;
            public Object getFrontVideoOfExercise(){
                frontVideoOfExercise.isDisplayed();
                return null;
            }
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/p[3]/a[2]/img[1]")
        private WebElement siteVideoOfExercise;
            public void getSiteVideoOfExercise(){
                siteVideoOfExercise.isDisplayed();
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div:nth-child(1) ol.steps-list:nth-child(8) > li:nth-child(1)")
        private WebElement step1ForExercise;
            public void getStep1ForExercise(){
                step1ForExercise.isDisplayed();

            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div:nth-child(1) ol.steps-list:nth-child(8) > li:nth-child(2)")
        private WebElement step2ForExercise;
            public void getStep2ForExercise(){
                step2ForExercise.isDisplayed();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div:nth-child(1) ol.steps-list:nth-child(8) > li:nth-child(3)")
        private WebElement step3ForExercise;
            public void getStep3ForExercise(){
                step3ForExercise.isDisplayed();
            }
//Third Test
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/p[1]/button[1]")
        private WebElement moreFeatured;
            public WebElement ClickMoreFeatured(){
                moreFeatured.click();
                return null;
            }

}
