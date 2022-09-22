@smoke
Feature: F01_Register | New users can register new accounts
  Scenario: Users can successfully register with valid data
    Given Users redirects to registration page
    When Users enters gender type
    And Users enters their First Name
    And Users enters their Last Name
    And Users selects date of birth
    And Users enters their valid email address
    And Users enters valid password
    And Users re-enters the same valid password
    And Users presses on register button
    Then success registration message appears