Feature: Checking the functionalities of markets
  Background:
    Given User should be at the Binance home page

  Scenario: Finding and Selecting the AVAX/USDT Market
    Then The cookies pop-up that appears on the homepage is clicked
    Then The opened pop-up page is seen and closed
    And Click on the Markets option in the top menu
    And Click on the Spot markets button listed on the screen
    And Find and click on the listed Avax Usdt button
    Then Verify that the page opens successfully