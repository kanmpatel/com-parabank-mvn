package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By firstNameField = By.id("customer.firstName");
    By lastNameField = By.id("customer.lastName");
    By addressField = By.xpath("//input[@name='customer.address.street']");
    By cityField = By.id("customer.address.city");
    By stateField = By.name("customer.address.state");
    By zipCodeField = By.name("customer.address.zipCode");
    By ssnNumberField = By.id("customer.ssn");
    By userNameField = By.xpath("//input[@name='customer.username']");
    By passwordField = By.xpath("//input[@name='customer.password']");
    By confirmPasswordField = By.xpath("//input[@name='repeatedPassword']");
    By registerButton = By.xpath("//input[@value='Register']");
    By registerSuccessText = By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in.')]");

    public void enterFirstName(String text){
        sendTextToElement(firstNameField,text);
    }

    public void enterLastName(String text){
        sendTextToElement(lastNameField,text);
    }

    public void enterAddress(String text){
        sendTextToElement(addressField,text);
    }

    public void enterCity(String text){
        sendTextToElement(cityField,text);
    }

    public void enterState(String text){
        sendTextToElement(stateField,text);
    }

    public void enterZipCode(String text){
        sendTextToElement(zipCodeField,text);
    }

    public void enterSsnNumber(String text){
        sendTextToElement(ssnNumberField,text);
    }

    public void enterUserName(String text){
        sendTextToElement(userNameField,text);
    }

    public void enterPassword(String text){
        sendTextToElement(passwordField,text);
    }

    public void enterConfirmPassword(String text){
        sendTextToElement(confirmPasswordField,text);
    }

    public void clickOnRegistrationButton(){
        clickOnElement(registerButton);
    }

    public String getVerifyRegisterSuccessText(){
        return getTextFromElement(registerSuccessText);
    }





}
