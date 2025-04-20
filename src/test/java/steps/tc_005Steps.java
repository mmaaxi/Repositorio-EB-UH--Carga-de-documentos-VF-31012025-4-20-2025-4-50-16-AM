package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page page = new tc_005Page();

    @Given("I have uploaded a valid document")
    public void iHaveUploadedAValidDocument() {
        page.uploadDocument("path/to/document");
        Assert.assertTrue("The document should be uploaded successfully", page.isDocumentUploaded());
    }

    @When("I try to upload the same document again")
    public void iTryToUploadTheSameDocumentAgain() {
        page.uploadDocument("path/to/document");
    }

    @Then("I should see an error message 'Documento ya cargado'")
    public void iShouldSeeAnErrorMessage() {
        Assert.assertEquals("Documento ya cargado", page.getErrorMessage());
    }
}