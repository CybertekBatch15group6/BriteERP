@login
  Feature: Login
    As user, I want to be able to login with email and password

  Background: open login page
    Given user is on the login page
    When user i

    @purchasing_manager
    Scenario: Login as a purchasing manager and verify that title is #Inbox - Odoo
      When user logs in as a purchasing manager
      Then user should verify that title is #Inbox - Odoo

    @sales_manager
    Scenario: Login as a sales manager and verify that title is #Inbox - Odoo
      When user logs in as a sales manager
      Then user should verify that title is #Inbox - Odoo

    @expenses_manager
    Scenario: Login as an expenses manager and verify that title is #Inbox - Odoo
      When user logs in as an expenses manager
      Then user should verify that title is #Inbox - Odoo

    @events_manager
    Scenario: Login as an events manager and verify that title is #Inbox - Odoo
      When user logs in as an events manager
      Then user should verify that title is #Inbox - Odoo

    @crm_manager
    Scenario: Login as a crm manager and verify that title is #Inbox - Odoo
      When user logs in as a crm manager
      Then user should verify that title is #Inbox - Odoo

    @pos_manager
    Scenario: Login as a pos manager and verify that title is #Inbox - Odoo
      When user logs in as a pos manager
      Then user should verify that title is #Inbox - Odoo

    @inventory_manager
    Scenario: Login as an inventory manager and verify that title is #Inbox - Odoo
      When user logs in as an inventory manager
      Then user should verify that title is #Inbox - Odoo