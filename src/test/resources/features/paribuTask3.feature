Feature: Checking the functionalities of links
  Background:
    Given User should be at the Binance home page

  Scenario: Clicking Random Links and Verifying Page Openings
    When The cookies pop-up that appears on the homepage is clicked
    Then The opened pop-up page is seen and closed
    And Clicks on a link below the About Us title randomly
    Then Verify that the page opens successfully