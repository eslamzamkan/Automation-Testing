@Regression_TCs
Feature: F01_Register | users could register with new accounts
  Scenario:guest user could register with valid data successfully or happy scenario
    Given  user go to register page
    When user select gender type
    And user enter valid first name
    And  user enter valid last name
    And  user enter date of birth day
    And  user enter date of birth month
    And  user enter date of birth year
    And  user enter a valid email
    And user enter a valid Company name
    And   user fills Password fields with valid password
    And  user refill Confirm password fields
    And  user clicks on register button
    Then  success message is displayed with color

