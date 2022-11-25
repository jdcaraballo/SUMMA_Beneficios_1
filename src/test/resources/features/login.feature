
Feature: LOGIN
  Yo como usuario
  quiero iniciar sesion en el portal Beneficios
  para navegar en la pantalla del modulo de Beneficios

  Background: abre pagina de beneficios
  Given que el abre pagina modulo Beneficios

  Scenario: LOGIN OK
    When el inicia sesion con usuario jd.caraballoo@gmail.com con clave David2820*
    Then se vera pantalla de inicio del gestor senior

  Scenario: LOGIN No OK
    When el intenta iniciar sesion con usuario inexistente j.caraballoo@gmail.com con clave David28
    Then se vera error de ingreso en pantalla de inicio del gestor senior