@regression
Feature: Login Tests with parameter


  @login @selim @smoke
  Scenario: Positive Login Test with Parameter
    Given The user is on the login page
    When The user enters valid credentials email: "skara@gmail.com" and password: "001309Sumve"
    Then The user should be able to login
    And The user should be able to see "sevgi" on the dashboard
    And The username should have 5 characters

