Feature: Login into user account

  Scenario: Login user with valid credentials
    Given User navigates to login page
    And User enters valid username
    And User enters valid password
    When User clicks on the login button
    Then User should be taken to the welcome page
