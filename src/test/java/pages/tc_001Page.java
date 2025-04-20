package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class tc_001Page {

    WebDriver driver;
    WebDriverWait wait;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void seleccionarDocumentoValido() {
        // Implementación para seleccionar un documento válido
        WebElement inputFile = driver.findElement(By.id("fileInput"));
        inputFile.sendKeys("/path/al/documento/valido.pdf");
    }

    public void hacerClicEnCargar() {
        WebElement cargarButton = driver.findElement(By.id("uploadButton"));
        cargarButton.click();
    }

    public String obtenerMensajeCarga() {
        WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadMessage")));
        return mensaje.getText();
    }

    public boolean verificarDocumentoEnLista() {
        WebElement documentoEnLista = driver.findElement(By.xpath("//table[@id='documentTable']//tr[td[contains(text(),'valido.pdf')]]"));
        return documentoEnLista.isDisplayed();
    }
}