package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("que el usuario selecciona un documento válido desde el sistema de archivos")
    public void seleccionarDocumentoValido() {
        page.seleccionarDocumentoValido();
    }

    @When("el usuario hace clic en el botón {string}")
    public void hacerClicEnBotonCargar(String boton) {
        page.hacerClicEnCargar();
    }

    @Then("el sistema debe mostrar un mensaje de {string}")
    public void verificarMensajeCargaExitosa(String mensajeEsperado) {
        Assert.assertEquals(mensajeEsperado, page.obtenerMensajeCarga());
    }

    @Then("el documento cargado debe aparecer en la lista de documentos")
    public void verificarDocumentoEnLista() {
        Assert.assertTrue(page.verificarDocumentoEnLista());
    }
}