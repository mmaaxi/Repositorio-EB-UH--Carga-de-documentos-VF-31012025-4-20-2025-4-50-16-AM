package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {
    WebDriver driver;

    private By fileInput = By.id("fileUpload");
    private By uploadButton = By.id("uploadButton");
    private By sizeDetails = By.id("sizeDetails");
    private By successMessage = By.id("successMessage");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectFileWithMaxSize() {
        WebElement uploadElement = driver.findElement(fileInput);
        uploadElement.sendKeys("/path/to/large/file.docx");
    }

    public void verifyDocumentAccepted() {
        WebElement details = driver.findElement(sizeDetails);
        // Assert that size details are displayed, logic will vary based on your assertion library
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void verifyUploadSuccess() {
        WebElement successMsg = driver.findElement(successMessage);
        // Assert that success message is displayed, logic will vary based on your assertion library
    }
}