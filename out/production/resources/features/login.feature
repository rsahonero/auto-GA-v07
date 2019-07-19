Feature: Validactiones de la pagina de Login

  Scenario: Cargar Pagina PHP Travels
    Given I load PHP travels
    And set my credencials  on 'Login' page
#    And click 'Cars' link on 'Left Panel' page
#   And click 'General' link on 'Left Panel' page
#    When Add 'Widgets'
#    And Set "Test Widgets" title, "Enable" status
#/    Then Verify that the "Test Widgets" is created
    And click 'General' link on 'Social Connection' page
    When Add 'Social Connection'