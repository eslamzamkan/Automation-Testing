Feature: Search Feature
  @Regression_TCs
  Scenario Outline: User could search using product name
    Given user navigates to home page
    When user searches for a product "<product>"
    And user clicks on the search button
    Then search results for"<product>" are displayed
    Examples:
      | product  |
      | book     |
      | laptop   |
      | nike     |

  @Regression_TCs
  Scenario Outline: User could search for product using sku
    Given user navigates to home page
    When user searches for a product using SKU"<sku>"
    And user clicks on the product from search result
    Then product page SKU should contain "<sku>"
    Examples:
      | sku         |
      | SCI_FAITH   |
      | APPLE_CAM   |
      | SF_PRO_11   |
