package co.com.automationtesting.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static co.com.automationtesting.utilities.Utilidades.*;
import static org.openqa.selenium.By.*;

@DefaultUrl("http://practice.automationtesting.in/my-account/")
public class AutenticacionPageObject extends PageObject {

    private final By usernameFieldLocator = id("username");
    private final By passwordFieldLocator = id("password");

    private final By mensajePaginaLblLocator = xpath("//div[@class='woocommerce-MyAccount-content']//p[1]");

    public void autenticar(String usuario, String clave) {
        typeInField(getDriver().findElement(usernameFieldLocator), usuario);
        typeInField(getDriver().findElement(passwordFieldLocator), clave);
        clickElement(getDriver(), "login", "name");
    }

    public void comprobarResultado(String saludo) {
        WebElement mensajePagina = getDriver().findElement(mensajePaginaLblLocator);
        Assert.assertTrue(mensajePagina.getText().contains(saludo));
    }

    @Override
    public WebDriver getDriver() {
        return super.getDriver();
    }
}
