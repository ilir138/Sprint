Feature: Jumper

  Scenario: Verify YTO jumper shows up only once per session

  Given I am on the Homepage
  When I login
  And I go to YTO page
  And I go to By Flyer tab
  And I click on Price-Qty
  Then I verify jumper with text is displayed
  When I click on Price-Quantity
  Then I verify jumper is NOT displayed