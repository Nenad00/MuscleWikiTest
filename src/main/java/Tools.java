import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tools extends BasePage {

    public Tools (WebDriver driver){
        super(driver);
    }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.navbar.navbar-default.navbar-fixed-top:nth-child(1) div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown > a.dropdown-toggle")
        private WebElement tools;
            public void clickTools(){
                tools.click();
            }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.navbar.navbar-default.navbar-fixed-top:nth-child(1) div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown.open ul.dropdown-menu li:nth-child(1) > a:nth-child(1)")
        private WebElement calorieCalculator;
            public String getCalorieCalculator(){
                return calorieCalculator.getText();
            }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.navbar.navbar-default.navbar-fixed-top:nth-child(1) div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown.open ul.dropdown-menu li:nth-child(2) > a:nth-child(1)")
    private WebElement macroCalculator;
    public String getMacroCalculator(){
        return macroCalculator.getText();
    }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.navbar.navbar-default.navbar-fixed-top:nth-child(1) div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown.open ul.dropdown-menu li:nth-child(3) > a:nth-child(1)")
    private WebElement oneRepMaxCalculator;
    public String getOneRepMaxCalculator(){
        return oneRepMaxCalculator.getText();
    }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.navbar.navbar-default.navbar-fixed-top:nth-child(1) div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown.open ul.dropdown-menu li:nth-child(4) > a:nth-child(1)")
    private WebElement directory;
    public String getDirectory(){
        return directory.getText();
    }
}
