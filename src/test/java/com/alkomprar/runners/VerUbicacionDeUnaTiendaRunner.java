package com.alkomprar.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/ver_ubicacion_de_una_tienda.feature",
		glue = {"com.alkomprar.stepdefinitions"},
		snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class VerUbicacionDeUnaTiendaRunner {

}
