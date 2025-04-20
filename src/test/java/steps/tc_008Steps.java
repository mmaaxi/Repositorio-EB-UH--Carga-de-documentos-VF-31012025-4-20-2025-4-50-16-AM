import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page page;

    @Given("que el sistema está en operación normal")
    public void sistema_en_operacion_normal() {
        page = PageFactory.initElements(driver, tc_008Page.class);
        driver.get("url_del_sistema");
    }

    @When("simulo la carga de múltiples documentos simultáneamente")
    public void simulo_carga_documentos() {
        page.simularCargaDocumentos();
    }

    @Then("el sistema mantiene la estabilidad y carga todos los documentos sin degradación del rendimiento")
    public void validar_estabilidad() {
        assert page.validarEstabilidad();
    }

    @Then("registro los tiempos de respuesta y procesamiento")
    public void registro_tiempos_respuesta() {
        page.registrarTiemposRespuesta();
    }

    @Then("los tiempos se encuentran dentro del rango aceptable definido en los criterios de rendimiento")
    public void validar_tiempos() {
        assert page.validarTiempos();
    }
}