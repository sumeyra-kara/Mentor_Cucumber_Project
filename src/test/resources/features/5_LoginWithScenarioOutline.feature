@regression
Feature: Login Test DDF

  Scenario Outline: Login Test with different Users "<email>"
    Given The user is on the login page
    When The user enters valid credentials email: "<email>" and password: "<password>"
    Then The user should be able to login
    And The user should be able to see "<username>" on the dashboard
    And The username should have <nameLength> characters
    Examples:
      | email           | password    | username | nameLength |
      | skara@gmail.com | 001309Sumve | sevgi    | 5          |
      | rosa@test.com   | Test123456  | Rosa     | 4          |
      | mike@gmail.com  | mike1234    | mike     | 4          |


  Scenario Outline: Login with Map "<username>"
    Given The user is on the login page
    When The user should be able to login and verify success login with following map
      | email    | <email>    |
      | password | <password> |
      | username | <username> |
    Examples:
      | email           | password    | username |
      | skara@gmail.com | 001309Sumve | sevgi    |
      | rosa@test.com   | Test123456  | Rosa     |
      | mike@gmail.com  | mike1234    | mike     |


    @wip
    Scenario Outline: Login with List
      Given The user is on the login page
      When The user should be able to login and verify success login with follows
        | <email>    |
        | <password> |
        | <username> |
      Examples:
        | email           | password    | username |
        | skara@gmail.com | 001309Sumve | sevgi    |
        | rosa@test.com   | Test123456  | Rosa     |
        | mike@gmail.com  | mike1234    | mike     |

