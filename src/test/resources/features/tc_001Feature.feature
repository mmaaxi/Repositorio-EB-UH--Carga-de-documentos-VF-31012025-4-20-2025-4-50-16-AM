Feature: Validar carga exitosa de un documento válido

  Scenario: Cargar un documento válido al sistema
    Given que el usuario selecciona un documento válido desde el sistema de archivos
    When el usuario hace clic en el botón "Cargar"
    Then el sistema debe mostrar un mensaje de "Carga exitosa"
    And el documento cargado debe aparecer en la lista de documentos