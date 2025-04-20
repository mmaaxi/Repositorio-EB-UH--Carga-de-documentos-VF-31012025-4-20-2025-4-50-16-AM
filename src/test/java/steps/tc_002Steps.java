package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page;

    @Given("El usuario está en la página de carga de archivos")
    public void el_usuario_está_en_la_página_de_carga_de_archivos() {
        driver = new ChromeDriver();
        page = new tc_002Page(driver);
        driver.get("http://ejemplo.com/carga");
    }

    @When("El usuario selecciona un archivo vacío")
    public void el_usuario_selecciona_un_archivo_vacío() {
        page.seleccionarArchivoVacio();
    }

    @And("El usuario hace clic en 'Cargar'")
    public void el_usuario_hace_clic_en_Cargar() {
        page.clicEnCargar();
    }

    @Then("Se muestra un mensaje de error {string}")
    public void se_muestra_un_mensaje_de_error(String mensajeError) {
        assert page.obtenerMensajeError().equals(mensajeError);
        driver.quit();
    }
}