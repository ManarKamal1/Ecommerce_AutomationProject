@smoke
Feature: F06 | User can select between options in home slider

  Scenario: First slider is clickable on home page
    Given User redirects to Home page
    When User press on First slider
    Then User will be navigated to First slider details page

  Scenario: Second slider is clickable on home page
    Given User redirects to Home page
    When User press on Second slider
    Then User will be navigated to Second slider details page