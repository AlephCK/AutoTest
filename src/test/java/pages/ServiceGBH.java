package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceGBH {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[1]/div/h1")
    WebElement serviceTitle;

    public ServiceGBH(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public String getServiceTitle() {
        return serviceTitle.getText();
    }
}
