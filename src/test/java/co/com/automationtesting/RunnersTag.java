package co.com.automationtesting;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (features="src/test/resources/features/autenticacion.feature",
        glue= "co.com.automationtesting.definitions",
        snippets=SnippetType.UNDERSCORE )

public class RunnersTag {
}
