package co.com.automationtesting.definitions;

import co.com.automationtesting.steps.AutenticacionSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AutenticacionDefinitions {

    @Steps
    AutenticacionSteps autenticacionSteps;

    @Given("^Yo ingreso a la plataforma de autenticacion en automationtesting$")
    public void yo_ingreso_a_la_plataforma_de_autenticacion_en_automationtesting() {
        autenticacionSteps.abrirNavegador();
    }

    @When("^Yo me autentico en usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void yo_me_autentico_en_usuario_y_clave(String usuario, String clave) {
        autenticacionSteps.diligenciarDatosAutenticacion(usuario, clave);
    }

    @Then("^Yo verifico que se muestre el saludo de \"([^\"]*)\"$")
    public void yo_verifico_que_se_muestre_el_saludo_de(String saludo) {
        autenticacionSteps.validarSaludo(saludo);
    }
}
