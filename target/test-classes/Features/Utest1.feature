Feature: Yo como usuario de Utest, deseo crearme una cuenta de usuario
  @Stories @Scenario1
    Scenario Outline: Ingreso exitoso a la plataforma Utest
      Given Como usuario deseo registrarme en la pagina de Utest
      When Ingrese toda la información requerida <Nombre>, <Apellido>, <Email>, <Año>, <Mes>, <Dia>
      Then Se completa el registro de manera exitosa
    Examples:
      |Nombre|Apellido|Email|Año|Mes|Dia|
      |Javier|Plata   |jjimenezp@pibox.app|1995|October|21|
