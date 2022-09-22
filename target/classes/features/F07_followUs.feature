@smoke
Feature: F07 | User could open followUs links

  Scenario: User opens facebook link
    Given User redirects to Home page
    When User press on FollowUs Facebook icon
    Then New tab will be opened with this URL "https://www.facebook.com/nopCommerce"

  Scenario: User opens twitter link
    Given User redirects to Home page
    When User press on FollowUs Twitter icon
    Then New tab will be opened with this URL "https://twitter.com/nopCommerce"

  Scenario: User opens RSS link
    Given User redirects to Home page
    When User press on FollowUs RSS icon
    Then New tab will be opened with this URL "https://demo.nopcommerce.com/new-online-store-is-open"

  Scenario: User opens youtube link
    Given User redirects to Home page
    When User press on FollowUs Youtube icon
    Then New tab will be opened with this URL "https://www.youtube.com/user/nopCommerce"