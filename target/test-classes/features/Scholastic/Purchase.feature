Feature: Purchase

  Scenario: User can make a purchase using credit card
    Given I am on the Homepage
    When I login
    And I select 'Your Teacher Order' from Enter Orders
    And I go to 'BY FlYER' category
    And I add quantity
    And I click on 'REVIEW CART' button
    And I proceed to checkout
    Then I verify order has been placed successfully