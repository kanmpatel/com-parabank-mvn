package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.IndexPage;
import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    IndexPage indexPage = new IndexPage();
    RegisterPage registerPage = new RegisterPage();
    @Test
    public void verifyThatSigningUpPageDisplay(){
        indexPage.clickOnRegisterLink();
        String expectedRegisterText = "Signing up is easy!";
        String actualRegisterText = indexPage.getVerifyRegisterText();
        Assert.assertEquals(expectedRegisterText,actualRegisterText);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        indexPage.clickOnRegisterLink();
        registerPage.enterFirstName("abc");
        registerPage.enterLastName("xyz");
        registerPage.enterAddress("abc road");
        registerPage.enterCity("afddg");
        registerPage.enterState("aaa");
        registerPage.enterZipCode("123456");
        registerPage.enterSsnNumber("15389462");
        registerPage.enterUserName("abc22");
        registerPage.enterPassword("abc123");
        registerPage.enterConfirmPassword("abc123");
        registerPage.clickOnRegistrationButton();
        String expectedRegisterSuccessText = "Your account was created successfully. You are now logged in.";
        String actualRegisterSuccessText = registerPage.getVerifyRegisterSuccessText();
        Assert.assertEquals(expectedRegisterSuccessText,actualRegisterSuccessText);
    }
}
