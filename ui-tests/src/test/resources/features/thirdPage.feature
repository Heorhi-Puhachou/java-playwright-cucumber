Feature: First page

  @browser
  Scenario: Check elements on second page
    When load third page
    And wait loader is not shown
    Then list "LIST NAME" contain records
      | position | value        |
      ###########################
      | 1        | First value  |
      | 2        | Second value |
      | 3        | Third value  |
