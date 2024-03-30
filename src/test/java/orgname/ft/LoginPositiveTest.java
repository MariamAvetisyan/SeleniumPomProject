package orgname.ft;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import orgname.ft.pages.LoginPage;

public class LoginPositiveTest extends BaseTest{

    @Test
    public void verifyNewUserSignup(){
        SoftAssert softAssert = new SoftAssert();
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.open();
//        loginPage.fillName("John");
//        loginPage.fillEmail("john88@gmail.com");
//        loginPage.clickOnSignUp();
//
//        softAssert.assertFalse(loginPage.isNewUserSignupTitleExist(), "New User Signup title is displayed");

        softAssert.assertAll();
    }

    @Test(groups = {"cleanCookies", "myGroup"})
    public void verifyNewUserSignup2(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true);
        softAssert.assertAll();
    }
}
