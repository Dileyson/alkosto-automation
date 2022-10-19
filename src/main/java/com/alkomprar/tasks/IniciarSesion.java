package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.util.List;

import static com.alkomprar.userinterfaces.iniciarSesionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task
{
    private List<String> datos;

    public IniciarSesion(List<String> datos){
        this.datos=datos;
    }

    public static Performable con(List<String> datos){
        return instrumented(IniciarSesion.class, datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        int i =0;
        actor.attemptsTo(
                Click.on(MI_CUENTA),
                Click.on(CORREO),
                Enter.keyValues(datos.get(i)).into(CORREO),
                Click.on(BOTON_CONTINUAR_LOGIN),
                Enter.keyValues(datos.get(i++)).into(NOMBRE),
                Enter.keyValues(datos.get(i++)).into(APELLIDO),
                Click.on(TELEFONO),
                Enter.keyValues(datos.get(++i)).into(TELEFONO),
                JavaScriptClick.on(ACEPTAR_TERMINOS_Y_CONDICIONES),
                JavaScriptClick.on(BOTON_CONTINUAR),
                Click.on(MI_CUENTA2)



        );
    }
}
