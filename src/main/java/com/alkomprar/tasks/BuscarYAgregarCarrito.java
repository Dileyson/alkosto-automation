package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.actions.type.TypeValue;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.AGREGAR_ELEMENTO_CARRITO;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.DIV_PRIMER_ELEMENTO;
import static com.alkomprar.userinterfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarYAgregarCarrito implements Task {
    private String item;

    public BuscarYAgregarCarrito(String item) {
        this.item = item;
    }

    public static Performable elemento(String item) {
        return instrumented(BuscarYAgregarCarrito.class, item);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue(item).into(TXT_BUSCAR),
                DoubleClick.on(TXT_BUSCAR),
                Hit.the(Keys.ENTER).into(TXT_BUSCAR),
                Scroll.to(DIV_PRIMER_ELEMENTO).andAlignToTop(),
                WaitUntil.the(AGREGAR_ELEMENTO_CARRITO, isClickable()),
                Click.on(AGREGAR_ELEMENTO_CARRITO),
                WaitUntil.the(CERRAR_MODAL, isClickable()),
                Click.on(CERRAR_MODAL)
        );
    }
}
