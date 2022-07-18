@activity6
Feature: Data driven test with Example

Scenario Outline: Testing with Data from Scenario
    Given User is on the Login page of site
    When User enters the "<Usernames>" and "<Passwords>" of site
    Then Read page title and the confirmation message of site
    And Close Browsers in firefox
    
Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |