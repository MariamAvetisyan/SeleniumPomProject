package orgname.ft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static orgname.ft.setup.Configurations.LOGIN_URL;
import static orgname.ft.setup.SeleniumWebDriver.getDriver;

public class LoginPage extends BasePage {
    //locators
    //methods

    private final By SIGNUP_NAME_INPUT = By.cssSelector("input[data-qa=signup-name]");
    private final By SIGNUP_EMAIL_INPUT = By.cssSelector("input[data-qa=signup-email]");
    private final By SIGNUP_BUTTON = By.cssSelector("button[data-qa=signup-button]");

    private final By NEW_USER_SIGNUP_TITLE = By.xpath("//*[text()='New User Signup!']");

    public LoginPage() {
        super(getDriver());
    }

    public void open() {
        open(LOGIN_URL);
    }

    public void fillName(String name) {
        fillTextField(SIGNUP_NAME_INPUT, name);
    }

    public void fillEmail(String email) {
        fillTextField(SIGNUP_EMAIL_INPUT, email);
    }

    public void clickOnSignUp() {
        clickElement(SIGNUP_BUTTON);
    }

    public boolean isNewUserSignupTitleExist() {
        return isElementAvailable(NEW_USER_SIGNUP_TITLE);
    }
}
