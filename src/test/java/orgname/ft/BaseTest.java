package orgname.ft;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import orgname.ft.objects.BrowserEnum;
import orgname.ft.setup.SeleniumWebDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }


    @BeforeMethod
    public void openBrowser() {
        System.out.println("Opening browser");
        driver = SeleniumWebDriver.getDriver(BrowserEnum.CHROME);
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("Closing browser");
    }


    @AfterSuite
    public void afterSuite() {
        System.out.println("after Suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }


    //before method for clean browser cookies groop
    @BeforeGroups(groups = {"cleanCookies"})
    public void cleanCookies() {
        System.out.println("Cleaning cookies");
    }

    @BeforeMethod(onlyForGroups = {"myGroup"})
    public void beforeMethod() {
        System.out.println("Before myGroup");
    }
}
