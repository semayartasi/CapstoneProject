Feature: Fees Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully

  @Regression
  Scenario Outline: Add Fees
    And User create Fee "<name>" and "<code>" and "<intCode>" and "<priority>"
    Then Success message should be displayed

    Examples:
      | name      | code    | intCode   | priority |
      | SemaFee1 | 0100001 | paypal    | 754      |
      | SemaFee2 | 0100020 | applePay  | 765      |
      | SemaFee3 | 0230001 | googlePay | 755      |


  Scenario Outline: Edit Fees
    And User edit Fee "<existingFeeName>" and change it to "<newFeeName>"
    Then Success message should be displayed

    Examples:
      | existingFeeName | newFeeName         |
      | SemaFee1       | Updated Sema Fee1 |
      | SemaFee2       | Updated Sema Fee2 |
      | SemaFee3       | Updated Sema Fee3 |


  Scenario Outline: Delete Fees
    And User delete Fee "<FeeName>"
    Then Success message should be displayed

    Examples:
      | FeeName            |
      | Updated Sema Fee1 |
      | Updated Sema Fee2 |
      | Updated Sema Fee3 |