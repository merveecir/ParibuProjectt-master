package com.paribuProject.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketsPage extends AbstractPage {

    @FindBy(id = "market_sector_Spot/Margin Market")
    public WebElement spotMarketsButton;

    @FindBy(xpath ="//div[normalize-space()='AVAX']")
    public WebElement avaxUsdtButton;

    public void clickSpotMarketsPage() {
        spotMarketsButton.click();
    }

    public void clickAvaxUsdtButton(){
        wait(2);
        avaxUsdtButton.click();
    }
}