package com.paribuProject.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class MainPage extends AbstractPage {

    @FindBy (id = "ba-tableMarkets")
    public WebElement marketsButton;

    @FindBy( xpath= "//span[@id='ba-trade']")
    public WebElement tradeButton;

    @FindBy(xpath = "//*[text()='About Us']/../..//a")
    public List<WebElement> aboutUsFooterLinks;

    @FindBy (xpath = "//div[@class='typography-Subtitle4'][normalize-space()='Spot']")
    public WebElement spotButton;

    public void clickMarketButton(){
        marketsButton.click();
    }

    public void moveToTradeButton(){
        moveToElement(tradeButton);
    }

    public void clickSpotButton(){
        spotButton.click();
    }

    public void clickRandomFooterLink(){
        aboutUsFooterLinks.get(new Random().nextInt(aboutUsFooterLinks.size()-1)).click();
    }
}
