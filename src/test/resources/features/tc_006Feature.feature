Feature: Validar soporte para múltiples formatos de documentos

  Scenario: Selección y carga de documentos en diferentes formatos
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona documentos en formatos PDF, DOCX y TXT
    Then el sistema debe reconocer y soportar los formatos PDF, DOCX y TXT sin inconvenientes
    When el usuario carga los documentos uno tras otro
    Then todos los documentos deben ser cargados y listados correctamente