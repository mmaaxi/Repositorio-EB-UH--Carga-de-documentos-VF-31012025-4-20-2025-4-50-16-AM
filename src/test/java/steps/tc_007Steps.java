import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_007Page;

public class tc_007Steps {

    WebDriver driver;
    tc_007Page page;

    @Given("I start the upload of a valid document")
    public void i_start_the_upload_of_a_valid_document() {
        page = new tc_007Page(driver);
        page.initiateDocumentUpload();
    }

    @When("I interrupt the internet connection during the upload")
    public void i_interrupt_the_internet_connection_during_the_upload() {
        page.interruptInternetConnection();
    }

    @Then("The system captures the interruption")
    public void the_system_captures_the_interruption() {
        page.verifyInterruptionCaptured();
    }

    @Then("Shows an error message indicating connection failure")
    public void shows_an_error_message_indicating_connection_failure() {
        page.verifyErrorMessage("Connection Error: Upload failed due to interrupted internet connection.");
    }
}