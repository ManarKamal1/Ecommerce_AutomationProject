@smoke
Feature: F08 | User can add different products to Wishlist

  Scenario: User add HTC One M8 Android to Wishlist
    Given User redirects to Home page
    When User press on add to wishlist button of HTC phone
    Then Green success message will be displayed

  Scenario: User add htc phone product to Wishlist and validate its quantity
    Given User redirects to Home page
    When User press on add to wishlist button of HTC phone
    And User press on Wishlist tab
    Then User will be navigated to wishlist page