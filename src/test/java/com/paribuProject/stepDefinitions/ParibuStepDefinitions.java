package com.paribuProject.stepDefinitions;

import com.paribuProject.pageObjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParibuStepDefinitions {
    LoginPage loginPage;
    DetailPage detailPage;
    MarketsPage marketsPage;
    MainPage mainPage;

    public ParibuStepDefinitions() {
        loginPage = new LoginPage();
        detailPage = new DetailPage();
        marketsPage = new MarketsPage();
        mainPage = new MainPage();
    }

    @Given("User should be at the Binance home page")
    public void userShouldBeAtTheBinanceHomePage(){
        mainPage.openUrl();
    }

    @When("Click on the Markets option in the top menu")
    public void clickOnTheMarketsOptionInTheTopMenu() {
        mainPage.clickMarketButton();
    }

    @And("Click on the Spot markets button listed on the screen")
    public void clickOnTheSpotMarketsButtonListedOnTheScreen() {
        marketsPage.clickSpotMarketsPage();
    }

    @And("Find and click on the listed Avax Usdt button")
    public void findAndClickOnTheListedAvaxUsdtButton() {
        marketsPage.clickAvaxUsdtButton();
    }

    @Then("Verify that the page opens successfully")
    public void verifyThatThePageOpensSuccessfully() {
    }

    @Then("The homepage is observed to be opened and the user waits on the Buy-Sell button on the top header")
    public void theHomepageIsObservedToBeOpenedAndTheUserWaitsOnTheBuySellButtonOnTheTopHeader() {
        mainPage.moveToTradeButton();
    }

    @And("The spot button in the Buy-Sell dropdown menu is clicked")
    public void theSpotButtonInTheBuySellDropdownMenuIsClicked() {
        mainPage.clickSpotButton();
    }

    @Then("The opened pop-up page is seen and closed")
    public void theOpenedPopUpPageIsSeenAndClosed() {
        detailPage.clickCloseButtonOfPopUp();
    }

    @When("The cookies pop-up that appears on the homepage is clicked")
    public void theCookiesPopUpThatAppearsOnTheHomepageIsClicked() {
        detailPage.clickAcceptButtonOfCookies();
    }

    @And("Click on login on the Spot market page")
    public void clickOnLoginOnTheSpotMarketPage() {
        detailPage.clickLoginButton();
    }

    @And("Attempt to log in with incorrect information on the login page")
    public void attemptToLogInWithIncorrectInformationOnTheLoginPage() {
        loginPage.loginWithInvalidEmail();
        loginPage.clickNextButton();
    }

    @Then("Confirm that the error message is displayed")
    public void confirmThatTheErrorMessageIsDisplayed() {
        loginPage.checkErrorMessageVisibility();
    }

    @And("Clicks on a link below the About Us title randomly")
    public void clicksOnALinkBelowTheAboutUsTitleRandomly() {
        mainPage.clickRandomFooterLink();
        mainPage.clickRandomFooterLink();
        mainPage.clickRandomFooterLink();
        mainPage.clickRandomFooterLink();
        mainPage.clickRandomFooterLink();
    }
}
