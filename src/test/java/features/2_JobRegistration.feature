Feature: Registration-Job functionality

  @smoke
  Scenario:  Registration-Job

    Given User should be able to navigate to homePage
    When karriereMenuItem should be clickable
    Then user should be able to click on the link for SDET job application registration
    And user schould be fill the application form
    Then user should be able to click on the apply now button
    And the user should see the validation_error message

