Feature: Validar la prueba de rendimiento de la carga de documentos

  Scenario: Carga y procesamiento de múltiples documentos
    Given que el sistema está en operación normal
    When simulo la carga de múltiples documentos simultáneamente
    Then el sistema mantiene la estabilidad y carga todos los documentos sin degradación del rendimiento
    And registro los tiempos de respuesta y procesamiento
    Then los tiempos se encuentran dentro del rango aceptable definido en los criterios de rendimiento