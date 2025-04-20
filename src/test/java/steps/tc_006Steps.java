package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;
import pages.tc_006Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page page;

    public tc_006Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_006Page.class);
    }

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstáEnLaPáginaDeCargaDeDocumentos() {
        driver.get("URL_DE_LA_PAGINA_DE_CARGA_DE_DOCUMENTOS");
    }

    @When("el usuario selecciona documentos en formatos PDF, DOCX y TXT")
    public void elUsuarioSeleccionaDocumentosEnFormatosPDFDOCXYTXT() {
        assertTrue(page.seleccionarDocumentos());
    }

    @Then("el sistema debe reconocer y soportar los formatos PDF, DOCX y TXT sin inconvenientes")
    public void elSistemaDebeReconocerYSoportarLosFormatosPDFDOCXYTXTSinInconvenientes() {
        assertTrue(page.verificarFormatosSoportados());
    }

    @When("el usuario carga los documentos uno tras otro")
    public void elUsuarioCargaLosDocumentosUnoTrasOtro() {
        page.cargarDocumentos();
    }

    @Then("todos los documentos deben ser cargados y listados correctamente")
    public void todosLosDocumentosDebenSerCargadosYListadosCorrectamente() {
        assertTrue(page.verificarDocumentosCargados());
    }
}