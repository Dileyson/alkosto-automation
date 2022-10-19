package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.DetalleArticuloPage.*;
import static com.alkomprar.userinterfaces.MenuPage.CATEGORIA;
import static com.alkomprar.userinterfaces.MenuPage.PRIMER_SUB_CATEGORIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarProductoConMayorPrecio implements Task
{
    private String categoria;

    public BuscarProductoConMayorPrecio(String categoria){
        this.categoria=categoria;
    }

    public static Performable con(String categoria){
        return instrumented(BuscarProductoConMayorPrecio.class, categoria);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        int i =0;
        actor.attemptsTo(
                MoveMouse.to(CATEGORIA.of(categoria)),
                WaitUntil.the(PRIMER_SUB_CATEGORIA.of(categoria), isVisible()),
                Click.on(PRIMER_SUB_CATEGORIA.of(categoria)),
                Click.on(FILTRO),
                Click.on(MAYOR_A_MENOR),
                Click.on(VER_DETALLE)


        );
    }
}
