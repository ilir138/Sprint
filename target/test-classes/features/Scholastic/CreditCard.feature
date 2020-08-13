Feature: CreditCard

  Scenario: Verify user is successfully able to add credit card in My Accounts
    Given I am on the Homepage
    When I login
    And I go to My Accounts page
    And I add credit card
    Then I verify credit card is added successfully in My Accounts
    And I verify added card is displayed when shopping using credit card