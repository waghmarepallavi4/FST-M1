@activity5
Feature: Data driven test with Example

Scenario Outline: Testing with Data from Scenario
    Given User is on the Login page
    When User enters the "<Usernames>" and "<Passwords>"
    Then Read page title and the confirmation message
    And Close Browsers
    
Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |