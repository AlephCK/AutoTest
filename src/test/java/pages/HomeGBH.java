package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeGBH {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[1]/h2")
    WebElement titleText;

    @FindBy(xpath = "/html/body/header/div[1]/nav/ul[2]/li[1]")
    WebElement menItemHome;

    @FindBy(xpath = "/html/body/header/div[1]/nav/ul[2]/li[2]")
    WebElement menItemService;

    @FindBy(xpath = "/html/body/header/div[1]/nav/ul[2]/li[2]/ul/li[2]/ul/li[3]")
    WebElement subMenItemSupport3;

    @FindBy(xpath = "/html/body/header/div[1]/nav/ul[2]/li[3]")
    WebElement menItemPortfolio;

    @FindBy(xpath = "/html/body/header/div[1]/nav/ul[2]/li[4]")
    WebElement menItemMeetUs;

    @FindBy(xpath = "/html/body/header/div[1]/nav/ul[2]/li[5]")
    WebElement menItemJobs;

    @FindBy(xpath = "/html/body/header/div[1]/nav/ul[2]/li[6]")
    WebElement menItemBlog;

    public HomeGBH(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickHome() {
        menItemHome.click();
    }

    public void clickSubMenuItemSupport3() {
        menItemService.click();
        subMenItemSupport3.click();
    }

    public void clickPortfolio() {
        menItemPortfolio.click();
    }

    public void clickMeetUs() {

        menItemMeetUs.click();
    }

    public void clickJobs() {

        menItemJobs.click();
    }

    public void clickBlog() {

        menItemBlog.click();
    }

    public String getTitle() {
        return titleText.getText();
    }

    public void accessToHome() {
        this.clickHome();
    }

    public void accessToSubMenuItemSupport3() {
        this.clickSubMenuItemSupport3();
    }

    public void accessToPortfolio() {
        this.clickPortfolio();
    }

    public void accessToMeetUs(){
        this.clickMeetUs();
    }

    public void accessToJobs(){
        this.clickJobs();
    }

    public void accessToBlog(){
        this.clickBlog();
    }

}
