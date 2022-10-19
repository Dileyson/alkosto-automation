package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.VerUbicacionDeUnaTienda;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.alkomprar.userinterfaces.UbicacionPage.COMO_LLEGAR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VerUbicacionDeUnaTiendaStepDefinitions {

    @Cuando("{string} quiere buscar una tienda {string}, {string}")
    public void quiereBuscarUnaTienda(String actor, String ciudad, String tienda) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                VerUbicacionDeUnaTienda.en(ciudad,tienda));
    }

    @Entonces("debo ver la ubicacion en el mapa")
    public void deboVerLaUbicacionEnElMapa() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(COMO_LLEGAR).isEnabled()
        );
    }
}
