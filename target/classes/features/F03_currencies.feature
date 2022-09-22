@smoke
Feature: F03 | Users can changes the currency from USD to Euro

  Scenario: User change currency from USD to Euro
    Given User redirects to Home page
    When User choose Euro from drop down list
    Then All items prices is converted to Euro