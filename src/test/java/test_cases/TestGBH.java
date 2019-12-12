package test_cases;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class TestGBH {
    String driverPath = ".\\Drivers\\chromedriver.exe";
    WebDriver driver;
    HomeGBH objHome;
    PortfolioGBH objPortfolio;
    MeetUsGBH objMeetUs;
    JobsGBH objJobs;
    BlogGBH objBlog;
    ServiceGBH objService;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://gbh.com.do/");
    }

    @Test(priority = 0)
    public void test_Website_Appear_Correct() {
        objHome = new HomeGBH(driver);
        String homePageTitle = objHome.getTitle();
        Assert.assertTrue(homePageTitle.toUpperCase().contains("LO MÁS RECIENTE DE NUESTRO BLOG"));
    }

    @Test(priority = 1)
    public void test_Portfolio_Appear_Correct() {

        objHome.clickPortfolio();
        objPortfolio = new PortfolioGBH(driver);

        Assert.assertTrue(objPortfolio.getPortfolioTitle().toUpperCase().contains("NUESTRO PORTAFOLIO"));
    }

    @Test(priority = 2)
    public void test_MeetUs_Appear_Correct() {

        objHome.clickMeetUs();
        objMeetUs = new MeetUsGBH(driver);

        Assert.assertTrue(objMeetUs.getMeetUsTitle().contains("El tiempo en la web es limitado. No desespere, aquí está nuestra empresa en 30 segundos."));
    }

    @Test(priority = 3)
    public void test_Jobs_Appear_Correct() {

        objHome.clickJobs();
        objJobs = new JobsGBH(driver);

        Assert.assertTrue(objJobs.getJobsTitle().contains("Posiciones disponibles"));
    }

    @Test(priority = 4)
    public void test_Blog_Appear_Correct() {

        objHome.clickBlog();
        objBlog = new BlogGBH(driver);

        Assert.assertTrue(objBlog.getBlogTitle().contains("NOTICIAS DE TECNOLOGÍA"));
    }

    @Test(priority = 5)
    public void test_Home_Appear_Correct() {

        objHome.clickHome();
        objHome = new HomeGBH(driver);

        Assert.assertTrue(objHome.getTitle().contains("LO MÁS RECIENTE DE NUESTRO BLOG"));
    }

    @Test(priority = 6)
    public void test_SubItemService_Appear_Correct() {

        objHome.clickSubMenuItemSupport3();
        objService = new ServiceGBH(driver);

        Assert.assertTrue(objService.getServiceTitle().contains("CONFIGURACIÓN DE RESPALDO"));
    }

    @AfterTest
    public void close() {
        driver.close();
    }

}
