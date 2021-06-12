Feature: Autenticacion en la plataforma de automationtesting
  Description: El usuario debe poder realizar la autenticacion dentro
  del sitio de manera exitosa en algunos casos fallidos.

  @AutenticacionExitosa
   Scenario: Diligenciamiento exitoso de autenticacion
    Given Yo ingreso a la plataforma de autenticacion en automationtesting
    When Yo me autentico en usuario "usuarionuevo1@correo.com" y clave "U12345n+123-bn"
    Then Yo verifico que se muestre el saludo de "Hello"