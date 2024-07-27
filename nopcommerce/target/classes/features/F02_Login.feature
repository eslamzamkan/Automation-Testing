@Regression_TCs
Feature:F02_Login | users could use login functionality to use their accounts
  Scenario:happy scenario user could login with valid email and password
    When user go to login page
    Given user login with valid Email
    And user login with valid password
    And user press on login button
    And user open my account
    Then user login to the system successfully
  @Regression_TCs
  Scenario: negative scenario user could login with invalid email and password
    When user go to login page
    Given user login with invalid Email
    And login with invalid password
    And user press on login button
    Then user could not login to the system


