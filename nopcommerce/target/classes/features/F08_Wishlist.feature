@Regression_TCs
Feature:wishlist
  Scenario: user click on heart then success message The product has been added to your wishlist
    When  user click on heart
    And user enter all field with data
    Then  success message The product has been added to your wishlist with green color

  Scenario:user click on wishlist tape after green message disappear
    When user click on heart
    And user enter all field with data
    And  user click on wishlist after message disappear
    Then user check the Qty in wishlist greater than 0

