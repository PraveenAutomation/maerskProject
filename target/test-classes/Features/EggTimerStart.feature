Feature: Acceptance testing to validate Search cars page is working fine.
  In order to validate that
  the search cars page is working fine
  we will do the acceptance testing

  Scenario: Validate egg timer functionality
    Given user is on the Home Page "https://e.ggtimer.com/" of eggtimer website
    And the page title should be "e.ggtimer - a simple countdown timer"
    And user enter timer on timer box
    Then click on "start" link
    Then timer starts on decreasing order
    And after that "Time Expired!" message should be displayed
