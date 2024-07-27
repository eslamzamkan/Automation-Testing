Feature: user shows two sliders
  @Regression_TCs
  Scenario: : first slider is clickable on home page
    When user click first slider
    Then the webpage reload to home page
  @Regression_TCs
    Scenario:  second slider is clickable on home page
      When user click second slider
      Then the webpage reload same home page