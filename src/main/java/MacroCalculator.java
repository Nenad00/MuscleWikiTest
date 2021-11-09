import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.sql.Struct;

public class MacroCalculator extends BasePage{

    public MacroCalculator(WebDriver driver){
        super(driver);
    }
//First Test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.navbar.navbar-default.navbar-fixed-top:nth-child(1) div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown.open ul.dropdown-menu li:nth-child(2) > a:nth-child(1)")
        private WebElement macroCalculator;
            public void clickMacroCalculator(){
                macroCalculator.click();
            }

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/h1[1]")
        private WebElement macroCalculatorTitle;
            public String getMacroCalculatorTitle() {
                return macroCalculatorTitle.getText();
            }
//Second Test
    @FindBy(xpath = "//a[contains(text(),'More...')]")
        private WebElement more;
            public void clickMore(){
                more.click();
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div:nth-child(2) div.container > h1:nth-child(1)")
        private WebElement macronutrients;
            public String getMacronutrientsDescription(){
                return macronutrients.getText();
            }
//Third Test
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[2]/span[1]")
        private WebElement moderate;
            public void clickModerate(){
                moderate.click();
            }

    @FindBy(css = "#calories")
        private WebElement calories;
            public void setCalories(){
                calories.clear();
                calories.sendKeys("3700");
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-5:nth-child(1) div.col-xs-8.col-xs-offset-2.col-sm-8.col-sm-offset-2.col-md-8.col-md-offset-2.col-lg-6.col-lg-offset-0.bottom-margin:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-12.bottom-margin:nth-child(2) div.input-group.bootstrap-touchspin:nth-child(2) span.input-group-btn:nth-child(5) > button.btn.btn-default.bootstrap-touchspin-up")
        private WebElement plusInMealsPerDay;
            public void clickPlusInMealsPerDay(){
                for(int i = 0; i < 2; i++){
                    plusInMealsPerDay.click();
                }
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-5:nth-child(1) div.col-xs-8.col-xs-offset-2.col-sm-8.col-sm-offset-2.col-md-8.col-md-offset-2.col-lg-6.col-lg-offset-0.bottom-margin:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-12.bottom-margin:nth-child(2) > button.btn.btn-primary.full-width:nth-child(3)")
        private WebElement calculateMacro;
            public void clickCalculateMacro(){
                calculateMacro.click();
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.neg-marg:nth-child(1) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement carbsModerate;
            public String getCarbsModerate(){
                return carbsModerate.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.pos-marg:nth-child(2) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement proteinModerate;
            public String getProteinModerate(){
                return proteinModerate.getText();
            }

            @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.pos-marg:nth-child(3) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement fatModerate;
            public String getFatModerate(){
                return fatModerate.getText();
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div:nth-child(3) div.row.top-margin div.col-xs-8.col-xs-offset-2.col-sm-12.col-sm-offset-0.col-md-12.col-md-offset-0.col-lg-7.col-lg-offset-0:nth-child(3) div.col-xs-12.col-sm-8.col-sm-offset-2.col-md-8.col-md-offset-2.col-lg-12.col-lg-offset-0.largemargin > div.infobox")
        private WebElement crabsProteinFatModerate;
            public String getCrabsProteinFatModerate(){
                return crabsProteinFatModerate.getText();
            }
//Fourth Test
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
        private WebElement highCarb;
            public void clickHighCarb(){
                highCarb.click();
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.neg-marg:nth-child(1) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement carbsHighCarb;
            public String getCarbsHighCarb(){
                return carbsHighCarb.getText();
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.pos-marg:nth-child(2) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement proteinHighCarb;
            public String getProteinHighCarb(){
                return proteinHighCarb.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.pos-marg:nth-child(3) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement fatHighCarb;
            public String getFatHighCarb(){
                return fatHighCarb.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div:nth-child(3) div.row.top-margin div.col-xs-8.col-xs-offset-2.col-sm-12.col-sm-offset-0.col-md-12.col-md-offset-0.col-lg-7.col-lg-offset-0:nth-child(3) div.col-xs-12.col-sm-8.col-sm-offset-2.col-md-8.col-md-offset-2.col-lg-12.col-lg-offset-0.largemargin > div.infobox")
        private WebElement CarbsProteinFatHighCarbs;
            public String getCarbsProteinFatHighCarbs(){
                return CarbsProteinFatHighCarbs.getText();
    }
//Fifth Test
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]")
     private WebElement zoneDiet;
            public void clickZoneDiet(){
                zoneDiet.click();
            }

     @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.neg-marg:nth-child(1) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
    private WebElement carbsZoneDiet;
            public String getCarbsZoneDiet(){
                return carbsZoneDiet.getText();
            }
     @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.pos-marg:nth-child(2) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
     private WebElement proteinZoneDiet;
            public String getProteinZoneDiet(){
                return proteinZoneDiet.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.pos-marg:nth-child(3) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement fatZoneDiet;
            public String getFatZoneDiet(){
                return fatZoneDiet.getText();
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div:nth-child(3) div.row.top-margin div.col-xs-8.col-xs-offset-2.col-sm-12.col-sm-offset-0.col-md-12.col-md-offset-0.col-lg-7.col-lg-offset-0:nth-child(3) div.col-xs-12.col-sm-8.col-sm-offset-2.col-md-8.col-md-offset-2.col-lg-12.col-lg-offset-0.largemargin > div.infobox")
        private WebElement carbsProteinFatZoneDiet;
            public String getCarbsProteinFatZoneDiet(){
                return carbsProteinFatZoneDiet.getText();
            }
//Sixth Test
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/label[2]/span[1]")
     private WebElement lowCarb;
            public void clickLowCarb(){
                lowCarb.click();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.neg-marg:nth-child(1) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement carbLowCarb;
            public String getCarbLowCarb(){
                return carbLowCarb.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.pos-marg:nth-child(2) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement proteinLowCarb;
            public String getProteinLowCarb(){
                return proteinLowCarb.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-7:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-4.bottom-margin.pos-marg:nth-child(3) div.centered.rs-control.rs-animation div.rs-container.full:nth-child(1) > span.rs-tooltip.rs-tooltip-text:nth-child(5)")
        private WebElement fatLowCarb;
            public String getFatLowCarb(){
                return fatLowCarb.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div:nth-child(3) div.row.top-margin div.col-xs-8.col-xs-offset-2.col-sm-12.col-sm-offset-0.col-md-12.col-md-offset-0.col-lg-7.col-lg-offset-0:nth-child(3) div.col-xs-12.col-sm-8.col-sm-offset-2.col-md-8.col-md-offset-2.col-lg-12.col-lg-offset-0.largemargin > div.infobox")
        private WebElement carbProteinFatLowCarb;
            public String getCarbProteinFatLowCarb(){
                return carbProteinFatLowCarb.getText();
            }
//Seventh Test
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.mw-content-ltr:nth-child(6) div.row.top-margin div.col-xs-12.col-sm-12.col-md-12.col-lg-5:nth-child(1) div.col-xs-8.col-xs-offset-2.col-sm-8.col-sm-offset-2.col-md-8.col-md-offset-2.col-lg-6.col-lg-offset-0.bottom-margin:nth-child(2) div.col-xs-12.col-sm-12.col-md-12.col-lg-12:nth-child(1) > a.btn.btn-primary.full-width:nth-child(3)")
     private WebElement findMyDailyNeeds;
            public void clickFindMyDailyNeeds(){
                findMyDailyNeeds.click();
            }

}
