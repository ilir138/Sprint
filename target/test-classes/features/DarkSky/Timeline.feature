Feature: StarFilter
  @enable
Scenario: Verify timeline is displayed in correct format

Given I am on Darksky home page
Then I verify timeline is displayed with 2 hours increment