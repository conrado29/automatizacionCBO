#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)






#Sample Feature Definition Template
@Regresion
Feature: Formulario Popup Validation 
El usuario debe poder ingresar al formulario los datos requeridos.
Cada campo del formulario realiza validaciones de obligatoriedad,
longitud y formato, el sistema debe presentar las validaciones respectivas
para cada campo a traves un globo informativo.

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario Popup Validation,
  					no se presenta ningun mensaje de validacion
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Popup Validation
    		| Requied | Select | MultipleS1 | MultipleS2 |        Url      | E-mail  | Password | ConfirmP | Minimum | Maximum | Number |    Ip   |    Date    | DateEarlier |
    		| prueba  | Golf   |    Golf    | Football   | http://hola.com | a@a.com |  valor1  |  valor1  | 123456  |  123456 | 33.90  | 0.0.0.0 | 2020-02-10 | 2012/08/16  |
    		| aaaaaa  | Tennis |    Tennis  |    Golf    | http://aaaa.com | a@a.com |  valor1  |  valor1  | 123456  |  127776 | 33.90  | 0.0.0.0 | 2020-02-10 | 2012/08/16  |
    		| valor   |Football|    Golf    |   Tennis   | http://hola.com | a@a.com |  valor1  |  valor1  | 123458  |  123456 | 33.90  | 0.0.0.0 | 2020-02-10 | 2012/08/16  |
    Then Verifico ingreso exitoso

 @CasoError
  Scenario: Diligenciamiento exitoso del formulario Popup Validation,
  					no se presenta ningun mensaje de validacion
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Popup Validation
    		| Requied | Select | MultipleS1 | MultipleS2 |        Url      |      E-mail       | Password | ConfirmP | Minimum | Maximum | Number |    Ip   |    Date    | DateEarlier |
    		| prueba  | Golf   | Football   |   Tennis  | http:/hola.com  |      a@a.com      |  valor1  |  valor1  | 123456  |  123456 |-43.90  | 0.0.0.0 | 2010-02-10 | 2012/08/16  |
    		|         |Football|    Golf    | Football  | http://hola.com |      a@a.com      |  valor2  |  ggfgvc  | 1453455 |  123456 | 33.90  | 0.0.0.0 | 2020-02-10 | 2012/08/16  |
    		| prueba  | Tennis |  Football  |   Tennis  |     ://hola.com |      a@a.com      |  valor3  |  valor1  | 123456  |  123456 | 33.90  | 0.0.0.0 | 2020-02-10 | 2012/08/16  |
    		| cccccc  | Tennis |    Golf    |  Tennis   | http://hola.com |aprueba@prueba.com |  valor4  |  gtrsff  | 123456  | 1111111 | 33.90  | 0.0.0.0 | 2000-01-10 | 2012/08/16  |
    		| aaaaa.  | Tennis |    Tennis  | Football  | http://hola.    |aprueba@prueba.com |  valor5  |  346e35  | 123456  | 1234567 | 33.90  | 0.0.0.0 | 2020-02-10 | 2012/08/16  |
    Then diligencio que se presentan globos informativos de validacion

 
