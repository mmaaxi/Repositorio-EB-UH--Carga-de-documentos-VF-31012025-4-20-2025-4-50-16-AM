Feature: Validate system response to connection interruption during upload

  Scenario: Validate response to connection interruption
    Given I start the upload of a valid document
    When I interrupt the internet connection during the upload
    Then The system captures the interruption
    And Shows an error message indicating connection failure