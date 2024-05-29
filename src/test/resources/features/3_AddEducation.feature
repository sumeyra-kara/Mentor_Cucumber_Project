
Feature: Add Education Test

  Background:
    Given The user is on the login page
    When The user enters valid credentials email: "skara@gmail.com" and password: "001309Sumve"
    And The user should be able to see "sevgi" on the dashboard


  Scenario: Check Add Education From Labels
    When The user navigates to tab "sevgi" and module "My Profile"
    Then The user verifies that the page title "User Profile"
    When The user navigates user profiles tabs "Add Education"
    Then The user verifies that the tab is displayed
    And The user should be able to see form labels as follows
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      | To Date                 |
      | Program Description     |



  Scenario: Check Add Education From Labels
    When The user navigates to tab "sevgi" and module "My Profile"
    Then The user verifies that the page title "User Profile"
    When The user navigates user profiles tabs "Add Education"
    Then The user verifies that the tab is displayed
    And The user should be able to see form labels as follows with empty label
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      |                         |
      | To Date                 |
      | Program Description     |

