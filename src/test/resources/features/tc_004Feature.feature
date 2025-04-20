Feature: Validate document upload with maximum allowed size

  Scenario: Upload a document with size close to the maximum limit
    Given the user is on the document upload page
    When the user selects a file with size close to the maximum allowed limit
    Then the system should accept the document and display the size details
    When the user clicks on 'Upload'
    Then the document should upload successfully and confirm the operation