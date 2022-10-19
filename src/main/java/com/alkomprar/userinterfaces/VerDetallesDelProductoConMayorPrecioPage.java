package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerDetallesDelProductoConMayorPrecioPage {
	public static final Target EDITAR_NOMBRE = Target.the("Editar nombres").locatedBy("(//*[contains(text(),\"Editar\")])[1]");
	public static final Target APELLIDO_PERFIL = Target.the("Apellido").located(By.id("profile.lastName"));
	public static final Target GUARDAR_CAMBIOS = Target.the("Guardar cambios").locatedBy("(//*[contains(text(),\"Guarda\")])[1]");
	public static final Target TU_PERFIL_HA_SIDO_GUARDADO = Target.the("Tu perfil ha sido guardado").locatedBy("//div[@class=\"update-profile__message alert success update-profile__message--show\"]");
	public static final Target CAMARA = Target.the("Cámara").locatedBy("(//a[@title=\"Cámaras\"])[1]");
	public static final Target CAMARA_FOTOGRAFICA = Target.the("Cámara fotográfica").locatedBy("(//img[@class=\"icono\"])[1]");
	}
