@regression
Feature: Login Tests

 # Background:
  #  Given The user is on the login page

  @login @selim @smoke
  Scenario: Positive Login Test as Selim
    Given The user is on the login page
    When The user enters valid credentials for Selim
    Then The user should be able to login

  @login @rosa @smoke
  Scenario: Positive Login Test as Rosa
    Given The user is on the login page
    When The user enters valid credentials email: "rosa@test.com" and password: "Test123456"
    Then The user should be able to login

  @login @mike
  Scenario: Positive Login Test as Mike
    Given The user is on the login page
    When The user enters valid credentials email: "mike@gmail.com" and password: "mike1234"
    Then The user should be able to login