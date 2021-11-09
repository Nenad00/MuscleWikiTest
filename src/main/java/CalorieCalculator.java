import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalorieCalculator extends BasePage {

    public CalorieCalculator(WebDriver driver){
        super(driver);
    }

//First Test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.navbar.navbar-default.navbar-fixed-top:nth-child(1) div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown > a.dropdown-toggle")
        private WebElement tools;
            public void clickTools(){
                tools.click();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.navbar.navbar-default.navbar-fixed-top:nth-child(1) div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown.open ul.dropdown-menu li:nth-child(1) > a:nth-child(1)")
        private WebElement calorieCalculator;
            public void clickCalorieCalculator(){
                calorieCalculator.click();
            }
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/h1[1]")
        private WebElement calorieCalculatorTitle;
            public String getCalorieCalculatorTitle(){
                return calorieCalculatorTitle.getText();
            }
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/p[1]")
        private WebElement descriptionTextForCalorieCalculator;
            public String getDescriptionTextForCalorieCalculator(){
                return descriptionTextForCalorieCalculator.getText();
            }
//Second Test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) p:nth-child(2) > a:nth-child(1)")
        private WebElement harrisBenedict;
            public void ClickHarrisBenedict(){
                harrisBenedict.click();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div:nth-child(2) div.container div.body:nth-child(3) div.mw-content-ltr > p:nth-child(1)")
        private WebElement descriptionForHarrisBenedictCalculation;
            public String getDescriptionForHarrisBenedictCalculation(){
                return descriptionForHarrisBenedictCalculation.getText();
            }
//Third Test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row.top-margin:nth-child(1) div.col-xs-8.col-sm-8.col-md-8.col-lg-3.col-center:nth-child(1) div.row:nth-child(1) div.col-xs-12.col-sm-12.col-md-12.col-lg-12.col-center-text div.btn-group label.btn.active:nth-child(1) > span:nth-child(4)")
        private WebElement imperial;
            public void  clickImperial(){
                imperial.click();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row.top-margin:nth-child(1) div.col-xs-12.col-sm-12.col-md-12.col-lg-3.bottom-margin:nth-child(3) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement LBS;
            public String getLBS(){
               return LBS.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row.top-margin:nth-child(1) div.col-xs-12.col-sm-12.col-md-12.col-lg-3.bottom-margin:nth-child(4) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement foot;
            public String getfoot(){
                return foot.getText();
            }
//Fourth Test
    @FindBy(xpath = "//span[contains(text(),'Metric')]")
        private WebElement metric;
            public void clickMetric(){
                metric.click();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row.top-margin:nth-child(1) div.col-xs-12.col-sm-12.col-md-12.col-lg-3.bottom-margin:nth-child(3) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement KG;
            public String getKG(){
                return KG.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row.top-margin:nth-child(1) div.col-xs-12.col-sm-12.col-md-12.col-lg-3.bottom-margin:nth-child(4) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement CM;
            public String getCM(){
                return CM.getText();
            }
//Fifth Test

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]")
      private WebElement male;
            public void clickMale(){
                male.click();
            }
    @FindBy(css = "#ageinput")
     private WebElement age;
            public void setAge(){
                age.clear();
                age.sendKeys("21");
            }
     @FindBy(css = "#weightinput")
        private WebElement weight;
            public void setWeightInKG(){
                weight.clear();
                weight.sendKeys("97");
            }
     @FindBy(css = "#heightmetricinput")
      private WebElement height;
            public void setHeightInCM(){
                height.clear();
                height.sendKeys("196");
            }
      @FindBy(css = "#activity_level")
        private WebElement regularityOfExercise;
            public void clickRegularityOfExercise(){
                regularityOfExercise.click();
            }

        @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row:nth-child(3) div.col-xs-12.col-sm-6.col-md-6.col-lg-6:nth-child(1) select.form-control > option:nth-child(3)")
            private WebElement moderate;
                public void clickModerateExercise(){
                    moderate.click();
                }

      @FindBy(css = "#gain_loss_amount")
        private WebElement weightVariation;
                public void clickWeightVariation(){
                    weightVariation.click();
                }

      @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row:nth-child(3) div.col-xs-12.col-sm-6.col-md-6.col-lg-6:nth-child(2) select.form-control > option:nth-child(6)")
        private WebElement gain025KgPerWeek;
                public void clickGain025KgPerWeek(){
                    gain025KgPerWeek.click();
                }

      @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row:nth-child(4) div.col-xs-12.col-sm-4.col-md-4.col-lg-4.center-text.pull-right:nth-child(1) > button.btnholder")
        private WebElement calculateButton;
                public void clickCalculateButton(){
                    calculateButton.click();
                }

      @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row:nth-child(4) div.col-xs-12.col-sm-8.col-md-8.col-lg-8:nth-child(2) > div.maxrepholder")
        private WebElement consume;
                public String getConsume(){
                    return consume.getText();
                }
//Sixth Test
      @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[2]/span[1]")
        private WebElement femaleButton;
                public void clickFemaleInCalorieCalculator(){
                    femaleButton.click();
                }
      @FindBy(css = "#weightinput")
        private WebElement weightLbs;
                public void setWeightInLBS() throws InterruptedException {
                    weightLbs.clear();
                    weightLbs.clear();
                    weightLbs.sendKeys("20");
                }

      @FindBy(xpath = "//input[@id='heightfeetinput']")
        private WebElement heightInFoot;
                public void setHeightInFoot(){
                    heightInFoot.clear();
                    heightInFoot.sendKeys("1");
                }

      @FindBy(xpath = "//input[@id='heightinchesinput']")
        private WebElement heightInFoot2;
                public void setHeightInFoot2() {
                    heightInFoot2.clear();
                    heightInFoot2.sendKeys("2");
                }
      @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr:nth-child(6) div.container:nth-child(4) div.row:nth-child(4) div.col-xs-12.col-sm-8.col-md-8.col-lg-8:nth-child(2) > div.maxrepholder")
        private WebElement toConsume;
                public String HowMuchFemaleTooConsumeCalories(){
                    return toConsume.getText();
                }


}
