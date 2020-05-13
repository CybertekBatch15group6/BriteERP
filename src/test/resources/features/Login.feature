@login
  Feature: Login
    As user, I want to be able to login with email and password

  Background:
    Given user is on the login page

  Scenario: Login as purchasing manager and verify
    When user logs in as a purchasing manager
    Then user should verify that title is #Inbox - Odoo