package co.com.automationtesting.steps;

import co.com.automationtesting.pageobjects.AutenticacionPageObject;
import net.thucydides.core.annotations.Step;

public class AutenticacionSteps {

    AutenticacionPageObject autenticacionPageObject;

    @Step
    public void abrirNavegador() {
        autenticacionPageObject.open();
    }

    @Step
    public void diligenciarDatosAutenticacion(String usuario, String clave) {
        autenticacionPageObject.autenticar(usuario, clave);
    }

    @Step
    public void validarSaludo(String saludo) {
        autenticacionPageObject.comprobarResultado(saludo);
    }
}
