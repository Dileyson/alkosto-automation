package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.IniciarSesion;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static com.alkomprar.userinterfaces.iniciarSesionPage.INFORMACION_PERSONAL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinitions {

    @Cuando("{string} quiere iniciar sesion")
    public void rodolfoQuiereIniciarSesion(String actor, DataTable dataTable) {
        List<String> datos = dataTable.row(0);
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                IniciarSesion.con(datos)
        );
    }
    @Entonces("debe ver su informacion personal")
    public void debeVerSuInformacion() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(INFORMACION_PERSONAL).isEnabled()
        );
    }
}
