package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.IndexPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
        IndexPage indexPage = new IndexPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        indexPage.enterUserName("abc22");
        indexPage.enterPassWord("abc123");
        indexPage.clickOnLoginLink();
        String expectedLoginSuccessText = "Accounts Overview";
        String actualLoginSuccessText = indexPage.getVerifyLoginText();
        Assert.assertEquals(expectedLoginSuccessText,actualLoginSuccessText);
    }

    @Test
    public void verifyTheErrorMessage(){
        indexPage.enterUserName("abc22");
        indexPage.enterPassWord("abc1234");
        indexPage.clickOnLoginLink();
        String expectedErrorText = "The username and password could not be verified.";
        String actualErrorText = indexPage.getVerifyErrorText();
        Assert.assertEquals(expectedErrorText,actualErrorText);
    }

    @Test
    public void userShouldLogOutSuccessfully(){
        indexPage.enterUserName("abc22");
        indexPage.enterPassWord("abc123");
        indexPage.clickOnLoginLink();
        indexPage.clickOnLogOutButton();
        String expectedCustomLoginText = "Customer Login";
        String actualCustomLoginText = indexPage.getVerifyCustomLoginText();
        Assert.assertEquals(expectedCustomLoginText,actualCustomLoginText);
    }


}
