@smoke
Feature: F02_Login | Users can Log in successfully with their registered accounts
  Scenario: Users can Log in with their valid email and password
    Given Users redirects to Login page
    When Users logs in with "valid" "manar.kamal@example.com" and "TEST@1234"
    And Users presses on Login button
    Then Users logs in to the website successfully


  Scenario: user could login with invalid email and password
    Given Users redirects to Login page
    When Users logs in with "invalid" "wrong@example.com" and "P@ssw0rd"
    And Users presses on Login button
    Then Users fails to login to the website