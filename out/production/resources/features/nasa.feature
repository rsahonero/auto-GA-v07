Feature: Validacion de comparar texto
  Scenario: Cargar Pagina Nasa
    Given I load Nasa
    And click 'Nasa Api Listing'
    And click 'Nasa Api Listing' second time
    And click 'Earth'
    And click 'Imagery'
    Then 'obtener' el link de la seccion Get

