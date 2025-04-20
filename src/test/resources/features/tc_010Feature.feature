Feature: Validar la interfaz y usabilidad del módulo de carga de documentos

  Scenario: Navegar hasta el módulo de carga de documentos
    Given el usuario está en la página de inicio
    When navega hasta el módulo de carga de documentos
    Then la interfaz es amigable, intuitiva y accesible

  Scenario: Cargar un documento mediante el interfaz gráfico
    Given el usuario está en el módulo de carga de documentos
    When carga un documento utilizando la interfaz gráfica
    Then la acción se ejecuta sin errores y la retroalimentación visual es clara y consistente