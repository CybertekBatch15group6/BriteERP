@CRM
Feature: Create pipeline
  As CRM manager, I should be able to create a pipeline in the CRM tab

  Background: CRM manager logged in
    Given user is on the login page
    And user logs in as a crm manager

  @Pipeline
    @CreatePipeline
  Scenario: Create Pipeline
    When user navigates to "CRM"
    And user selects first create button
    And user enters "Example Pipeline" as the Opportunity Title
    And user selects second create button
    Then a new pipeline called "Example Pipeline" will be visible

  @Pipeline
    @DeletePipeline
  Scenario: Delete Pipeline
    Given a new pipeline called "Example Pipeline" will be visible
    When user selects pipeline called "Example Pipeline"
    And user selects action tab
    And user selects "Delete" button
    And user confirms deletion
    Then pipeline called "Example Pipeline" should no longer be visible

