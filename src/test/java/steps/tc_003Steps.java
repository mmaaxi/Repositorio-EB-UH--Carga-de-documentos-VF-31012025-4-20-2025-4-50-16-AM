package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page page;

    public tc_003Steps() {
        this.driver = Hooks.getDriver();
        this.page = new tc_003Page(driver);
    }

    @Given("El usuario selecciona un archivo con formato no soportado")
    public void usuarioSeleccionaArchivoFormatoNoSoportado() {
        page.seleccionarArchivoFormatoNoSoportado();
    }

    @When("El usuario intenta cargar el archivo")
    public void usuarioIntentaCargarArchivo() {
        page.intentarCargarArchivo();
    }

    @Then("El sistema rechaza la carga y muestra un mensaje de error sobre el formato inválido")
    public void sistemaRechazaCargaMuestraMensajeError() {
        page.verificarMensajeDeErrorFormatoInvalido();
    }
}