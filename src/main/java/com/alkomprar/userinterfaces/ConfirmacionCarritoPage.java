package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionCarritoPage {
	public static final Target CONTINUAR_ELEMENTO = Target.the("Boton continuar del carrito").locatedByFirstMatching("//button[contains(text(), 'Continuar comprando')]");
	public static final Target CERRAR_MODAL = Target.the("Cerrar modal").locatedByFirstMatching("//button[@class='close']");
}
