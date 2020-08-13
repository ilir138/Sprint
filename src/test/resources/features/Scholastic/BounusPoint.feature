Feature: BonusPoint

  Scenario: Verify YTO jumper is not displayed for BonusPoint-Qty

    Given I am on the Homepage
    When I login
    And I go to YTO page
    And I go to By Flyer tab
    And I click on BonusPoint-Qty box
    Then I verify jumper is not displayed
    And I click on Price-Qty box
    Then I verify jumper is displayed