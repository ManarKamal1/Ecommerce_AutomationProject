@smoke
Feature: F05 | User can hover on one of main categories then click on sub category

  Scenario: User select subcategory
    Given User redirects to Home page
    When User hover on one of main categories then click on one of it's sub categories
    Then User will be navigated to a page contains products about that subcategory
