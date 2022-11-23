
Feature: LOGIN
  Yo como usuario
  quiero iniciar sesion en el portal creditos
  para navegar en la pantalla del modulo de creditos

  Scenario: LOGIN
    Given que el abre pagina modulo creditos
    When el inicia sesion con usuario prueba.test.qa.123@gmail.com con clave Prueba1234
    Then se vera pantalla de inicio del gestor senior