Feature: First page

  @browser
  Scenario: Check elements on second page
    When load third page
    And wait loader is not shown
    Then table "WP-MEL-ECO-6KW x1" contain data
      | materialNumber | description                    | quantity | unit | shelfNumber |
      ###################################################################################
      | 11953          | PVC lijm mof 32mm 110100       | 2.00     | ST   |             |
      | 10126          | SCHB EURO-CLIP EC19 3/4" ZK200 | 1.00     | ST   |             |
      | 11929          | PIPE PVC T-STUK 45 3XMOF 32 L  | 1.00     | ST   | x.23        |
