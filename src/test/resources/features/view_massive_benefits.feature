
Feature: Consultar Beneficios de colaborador
  Yo como Gestor Senior
  quiero consultar los beneficios vigentes por colaborador
  para validar en beneficios de cada colaborador

Background: Inicio Sesión como Gestor Senior
  Given que el Gestor Senior de Beneficios inicia sesion con usuario jd.caraballoo@gmail.com con clave David2820*

  Scenario: Consultar Crédito NOMBRE Existente
    When el consulta creditos por nombre Claudia Milena
    Then se veran los beneficios en pantalla

    Scenario: Consultar Crédito por CEDULA
    When el consulta beneficios de cedula 1036608062
    Then se veran los beneficios del colaborador en pantalla

    Scenario: Consultar beneficios por CEDULA NO Existente
    When el consulta beneficios por cedula No existente 10366080623
    Then se vera pantalla SIN carga de beneficios
