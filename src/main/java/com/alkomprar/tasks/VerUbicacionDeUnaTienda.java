package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.alkomprar.userinterfaces.MenuPage.*;
import static com.alkomprar.userinterfaces.UbicacionPage.CIUDAD;
import static com.alkomprar.userinterfaces.UbicacionPage.VER_MAPA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerUbicacionDeUnaTienda implements Task
{
    private String ciudad;
    private String tienda;

    public VerUbicacionDeUnaTienda(String categoria, String nombreTienda){

        this.ciudad =categoria;
        this.tienda =nombreTienda;
    }

    public static Performable en(String categoria, String nombreTienda){
        return instrumented(VerUbicacionDeUnaTienda.class, categoria, nombreTienda);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUESTRAS_TIENDAS.of(ciudad)),
                Click.on(CIUDAD.of(ciudad)),
                JavaScriptClick.on(VER_MAPA.of(ciudad, tienda))


        );
    }
}
