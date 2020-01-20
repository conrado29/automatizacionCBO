package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ColorlibFormValidationPage extends PageObject {
	@FindBy(xpath="//INPUT[@id='req']")
	public WebElementFacade txtRequired;
	
	@FindBy(xpath="//SELECT[@id='sport']")
	public WebElementFacade cmbSport1;
	
	@FindBy(xpath="//SELECT[@id='sport2']")
	public WebElementFacade cmbSport2;

	@FindBy(xpath="//INPUT[@id='url1']")
	public WebElementFacade txtUrl;

	@FindBy(xpath="//INPUT[@id='email1']")
	public WebElementFacade txtEmail;

	@FindBy(xpath="//INPUT[@id='pass1']")
	public WebElementFacade txtPass1;

	@FindBy(xpath="//INPUT[@id='pass2']")
	public WebElementFacade txtPass2;

	@FindBy(xpath="//INPUT[@id='minsize1']")
	public WebElementFacade txtMinsize;

	@FindBy(xpath="//INPUT[@id='maxsize1']")
	public WebElementFacade txtMaxsize;

	@FindBy(xpath="//INPUT[@id='number2']")
	public WebElementFacade txtNumber;

	@FindBy(xpath="//INPUT[@id='ip']")
	public WebElementFacade txtIp;

	@FindBy(xpath="//INPUT[@id='date3']")
	public WebElementFacade txtDate;

	@FindBy(xpath="//INPUT[@id='past']")
	public WebElementFacade txtDateEarlier;

	@FindBy(xpath="(//INPUT[@type='submit'])[1]")
	public WebElementFacade btnValidate;
	
	@FindBy(xpath="(//DIV[@class='formErrorContent'])[1]")
	public WebElementFacade globoInformativo;

//metodos para las acciones en los elementos
	
public void Required(String datoPrueba) {
	txtRequired.click();
	txtRequired.clear();
	txtRequired.sendKeys(datoPrueba);
	}

public void Sport1(String datoPrueba) {
	cmbSport1.click();
	cmbSport1.selectByVisibleText(datoPrueba);
	}

public void Sport2(String datoPrueba) {
	cmbSport2.click();
	cmbSport2.selectByVisibleText(datoPrueba);
	}

public void Url(String datoPrueba) {
	txtUrl.click();
	txtUrl.clear();
	txtUrl.sendKeys(datoPrueba);
	}

public void Email(String datoPrueba) {
	txtEmail.click();
	txtEmail.clear();
	txtEmail.sendKeys(datoPrueba);
	}

public void Pass1(String datoPrueba) {
	txtPass1.click();
	txtPass1.clear();
	txtPass1.sendKeys(datoPrueba);
	}

public void Pass2(String datoPrueba) {
	txtPass2.click();
	txtPass2.clear();
	txtPass2.sendKeys(datoPrueba);
	}

public void Minsize(String datoPrueba) {
	txtMinsize.click();
	txtMinsize.clear();
	txtMinsize.sendKeys(datoPrueba);
	}

public void Maxsize(String datoPrueba) {
	txtMaxsize.click();
	txtMaxsize.clear();
	txtMaxsize.sendKeys(datoPrueba);
	}

public void Number(String datoPrueba) {
	txtNumber.click();
	txtNumber.clear();
	txtNumber.sendKeys(datoPrueba);
	}

public void Ip(String datoPrueba) {
	txtIp.click();
	txtIp.clear();
	txtIp.sendKeys(datoPrueba);
	}

public void Date(String datoPrueba) {
	txtDate.click();
	txtDate.clear();
	txtDate.sendKeys(datoPrueba);
	}

public void Past(String datoPrueba) {
	txtDateEarlier.click();
	txtDateEarlier.clear();
	txtDateEarlier.sendKeys(datoPrueba);
	}

public void Validate() {
	btnValidate.click();
}

public void sin_errores() {
	assertThat(globoInformativo.isCurrentlyVisible(), is(false));
}

public void con_errores() {
	assertThat(globoInformativo.isCurrentlyVisible(), is(true));
}


}






