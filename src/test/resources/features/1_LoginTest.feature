@regression
Feature: Login Tests

  Background:
    Given The user is on the login page

  @selim @smoke @login
  Scenario: Positive Login Test as Selim
    When The user enters valid credentials for Selim
    Then The user should be able to login

  @login @rosa @smoke
  Scenario: Positive Login Test as Rosa
    When The user enters valid credentials for Rosa
    Then The user should be able to login

  @wip @login @mike
  Scenario: Positive Login Test as Mike
    When The user enters valid credentials for Mike
    Then The user should be able to login