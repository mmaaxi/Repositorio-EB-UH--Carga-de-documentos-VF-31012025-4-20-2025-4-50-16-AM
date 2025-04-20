package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class tc_003Page {
    WebDriver driver;
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarArchivoFormatoNoSoportado() {
        WebElement fileInput = driver.findElement(By.id("fileInput"));
        fileInput.sendKeys(System.getProperty("user.dir") + "/files/archivo_no_soportado.exe");
    }

    public void intentarCargarArchivo() {
        driver.findElement(uploadButton).click();
    }

    public void verificarMensajeDeErrorFormatoInvalido() {
        WebElement errorElement = driver.findElement(errorMessage);
        String expectedMessage = "Formato de archivo no soportado.";
        Assert.assertEquals(expectedMessage, errorElement.getText());
    }
}