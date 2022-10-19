package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.BuscarProductoConMayorPrecio;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.alkomprar.userinterfaces.DetalleArticuloPage.RESUMEN_DEL_PRODUCTO;
import static com.alkomprar.userinterfaces.VerDetallesDelProductoConMayorPrecioPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarProductoConMayorPrecioStepDefinitions {


    @Cuando("{string} quiere buscar un producto {string}")
    public void quiereBuscarUnProducto(String actor, String categoria ) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                BuscarProductoConMayorPrecio.con(categoria));
    }

    @Entonces("debe ver el producto con mayor precio")
    public void debeVerElProductoConMayorPrecio() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESUMEN_DEL_PRODUCTO).isEnabled()
        );
    }
}
