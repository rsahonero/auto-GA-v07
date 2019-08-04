Feature: Widgest

  Scenario: Create a new Widgets
    Given I load PHP travels
    And set my credencials  on 'Login' page
    And click 'General' link on 'Left Panel' page
    When Add 'Widgets'
    And Set "Test Widgets" title, "Enable" status
    Then The "Test Widgets" must be shown in the table
    And Logout

  Scenario: Delete a new Widgets
    Given I load PHP travels
    And set my credencials  on 'Login' page
    When click 'General' link on 'Left Panel' page
    And click Deleted Icon in the 'Test Widgets'
    And click Accept popup
    Then the "Test Widgets" register should not shown in the table
    And Logout

  Scenario: Update the Widgets name
    Given I load PHP travels
    And set my credencials  on 'Login' page
    When click 'General' link on 'Left Panel' page
    And click Edit Icon
    And "Test Ana "changed to 'Offers Page Left Advertisement'
    Then The "Test Ana" name should be change
    And Logout

  Scenario: Update the Widgets status
    Given I load PHP travels
    And set my credencials  on 'Login' page
    When click 'General' link on 'Left Panel' page
    And click Edit Icon
    And "Disable" change in the 'Footer hotels booking expedia and other logos'
    Then The "Disable" status should be change
    And Logout

  Scenario: Order by name asc
    Given I load PHP travels
    And set my credencials  on 'Login' page
    When click 'General' link on 'Left Panel' page
    And click in the Name link
    Then The name is order by name
    And Logout

  Scenario: Order by Widgets asc
    Given I load PHP travels
    And set my credencials  on 'Login' page
    When click 'General' link on 'Left Panel' page
    Then The WidgetsCode should be  order by Code
    And Logout


  Scenario: Order by status asc
    Given I load PHP travels
    And set my credencials  on 'Login' page
    When click 'General' link on 'Left Panel' page
    And click in the Widget Status link
    Then The Widget Status should be order by Status
    And Logout


  Scenario: Order by Widgets desc
    Given I load PHP travels
    And set my credencials  on 'Login' page
    When click 'General' link on 'Left Panel' page
    And Click in the WidgetsCode link
    Then The WidgetsCode should be order by Code desc
    And Logout


  Scenario: Order by status desc
    Given I load PHP travels
    And set my credencials  on 'Login' page
    When click 'General' link on 'Left Panel' page
    And click in the Widget Status link
    And click in the Widget Status link
    Then The Widget Status should be order by Status desc
    And Logout


  Scenario: Filter
    Given I load PHP travels
    And set my credencials  on 'Login' page
    When click 'General' link on 'Left Panel' page
    And click in the search
    And select "Widget Name"
    And type "Offers" widget name and click go
    Then the "Offers" shown be shown in the table
    And Logout

