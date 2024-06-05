
Feature: Scenario Outline: Login Functionality Test

  Scenario: Login with List
    Given The user is on the login page
    When The user should be able to login and verify success login with follows
    | skara@gmail.com |
    | 001309Sumve     |
    | sevgi           |



  Scenario: Login with Map
    Given The user is on the login page
    When The user should be able to login and verify success login with following map

      | email    | skara@gmail.com |
      | password | 001309Sumve     |
      | username | sevgi           |

