Feature: Redirecting by click

  @browser
  Scenario: Check pages and click buttons
    When load first page
    And wait loader is not shown
    Then text "First page" is visible

    When click button "GO TO SECOND PAGE"
    And wait loader is not shown
    Then text "Second page" is visible

    When click button "GO TO THIRD PAGE"
    And wait loader is not shown
    Then text "Third page" is visible

    When click button "GO TO FIRST PAGE"
    And wait loader is not shown
    Then text "First page" is visible
