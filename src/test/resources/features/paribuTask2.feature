Feature: Checking the functionalities of headers
  Background:
    Given User should be at the Binance home page

  Scenario: Attempting to Log in with Incorrect Information
    When The cookies pop-up that appears on the homepage is clicked
    Then The opened pop-up page is seen and closed
    Then The homepage is observed to be opened and the user waits on the Buy-Sell button on the top header
    And The spot button in the Buy-Sell dropdown menu is clicked
    And Click on login on the Spot market page
    And Attempt to log in with incorrect information on the login page
    Then Confirm that the error message is displayed