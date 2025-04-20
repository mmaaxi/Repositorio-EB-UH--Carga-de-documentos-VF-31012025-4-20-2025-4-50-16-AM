Feature: Validar formato inválido de documento

  Scenario: Intentar cargar un archivo con un formato no soportado
    Given El usuario selecciona un archivo con formato no soportado
    When El usuario intenta cargar el archivo
    Then El sistema rechaza la carga y muestra un mensaje de error sobre el formato inválido