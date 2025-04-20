import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_009Page;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page page;

    public tc_009Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc_009Page.class);
    }

    @Given("el usuario está en la página de carga de documentos")
    public void usuarioEnPaginaCargaDocumentos() {
        page.navigateToPage();
    }

    @When("intenta cargar un documento con código malicioso")
    public void intentaCargarDocumentoConCodigoMalicioso() {
        page.uploadMaliciousDocument();
    }

    @Then("el sistema bloquea la carga y notifica al usuario")
    public void sistemaBloqueaCargaYNotificaUsuario() {
        page.verifyUploadBlockedAndNotified();
    }

    @Given("un incidente de carga de documento con inyección de código ha ocurrido")
    public void incidenteCargaDocumentoOcurrido() {
        // Mock or set up a known incident in logs
    }

    @When("analizo el log de seguridad")
    public void analizoLogDeSeguridad() {
        page.analyzeSecurityLog();
    }

    @Then("el incidente debe estar registrado y el administrador ha sido notificado")
    public void incidenteRegistradoYNotificado() {
        page.verifyIncidentLoggedAndNotified();
    }
}