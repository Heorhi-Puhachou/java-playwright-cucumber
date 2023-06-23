Feature: First page

  @browser
  Scenario: Check elements on first page
    When load first page
    And wait loader is not shown
    Then text "First page" is visible
