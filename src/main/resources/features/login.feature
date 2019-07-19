Feature: Validation of the login page
  Scenario: Load PHP travels page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'General' link on 'Left Panel' Page
    //Accounts-Admins-print
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'PRINT' button on 'admin management' page
  //Blog - Blog Categories
    And Move Down The Sidebar Menu
    And Click 'Blog' link on 'Blog Categories' Page