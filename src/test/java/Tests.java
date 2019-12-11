import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;

public class Tests {
  private WebDriver driver;
  private WebElement pagHome, mService, pagPortfolio, pagMeet, pagJob, pagBlog, consultWeb;
  private Boolean bodyPresence;
  private Boolean elementDisplayed = true;

  String homeGBH = "https://gbh.com.do/";

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homeGBH);
    }

    @Test (priority = 0)
    public void pagHome(){
        pagHome =driver.findElement(By.id("menu-item-21"));
        pagHome.click();
        bodyPresence = driver.findElement(By.id("servicios")).isDisplayed();
        Assert.assertEquals(bodyPresence, elementDisplayed);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test (priority = 1)
    public void mService(){
        mService =driver.findElement(By.id("menu-item-209"));
        consultWeb = driver.findElement(By.id("menu-item-1998"));

        Actions action = new Actions(driver);
        action.moveToElement(mService).perform();
        action.moveToElement(consultWeb).click().perform();

        bodyPresence = driver.findElement(By.id("contact-service")).isDisplayed();
        Assert.assertEquals(bodyPresence, elementDisplayed);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test (priority = 2)
     public void pagPortfolio(){
         pagPortfolio =driver.findElement(By.id("menu-item-62"));
         pagPortfolio.click();
        bodyPresence = driver.findElement(By.className("content")).isDisplayed();
        Assert.assertEquals(bodyPresence, elementDisplayed);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

    @Test (priority = 3)
    public void pagMeet(){
        pagMeet =driver.findElement(By.id("menu-item-65"));
        pagMeet.click();
        bodyPresence = driver.findElement(By.id("affix-dock")).isDisplayed();
        Assert.assertEquals(bodyPresence, elementDisplayed);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test (priority = 4)
    public void pagJob(){
        pagJob =driver.findElement(By.id("menu-item-126"));
        pagJob.click();
        bodyPresence = driver.findElement(By.className("our-team")).isDisplayed();
        Assert.assertEquals(bodyPresence, elementDisplayed);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test (priority = 5)
    public void pagBlog(){
        pagBlog =driver.findElement(By.id("menu-item-20"));
        pagBlog.click();
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(expectedUrl, homeGBH);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

        @AfterClass
    public void tearDown(){
        driver.quit();
        }





}

