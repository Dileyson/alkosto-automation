package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.AGREGAR_ELEMENTO_CARRITO;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.DIV_PRIMER_ELEMENTO;
import static com.alkomprar.userinterfaces.MenuPage.CATEGORIA;
import static com.alkomprar.userinterfaces.MenuPage.PRIMER_SUB_CATEGORIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarAlCarrito implements Task {
    private String categoria;

    public AgregarAlCarrito(String categoria) {
        this.categoria = categoria;
    }

    public static Performable elemento(String categoria) {
        return instrumented(AgregarAlCarrito.class, categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(CATEGORIA.of(categoria)),
                WaitUntil.the(PRIMER_SUB_CATEGORIA.of(categoria), isVisible()),
                Click.on(PRIMER_SUB_CATEGORIA.of(categoria)),
                Scroll.to(DIV_PRIMER_ELEMENTO).andAlignToTop(),
                WaitUntil.the(AGREGAR_ELEMENTO_CARRITO, isClickable()),
                Click.on(AGREGAR_ELEMENTO_CARRITO),
                WaitUntil.the(CERRAR_MODAL, isClickable()),
                Click.on(CERRAR_MODAL)
        );
    }
}
