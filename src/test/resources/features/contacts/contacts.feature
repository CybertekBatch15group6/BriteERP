@new_contact
Feature: Create new contact
  As user, I want to be able to create new contact
  ​
  Scenario: Create new contact as an inventory manager
    Given user is on the login page
    When user logs in as an inventory manager manager
    And user navigates to Contacts
    Then user clicks on Create button
    And user create ASOS company
    Then user click on Save button
    And user should verify that title is ASOS