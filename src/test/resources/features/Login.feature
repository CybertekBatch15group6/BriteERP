@login
  Feature: Login
    As user, I want to be able to login with email and password

  Background: open login page
    Given user is on the login page

    @purchasing_manager
    Scenario: Login as purchasing manager and verify that title is #Inbox - Odoo
      When user logs in as a purchasing manager
      Then user should verify that title is #Inbox - Odoo
