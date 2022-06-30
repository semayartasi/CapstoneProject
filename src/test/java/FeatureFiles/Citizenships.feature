Feature: Citizenship Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully

  @Regression
  Scenario: Add Citizenship
    And User create citizenship with "SemaCitizen" name and "Sema" shortname
    Then Success message should be displayed


  Scenario: Edit Citizenship
    And User edit the "SemaCitizen" citizenship to "SemaUpdatedCitizen"
    Then Success message should be displayed


  Scenario: Delete Citizenship
    And User delete "SemaUpdatedCitizen" citizenship
    Then Success message should be displayed