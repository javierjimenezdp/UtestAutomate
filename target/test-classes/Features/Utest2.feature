Feature: Yo como usuario de Utest, deseo continuar con el regustro de una cuenta de usuario
  @Stories2 @Scenario2
  Scenario Outline: Ingreso exitoso a la plataforma Utest
    Given Como usuario deseo registrarme en la pagina de Utest
    And Ingrese toda la información requerida <Nombre>, <Apellido>, <Email>, <Año>, <Mes>, <Dia>
    And Se completa el registro de manera exitosa
    When Ingrese toda la información reuquerida para la página 2 <Ciudad>, <CodigoPostal>, <Pais>
    Then Se completa el registro de 2da manera exitosa
    Examples:
      |Nombre|Apellido|Email|Año|Mes|Dia|Ciudad|CodigoPostal|Pais|
      |Javier|Plata   |jjimenezp@pibox.app|1995|October|21|Medellin|050035|Colombia|

