package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class IndexPage extends Utility {
    By registerLink = By.linkText("Register");
    By registerText = By.xpath("//h1[contains(text(),'Signing up is easy!')]");
    By userNameField = By.xpath("//input[@name='username']");
    By passwordField = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//input[@value='Log In']");
    By loginText = By.xpath("//h1[contains(text(),'Accounts Overview')]");
    By errorText = By.cssSelector(".error");
    By logOutButton = By.linkText("Log Out");
    By customLoginText = By.xpath("//h2[contains(text(),'Customer Login')]");


    public void clickOnRegisterLink(){

        clickOnElement(registerLink);
    }

    public String getVerifyRegisterText(){

        return getTextFromElement(registerText);
    }

    public void enterUserName(String text){
        sendTextToElement(userNameField,text);
    }

    public void enterPassWord(String text){
        sendTextToElement(passwordField,text);
    }

    public void clickOnLoginLink(){

        clickOnElement(loginButton);
    }

    public String getVerifyLoginText(){

        return getTextFromElement(loginText);
    }

    public String getVerifyErrorText(){
        return getTextFromElement(errorText);
    }

    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }

    public String getVerifyCustomLoginText(){
        return getTextFromElement(customLoginText);
    }

}
