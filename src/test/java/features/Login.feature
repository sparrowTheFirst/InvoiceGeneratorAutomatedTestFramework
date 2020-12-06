Feature: Test the Login functionality

  Scenario: User should able to login with correct credentials
    Given User is on login page
    When User enters user name and password
    Then User gets confirmation