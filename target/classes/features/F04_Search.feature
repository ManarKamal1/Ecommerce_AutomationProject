@smoke
Feature: F04 | Users can search for any product using product name / using sku

  Scenario Outline: User can search using product name
    Given User redirects to Home page
    When User search using product name "<name>" in search field
    And User press on Search button
    Then Search results appears with products related to the product name "<name>"

    Examples:
      | name   |
      | book   |
      | laptop |
      | nike   |

  Scenario Outline: User can search for product using sku
    Given User redirects to Home page
    When User search with product sku "<sku>" in search field
    And User press on Search button
    Then Search results appears with products related to the product sku "<sku>"

    Examples:
      | sku       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |