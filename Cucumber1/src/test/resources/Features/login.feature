Feature: feature to test login functionality

  Scenario: Verify user is able to login with valid creentilas
    Given user is on login page
    When user enters user name and password
    And Click on login button
    Then Home page should be display

 
