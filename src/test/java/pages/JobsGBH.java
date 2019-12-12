package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsGBH {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div[1]/h2")
    WebElement jobsTitle;

    public JobsGBH(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public String getJobsTitle() {
        return jobsTitle.getText();
    }


}
