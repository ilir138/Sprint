Feature: TeacherAcc

  Scenario: User can create a new Teacher Account
Given I am on the Homepage
When I tap on 'Create an Account'
And I click on Teacher radio button if not selected
And I fill out all required fields
And I submit the form
Then I verify successful creation of a user profile