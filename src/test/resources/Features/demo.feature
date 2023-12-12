
Feature: feature to test login functionnality

  Scenario: Check login is successful with valid cedentials
  @SmokeTests
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home pagex

