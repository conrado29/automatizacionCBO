package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;
public class PopupValidationSteps {
	
	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;

	
	@Step
	public void login_colorlib(String strUsuario, String strPass) {
		//abrir navegador con URL de preuba
		colorlibLoginPage.open();
		
		//ingresa usuario demo
		//ingresa usuario demo
		// click en boton Sign in
		
		colorlibLoginPage.IngresarDatos(strUsuario, strPass);
		//verificar la Autenticacion(label en home)
		
		colorlibLoginPage.VerificaHome();
	}
	
	@Step
	public void ingresar_form_validation() {
		colorlibMenuPage.menuFormValidation();
	}
}
