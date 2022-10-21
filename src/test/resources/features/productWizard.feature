Feature: Test test

  @preparePlaywright
  Scenario: First scenario
    Given must be started test
    When select "be@tarask" style
    And select "Puhachou" dictionary
    And input "auth" to search field
    Then 4 results available

