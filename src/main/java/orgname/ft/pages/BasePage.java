package orgname.ft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void open(String url) {
        driver.get(url);
    }

    protected WebElement getElement(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(driver1 -> driver.findElement(locator));
    }

    protected void fillTextField(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    protected void clickElement(By locator) {
        getElement(locator).click();
    }

    protected boolean isElementDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    protected boolean isElementAvailable(By locator) {
        return !driver.findElements(locator).isEmpty();
    }
}
