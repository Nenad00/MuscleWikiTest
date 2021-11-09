import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneRepMaxTool extends BasePage{

    public OneRepMaxTool(WebDriver driver){
        super(driver);
    }
//First Test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.navbar.navbar-default.navbar-fixed-top:nth-child(1) div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown.open ul.dropdown-menu li:nth-child(3) > a:nth-child(1)")
        private WebElement oneRepMax;
            public void clickOneRepMaxTool(){
                oneRepMax.click();
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div:nth-child(12) div.container:nth-child(1) > h1:nth-child(2)")
        private WebElement oneRepMaxToolTitle;
            public String getRepMaxToolTitle(){
                return oneRepMaxToolTitle.getText();
        }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div:nth-child(12) div.container:nth-child(1) div.mw-content-ltr:nth-child(6) > p:nth-child(1)")
        private WebElement shortDescriptionForOneRepMaxTool;
            public String getShortDescriptionForOneRepMaxTool(){
                return shortDescriptionForOneRepMaxTool.getText();
            }
//Second Test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container:nth-child(1) div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row:nth-child(1) div.col-xs-8.col-sm-3.col-md-3.col-lg-3:nth-child(1) div.btn-group:nth-child(2) label.btn.active:nth-child(1) > span:nth-child(4)")
        private WebElement Lbs;
            public void clickLBS(){
                Lbs.click();
            }
    @FindBy(css = "#reps")
        private WebElement numberOfReps;
            public void setNumberOfReps(){
                numberOfReps.clear();
                numberOfReps.sendKeys("10");
            }
    @FindBy(css = "#weight")
        private WebElement weightLiftedLBS;
            public void setWeightLiftedLBS(){
                weightLiftedLBS.clear();
                weightLiftedLBS.sendKeys("155");
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container:nth-child(1) div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row:nth-child(1) div.col-xs-1.col-sm-1.col-md-1.col-lg-1:nth-child(5) > button.btn.btn-primary.btn-cntr")
        private WebElement goButton;
            public void clickGoButton(){
                goButton.click();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container:nth-child(1) div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row:nth-child(2) div.col-xs-10.col-sm-10.col-md-10.col-lg-10 > div.maxrepholder")
     private WebElement yourOneRepMaxInLBS;
            public String getYourOneRepMaxInLBS() {
                return yourOneRepMaxInLBS.getText();
            }
     @FindBy(xpath = "//body/div[@id='wiki-outer-body']/div[@id='wiki-body']/div[@id='mw-content-text']/div[@id='repscontainer']/div[3]/div[11]/div[1]/*[1]")
     private WebElement maxEffortToLiftInLBS;
            public String get95PercentEffortToLiftInLBS(){
                return maxEffortToLiftInLBS.getText();
            }
     @FindBy(xpath = "//body/div[@id='wiki-outer-body']/div[@id='wiki-body']/div[@id='mw-content-text']/div[@id='repscontainer']/div[3]/div[1]/div[1]/*[1]")
        private WebElement minimalEffortToLiftInLBS;
            public String get50PercentToLiftInLBS(){
                return minimalEffortToLiftInLBS.getText();
            }
//Third Test
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[2]/span[1]")
       private WebElement kg;
            public void clickKG(){
                kg.click();
            }
    @FindBy(css = "#weight")
      private WebElement weightLiftedKg;
            public void setWeightLiftedKg(){
                weightLiftedKg.clear();
                weightLiftedKg.sendKeys("70");
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container:nth-child(1) div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row:nth-child(2) div.col-xs-10.col-sm-10.col-md-10.col-lg-10 > div.maxrepholder")
    private WebElement oneRepMaxInKG;
            public String getOneRepMaxInKG(){
                return oneRepMaxInKG.getText();
            }
    @FindBy(xpath = "//body/div[@id='wiki-outer-body']/div[@id='wiki-body']/div[@id='mw-content-text']/div[@id='repscontainer']/div[3]/div[1]/div[1]/*[1]")
    private WebElement minEffortToLiftInKG;
            public String get50PercentEffortToLiftInKg(){
                return minEffortToLiftInKG.getText();
            }
    @FindBy(xpath = "//body/div[@id='wiki-outer-body']/div[@id='wiki-body']/div[@id='mw-content-text']/div[@id='repscontainer']/div[3]/div[11]/div[1]/*[1]")
     private WebElement maxEffortToLiftInKG;
            public String get95PercentEffortToLiftInKG(){
              return  maxEffortToLiftInKG.getText();
            }







}
