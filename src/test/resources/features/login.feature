Feature: Validation of Blog - Posts

  Scenario: Test Case 01: Verificar que el contenido del sub-menú “Blog” muestre el contenido
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click On Logout Button

  Scenario: Test Case 02: Verificar que el contenido del sub-menú “Blog” muestre el contenido
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click On Logout Button

  Scenario: Test Case 03: Verificar que al hacer click en la columna “Name” los ítems se ordenan
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Name
    And Click On Logout Button

  Scenario: Test Case 04: Verificar que al hacer click en la columna “Name” los ítems se ordenan
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Category
    And Click On Logout Button

  Scenario: Test Case 05: Verificar que los elementos se ordenan al hacer click en la columna “Date”
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Date
    And Click On Logout Button

  Scenario: Test Case 06: Verificar que al hacer click en la columna “Order” los elementos se ordenan.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Order
    And Click On Logout Button

  Scenario: Test Case 07: Verificar que los elementos se ordenan al hacer click en la columna “Status”
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Status
    And Click On Logout Button

  Scenario: Test Case 08: Verificar que los elementos se ordenan al hacer click en la columna “Thumb”
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Thumb
    And Click On Logout Button

  Scenario: Test Case 09: Verificar que el botón “Print” muestre la ventana de impresión.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' on button 'Print'
    And Click On Logout Button

  Scenario: Test Case 10: Verificar que el botón “Export Into csv” exporte el documento.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' on button 'Export'
    And Click On Logout Button