Feature: Social Conetion

  Scenario: Created a new Social Conection
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Conection' page
    When Add 'Social Conection'
    And 'Save and Return' of the  register with "Duolingo" name and "https://www.duolingo.com/" link
    Then The "Duolingo" should be shon in the table
