Feature: Prevent duplicate document upload
  Scenario: Validate error on trying to upload a duplicate document
    Given I have uploaded a valid document
    When I try to upload the same document again
    Then I should see an error message 'Documento ya cargado'