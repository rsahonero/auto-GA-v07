Feature: Validation of the login page
  # Elmer Valencia Ledezma
  # 1
  Scenario: Validate “ADD” button enables the ADD ADMIN form.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'ADD' button on 'admin management' page
    And Click 'Logout' button on 'Header' page
  # 2
  Scenario: Validate 'PRINT' button in the 'ADMINS MANAGEMENT' page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'PRINT' button on 'admin management' page
    And Click 'Logout' button on 'Header' page
  # 3
  Scenario: Validate 'EXPORT INTO CSV' button in the 'ADMINS MANAGEMENT' page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'EXPORT INTO CSV' button on 'admin management' page
    And Click 'Logout' button on 'Header' page
  # 4
  Scenario: Validate 'DESC' and 'ASC' order option when select each column
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'First Name' column on header list to 'desc' order
    And Click 'First Name' column on header list to 'asc' order
    And Click 'Last Name' column on header list to 'desc' order
    And Click 'Last Name' column on header list to 'asc' order
    And Click 'Email' column on header list to 'desc' order
    And Click 'Email' column on header list to 'asc' order
    And Click 'Active' column on header list to 'desc' order
    And Click 'Active' column on header list to 'asc' order
    And Click 'Last Login' column on header list to 'desc' order
    And Click 'Last Login' column on header list to 'asc' order
    And Click 'Logout' button on 'Header' page
  # 5
  Scenario: Validate the 'Pagination' of the list change the list
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click '10' button to display the list on 10 to 10
    And Click '25' button to display the list on 25 to 25
    And Click '50' button to display the list on 50 to 50
    And Click '100' button to display the list on 100 to 100
    And Click 'Logout' button on 'Header' page
  # 6
  Scenario: Validate 'EDIT' button in the 'ADMINS MANAGEMENT' page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'EDIT' button on 'admin management' page
    And Click 'Logout' button on 'Header' page
  # 7
  Scenario: Validate 'SEARCH' Button enables the Search form.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'SEARCH' button to display the SEARCH form
    And Click 'Logout' button on 'Header' page
  # 8
  Scenario: Validate that display 'ALERT' when try to delete a admin
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'DELETE' button on 'admin management' page
    And Click 'Logout' button on 'Header' page
  # 9
  Scenario: Validate 'ALL' button to display all admins
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'All' button to display all admins
    And Click 'Logout' button on 'Header' page
  # 10
  Scenario: Validate 'GO' Button in the search form
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'SEARCH' button to display the SEARCH form
    And Set parameters on 'SEARCH' form
    And Click 'GO' button to search
    And Click 'Logout' button on 'Header' page

   # General > Payment Gateways

  Scenario: Validate que la lista de Gayteways sea visible
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'General' link on 'Left Panel' Page
    And Click 'Logout' button on 'Header' page
  #2
  Scenario: Validar que el registro de la lista Payment se mueve una posicion debajo cuando se presiona la fecha "moveDown"
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'General' link on 'Left Panel' Page
    And Click 'Movedown' move record one position down
    And Click 'Logout' button on 'Header' page

   #3
  Scenario: Validar que el registro de la lista Payment se mueve una posicion arriba cuando se presiona la fecha "upDown"
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'General' link on 'Left Panel' Page
    And Click 'Updown' move record one position arriba
    And Click 'Logout' button on 'Header' page

   #4
  Scenario: Validar que el registro se muestra en la lista de Payments despues de presionar el boton Activate
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'General' link on 'Left Panel' Page
    And Click 'Activate' link on 'Left Panel' Page
    And Click 'Logout' button on 'Header' page

   #5
  Scenario: Validar que el “Nombre del registro” popup se cierra después de presionar el icono x
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'General' link on 'Left Panel' Page
    And Click 'Close popup' icon x
    And Click 'Logout' button on 'Header' page

   #6
  Scenario: Validar que el “Nombre del registro” popup se cierra después de presionar el botón CLOSE
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'General' link on 'Left Panel' Page
    And Click 'Close popup' button Close
    And Click 'Logout' button on 'Header' page

   #7
  Scenario: Validate que la lista de Slider sea visible
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Slider' link on 'Left Panel' Page
    And Click 'Logout' button on 'Header' page

   #8
  Scenario: Validate los registros de Slider se muestran seleccionados despues de presionar el checkbox
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Slider' link on 'Left Panel' Page
    And Click 'CheckSlider' el registro es seleccionado
    And Click 'Logout' button on 'Header' page

   #9
  Scenario: Validate que el resumen del registro es visible despues de presionar el icono View
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Slider' link on 'Left Panel' Page
    And Click 'SliderView' el resumen registro es visible
    And Click 'Logout' button on 'Header' page

   #10
  Scenario: Validate que una ventana emergente se muestra despues de presionar el botón “Print”
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Slider' link on 'Left Panel' Page
    And Click 'SliderPrint' imprimir registro
    And Click 'Logout' button on 'Header' page

  # Blog - posts (Jaime Ojeda)
  #01
  Scenario: Test Case 01: Verificar que el contenido del sub-menú “Blog” muestre el contenido
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click On Logout Button
  #02
  Scenario: Test Case 02: Verificar que el contenido del sub-menú “Blog” muestre el contenido
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click On Logout Button
  #03
  Scenario: Test Case 03: Verificar que al hacer click en la columna “Name” los ítems se ordenan
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Name
    And Click On Logout Button
  #04
  Scenario: Test Case 04: Verificar que al hacer click en la columna “Name” los ítems se ordenan
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Category
    And Click On Logout Button
  #05
  Scenario: Test Case 05: Verificar que los elementos se ordenan al hacer click en la columna “Date”
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Date
    And Click On Logout Button
  #06
  Scenario: Test Case 06: Verificar que al hacer click en la columna “Order” los elementos se ordenan.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Order
    And Click On Logout Button
  #07
  Scenario: Test Case 07: Verificar que los elementos se ordenan al hacer click en la columna “Status”
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Status
    And Click On Logout Button
  #08
  Scenario: Test Case 08: Verificar que los elementos se ordenan al hacer click en la columna “Thumb”
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Thumb
    And Click On Logout Button
  #09
  Scenario: Test Case 09: Verificar que el botón “Print” muestre la ventana de impresión.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' on button 'Print'
    And Click On Logout Button
  #10
  Scenario: Test Case 10: Verificar que el botón “Export Into csv” exporte el documento.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' on button 'Export'
    And Click On Logout Button