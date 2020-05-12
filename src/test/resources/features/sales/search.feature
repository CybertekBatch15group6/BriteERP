
Feature: Search quotation from the list

  As user, I want to be able to find quotation by searching
  @search
  Scenario: Search quotation by quotation number
    Given user is on the login page
    When user logs in as a sales manager
    And user navigates to "Sales"
    Then user searches the quotation "SO812" as a number
    And user verifies that correct quotation number appears as "SO812"
