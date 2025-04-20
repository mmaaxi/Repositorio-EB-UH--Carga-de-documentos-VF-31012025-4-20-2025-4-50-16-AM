package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page uploadPage = new tc_004Page(driver);

    @Given("the user is on the document upload page")
    public void userIsOnUploadPage() {
        uploadPage.navigateToUploadPage();
    }

    @When("the user selects a file with size close to the maximum allowed limit")
    public void userSelectsFileWithMaxSize() {
        uploadPage.selectFileWithMaxSize();
    }

    @Then("the system should accept the document and display the size details")
    public void systemAcceptsDocument() {
        uploadPage.verifyDocumentAccepted();
    }

    @When("the user clicks on 'Upload'")
    public void userClicksUpload() {
        uploadPage.clickUploadButton();
    }

    @Then("the document should upload successfully and confirm the operation")
    public void documentUploadsSuccessfully() {
        uploadPage.verifyUploadSuccess();
    }
}