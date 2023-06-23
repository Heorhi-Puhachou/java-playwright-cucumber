Feature: First page

  @browser
  Scenario: Check all elements on first page
    When load first page
    And wait loader is not shown
    When all step definitions are implemented
    Then the scenario passes
