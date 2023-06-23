Feature: First page

  @browser
  Scenario: Check elements on second page
    When load second page
    And wait loader is not shown
    Then 3 inputs presented on page
