package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage {
	public static final Target CATEGORIA = Target.the("Categoria {0} del menu").locatedBy("//li[@data-category='{0}']/a[@title='{0}']");
	public static final Target PRIMER_SUB_CATEGORIA = Target.the("Primer subcategoria de {0}").locatedBy("//li[@data-category='{0}']//div[@data-subcategory]//li[@class='main-navigation__subcategory__items__subitems']/ul/li/a[@data-name]");
	//public static final Target PRIMER_SUB_CATEGORIA = Target.the("Primer subcategoria de {0}").locatedBy("//a[@class=\"main-navigation__subcategory__subitem__label js-megamenu-datalayer-product\"]//../a[1]");
	//public static final Target PRIMER_SUB_CATEGORIA = Target.the("Primer subcategoria de {0}").locatedByFirstMatching("//a[@title=\"Marca\"]//..//a[@data-name]");
	public static final Target CARRITO = Target.the("Primer subcategoria de {0}").locatedByFirstMatching("//a[@href='/cart']");
	public static final Target TXT_BUSCAR = Target.the("Buscador").locatedByFirstMatching("//input[@name='text']");
	public static final Target BUT_BUSCAR = Target.the("Boton Buscar").locatedBy("//button[@id='js-search-button']");
	public static final Target NUESTRAS_TIENDAS = Target.the("Nuestras tiendas").locatedBy("(//li[@class=\"hidden-icon-desktop loaded-icon\"])[1]");


}
