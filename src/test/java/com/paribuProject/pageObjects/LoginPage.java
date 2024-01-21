package com.paribuProject.pageObjects;

import com.paribuProject.utilities.PropertiesReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(id = "username")
    public WebElement email;

    @FindBy(id = "click_login_submit_v2")
    public WebElement nextButton;

    @FindBy(xpath = "//div[@class='help_error css-z72qxo']")
    public WebElement errorMessage;

    public void loginWithInvalidEmail(){
        email.sendKeys(PropertiesReader.get("invalidemail"));
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void checkErrorMessageVisibility() {
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
