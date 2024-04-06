package orgname.ft.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import orgname.ft.objects.BrowserEnum;

public class SeleniumWebDriver {
    private static final ThreadLocal<WebDriver> driverThread = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driverThread.get();
    }

    public static void setDriver(BrowserEnum browser) {
        switch (browser) {
            case CHROME -> {
                WebDriverManager.chromedriver().setup();
                driverThread.set(new ChromeDriver());
            }
            case FIREFOX -> {
                WebDriverManager.firefoxdriver().setup();
                driverThread.set(new FirefoxDriver());
            }
            case EDGE -> {
                WebDriverManager.edgedriver().setup();
                driverThread.set(new EdgeDriver());
            }
        }
    }

    public static void quitDriver() {
        getDriver().quit();
        driverThread.remove();
    }
}
