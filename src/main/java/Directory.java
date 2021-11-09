import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Directory extends BasePage {

    public Directory (WebDriver driver){
        super(driver);
    }

    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.navbar.navbar-default.navbar-fixed-top:nth-child(1) div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.dropdown.open ul.dropdown-menu li:nth-child(4) > a:nth-child(1)")
     private WebElement directory;
        public void clickDirectory(){
            directory.click();
        }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr table.wikitable:nth-child(3) tbody:nth-child(1) tr:nth-child(15) td:nth-child(2) > a.external.text:nth-child(2)")
        private WebElement femaleVideoForChinUp;
         public void clickFemaleVideoForChinUp(){
             femaleVideoForChinUp.click();
         }
    @FindBy(css = "body.mediawiki.ltr.sitedir-ltr.ns-0.ns-subject.page-Main_Page.skin-bootstrap-mediawiki.action-view:nth-child(2) div.container div.body div.mw-content-ltr table.wikitable:nth-child(7) tbody:nth-child(1) tr:nth-child(2) td.clickablecell:nth-child(1) > a.external.text")
        private WebElement squad;
         public void clickSquad(){
             squad.click();
         }




}
