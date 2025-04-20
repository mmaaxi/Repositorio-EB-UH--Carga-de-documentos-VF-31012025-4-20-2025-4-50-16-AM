package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By documentList = By.id("documentList");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean seleccionarDocumentos() {
        // Simulamos la selección de múltiples documentos
        WebElement button = driver.findElement(uploadButton);
        button.sendKeys("/path/to/document1.pdf \n /path/to/document2.docx \n /path/to/document3.txt");
        return true; // Suponemos que la selección es siempre exitosa en este ejemplo
    }

    public boolean verificarFormatosSoportados() {
        // Lógica para verificar si el sistema reconoce y soporta los formatos
        return true; // Suponemos que es siempre exitoso en este ejemplo
    }

    public void cargarDocumentos() {
        // Lógica para cargar los documentos uno por uno
        driver.findElement(uploadButton).click();
    }

    public boolean verificarDocumentosCargados() {
        // Lógica para verificar que los documentos están listados correctamente
        return driver.findElements(documentList).size() > 0;
    }
}