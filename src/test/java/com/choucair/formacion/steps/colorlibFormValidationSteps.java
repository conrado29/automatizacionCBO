package com.choucair.formacion.steps;

import java.util.List;
import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;
import net.thucydides.core.annotations.Step;


public class colorlibFormValidationSteps {

	ColorlibFormValidationPage colorlibFormValidationPage;
	
	@Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {
		colorlibFormValidationPage.Required(data.get(id).get(0).trim());
		colorlibFormValidationPage.Sport1(data.get(id).get(1).trim());
		colorlibFormValidationPage.Sport2(data.get(id).get(2).trim());
		colorlibFormValidationPage.Sport2(data.get(id).get(3).trim());
		colorlibFormValidationPage.Url(data.get(id).get(4).trim());
		colorlibFormValidationPage.Email(data.get(id).get(5).trim());
		colorlibFormValidationPage.Pass1(data.get(id).get(6).trim());
		colorlibFormValidationPage.Pass2(data.get(id).get(7).trim());
		colorlibFormValidationPage.Minsize(data.get(id).get(8).trim());
		colorlibFormValidationPage.Maxsize(data.get(id).get(9).trim());
		colorlibFormValidationPage.Number(data.get(id).get(10).trim());
		colorlibFormValidationPage.Ip(data.get(id).get(11).trim());
		colorlibFormValidationPage.Date(data.get(id).get(12).trim());
		colorlibFormValidationPage.Past(data.get(id).get(13).trim());
		colorlibFormValidationPage.Validate();
	}
	
	// verificar si marca algun campo vasio o no
	@Step 
	public void verificar_ingreso_de_datos() {
		colorlibFormValidationPage.sin_errores();
	}
	
	@Step
	public void verificar_ingresos_de_error() {
		colorlibFormValidationPage.con_errores();
	}
	

}
