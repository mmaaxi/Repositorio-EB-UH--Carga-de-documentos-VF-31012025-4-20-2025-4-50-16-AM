package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By inputArchivo = By.id("inputArchivo");
    By botonCargar = By.id("botonCargar");
    By mensajeError = By.id("mensajeError");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarArchivoVacio() {
        driver.findElement(inputArchivo).sendKeys("/ruta/al/archivo/vacio.txt");
    }

    public void clicEnCargar() {
        driver.findElement(botonCargar).click();
    }

    public String obtenerMensajeError() {
        return driver.findElement(mensajeError).getText();
    }
}