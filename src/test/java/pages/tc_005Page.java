package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    private WebDriver driver;
    private By uploadButton = By.id("uploadButton");
    private By errorMessage = By.id("errorMessage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocument(String filePath) {
        driver.findElement(uploadButton).sendKeys(filePath);
    }

    public boolean isDocumentUploaded() {
        // Logic to verify document upload success can go here
        // For this example, returning true assuming upload was successful
        return true;
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}