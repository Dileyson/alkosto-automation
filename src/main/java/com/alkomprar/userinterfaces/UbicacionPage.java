package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UbicacionPage {
	public static final Target CIUDAD = Target.the("Ciudad {0}").locatedBy("//a[@href=\"#{0}\"]");
	public static final Target VER_MAPA = Target.the("Ver tienda en el mapa").locatedBy("(//a[@href=\"/nuestra-compania/tiendas/{0}/{1}/c/{1}\"])[1]");
	public static final Target COMO_LLEGAR = Target.the("Dirección de la tienda").locatedBy("//*[contains(text(),\"Como llegar\")]");
}