Feature: Validation of the login page
  Scenario: Load PHP travels page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Cars' link on 'Left Panel' Page
    //Blog - Blog Categories
    And Move Down The Sidebar Menu
    And Click 'Blog' link on 'Blog Categories' Page