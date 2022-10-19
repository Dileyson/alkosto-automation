package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleArticuloPage {
	public static final Target DIV_PRIMER_ELEMENTO = Target.the("Primer elemento").locatedByFirstMatching("//h2[@class='product__information--name']");
	public static final Target AGREGAR_ELEMENTO_CARRITO = Target.the("Agregar elemento al carrito").locatedByFirstMatching("//button[contains(text(), 'Agregar al carrito')]");
	public static final Target FILTRO = Target.the("Filtro").locatedBy("(//div[@class=\"float-select js-float-select js-float-group active-click\"])[1]");
	public static final Target MAYOR_A_MENOR = Target.the("Mayor a menor").locatedBy("(//*[contains(text(),\"Precio: mayor a menor\")])[1]");
	public static final Target VER_DETALLE = Target.the("Ver detalle").located(By.id("js-view-details-013803306354"));
	public static final Target RESUMEN_DEL_PRODUCTO = Target.the("Resumen del producto").locatedBy("(//*[contains(text(),\"Resumen del producto\")])[1]");

}
