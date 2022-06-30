Feature: Countries Functionality

  @Regression
  Scenario: Create Country
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully
    And User create Country
    Then Success message should be displayed


  Scenario: Edit Country
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully
    And User edit Country
    Then Success message should be displayed


  Scenario: Delete Country
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully
    And User delete Country
    Then Success message should be displayed