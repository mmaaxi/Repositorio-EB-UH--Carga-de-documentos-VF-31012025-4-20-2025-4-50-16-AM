package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;

import pages.tc_010Page;

public class tc_010Steps {
    private WebDriver driver;
    private tc_010Page documentoPage;

    public tc_010Steps() {
        this.driver = Hooks.getDriver();
        documentoPage = PageFactory.initElements(driver, tc_010Page.class);
    }

    @Given("el usuario está en la página de inicio")
    public void el_usuario_esta_en_la_pagina_de_inicio() {
        driver.get("http://www.example.com/inicio");
    }

    @When("navega hasta el módulo de carga de documentos")
    public void navega_hasta_el_modulo_de_carga_de_documentos() {
        documentoPage.clickOnDocumentUploadModule();
    }

    @Then("la interfaz es amigable, intuitiva y accesible")
    public void la_interfaz_es_amigable_intuitiva_y_accesible() {
        assert(documentoPage.isDocumentUploadInterfaceAccessible());
    }

    @Given("el usuario está en el módulo de carga de documentos")
    public void el_usuario_esta_en_el_modulo_de_carga_de_documentos() {
        driver.get("http://www.example.com/modulo-carga-documentos");
    }

    @When("carga un documento utilizando la interfaz gráfica")
    public void carga_un_documento_utilizando_la_interfaz_grafica() {
        documentoPage.uploadDocument("archivo.pdf");
    }

    @Then("la acción se ejecuta sin errores y la retroalimentación visual es clara y consistente")
    public void la_accion_se_ejecuta_sin_errores_y_la_retroalimentacion_visual_es_clara_y_consistente() {
        assert(documentoPage.isDocumentUploadSuccessful());
    }
}