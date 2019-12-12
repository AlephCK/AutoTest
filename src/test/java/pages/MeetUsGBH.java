package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeetUsGBH {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/div[1]/h2")
    WebElement meetUsTitle;

    public MeetUsGBH(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public String getMeetUsTitle() {
        return meetUsTitle.getText();
    }

}
