Feature: Social Connetion

  Scenario: Created a new Social Connection wit Save Return
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Connection' page
    When Add 'Social Connection'
    And 'Save and Return' of the  register with "Duolingo" name and "https://www.duolingo.com/" link
    Then The "Duolingo" should be shon in the table
    And Logout

  Scenario: Created a new Social Connection wit Save & New
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Connection' page
    When Add 'Social Connection'
    And 'Save & New' of the  register with "Google Map" name and "https://www.google.com/maps" link
    Then The 'Social Name' should blank
    And Logout

  Scenario: Created a new Social Connection wit Save & Edit
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Connection' page
    When Add 'Social Connection'
    And 'Save & Edit' of the  register with "Musica" name and "https://www.musica.com/" link
    Then The "Musica" should shown
    And Logout

  Scenario: Return to Social Connection wit Return Button
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Connection' page
    When Add 'Social Connection'
    And 'Return' of the  register
    Then The table should shown
    And Logout

  Scenario: The user can update a image
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Connection' page
    When Add 'Social Connection'
    And Add a imagen
    And Click Add the other image
    Then The image should be update
    And Logout

  Scenario: The user can deleted a image
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Connection' page
    When Add 'Social Connection'
    And Add a imagen
    And Delete image
    Then The image is not shown
    And Logout


  Scenario: The user can deleted a social conection
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Connection' page
    When deleted 'Social Connection'
    And click Accept popup
    Then The "Facebook" must not shown in the 'Social Connection' table
    And Logout

  Scenario: The user can update the Social Name
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Connection' page
    When Edit 'Social Connection'
    And the 'Twitter' changes "My Twitter"
    Then The "My Twitter" must be shown in the 'Social Connection' table
    And Logout

  Scenario: The user can update the Social link
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Connection' page
    When Edit 'Social Connection'
    And the 'https://twitter.com/phptravels' changes "https://es.twitter.com/phptravels"
    Then The "https://es.twitter.com/phptravels" must be shown in the 'Social Connection' link
    And Logout


  Scenario: The user can update the Social Status
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Social Connection' page
    When Edit 'Social Connection'
    And the 'Yes' changes to 'No'
    Then The "No" must be shown in the 'Social Connection' Status
    And Logout