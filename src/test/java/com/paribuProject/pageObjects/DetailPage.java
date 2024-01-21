package com.paribuProject.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='css-yh7eaw']//*[name()='svg']")
    public WebElement closeButton;

    @FindBy(id = "toLoginPage")
    public WebElement loginButton;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptButton;

    @FindBy(xpath = "//a[@class='css-z1usmb']")
    public WebElement currencyContainer;

    public void clickCloseButtonOfPopUp(){
        wait(1);
        try{
            closeButton.click();
        }catch (Exception e){}
    }

    public void clickAcceptButtonOfCookies(){
        acceptButton.click();
    }
    public void clickLoginButton() {
        loginButton.click();
    }

    public void checkCurrencyContainer(){
        Assert.assertTrue(currencyContainer.isDisplayed());
    }
}



