Feature: Validar la seguridad en la carga de documentos

  Scenario: Cargar documento con inyección de código malicioso
    Given el usuario está en la página de carga de documentos
    When intenta cargar un documento con código malicioso
    Then el sistema bloquea la carga y notifica al usuario

  Scenario: Verificar registro en el log de seguridad
    Given un incidente de carga de documento con inyección de código ha ocurrido
    When analizo el log de seguridad
    Then el incidente debe estar registrado y el administrador ha sido notificado