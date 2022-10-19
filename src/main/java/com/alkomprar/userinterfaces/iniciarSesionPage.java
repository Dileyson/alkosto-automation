package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class iniciarSesionPage {
	public static final Target MI_CUENTA = Target.the("Mi cuenta").located(By.id("js-myaccount-header"));
	public static final Target MI_PERFIL = Target.the("Mi perfil").locatedBy("(//*[contains(text(),\"Mi Perfil\")])[1]");
	public static final Target CORREO = Target.the("Correo").located(By.id("js-login-email"));
	public static final Target BOTON_CONTINUAR_LOGIN = Target.the("Botón continuar").located(By.id("js-login-continue"));
	public static final Target NOMBRE = Target.the("Nombre").located(By.id("register.firstName"));
	public static final Target APELLIDO = Target.the("Apellido").located(By.id("register.lastName"));
	public static final Target TELEFONO = Target.the("Telefono").located(By.id("register.mobileNumber"));
	public static final Target ACEPTAR_TERMINOS_Y_CONDICIONES = Target.the("Aceptar terminos y condiciones").located(By.id("registerChkTermsConditions"));
	public static final Target BOTON_CONTINUAR = Target.the("Botón continuar").locatedBy("(//*[contains(text(),\"Continuar\")=\"submit\"])[1]");
	public static final Target MI_CUENTA2 = Target.the("Mi cuenta 2").locatedBy("(//span[@class=\"link\"])[1]");
	public static final Target INFORMACION_PERSONAL = Target.the("Información personal").locatedBy("//*[contains(text(),\"Información personal\")]");
}