Feature: NameUpdate

  Scenario: Verify user is successfully able to update name in My Accounts

    Given I am on the Homepage
    When I login
    And I go to My Accounts page
    And I update the name
    Then I verify name is updated successfully in My Accounts
    And I verify name is updated successfully in Page Header