Feature: Validar error al intentar cargar un archivo vacío

  Scenario: Usuario intenta cargar un archivo vacío
    Given El usuario está en la página de carga de archivos
    When El usuario selecciona un archivo vacío
    And El usuario hace clic en 'Cargar'
    Then Se muestra un mensaje de error "El archivo no puede estar vacío"