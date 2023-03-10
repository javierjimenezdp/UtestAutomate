Feature: Yo como usuario de Utest, deseo continuar con la 3ra parte del registro de una cuenta de usuario
  @Stories3 @Scenario3
  Scenario Outline: Ingreso exitoso a la plataforma Utest
    Given Como usuario deseo registrarme en la pagina de Utest
    And Ingrese toda la información requerida <Nombre>, <Apellido>, <Email>, <Año>, <Mes>, <Dia>
    And Se completa el registro de manera exitosa
    And Ingrese toda la información reuquerida para la página 2 <Ciudad>, <CodigoPostal>, <Pais>
    And Se completa el registro de 2da manera exitosa
    When ingrese toda la información requerida para la página 3 <Computadora>, <versión>, <languaje>, <mobile>, <modelo>, <SO>
    Then Se completa el registro de 3ra manera exitosa
    Examples:
      |Nombre|Apellido|Email|Año|Mes|Dia|Ciudad|CodigoPostal|Pais|Computadora|versión|languaje|mobile|modelo|SO|
      |Javier|Plata|javierjimenezdp10@gmail.com|1995|October|21|Medellin|050035|Colombia|linux|Ubuntu|Spanish|Asus|Transformer|Android 4.0|