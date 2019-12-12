package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogGBH {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/h1")
    WebElement blogTitle;

    public BlogGBH(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public String getBlogTitle() {
        return blogTitle.getText();
    }

}
