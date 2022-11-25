
Feature: Consultar detalle de Beneficios por colaboradores
  Yo como Gestor Senior
  quiero consultar los detalles de los Beneficios vigentes
  para validar Beneficios

  Background: Inicio Sesión como Gestor Senior
    Given que el Gestor Senior de Beneficios inicia sesion con usuario jd.caraballoo@gmail.com con clave David2820*

  Scenario: Consultar Beneficios NOMBRE Existente
    When el consulta beneficios por nombre ANDRES FELIPE CASTRILLON SUCERQUIA
    Then se veran los beneficios en pantalla


  Scenario: Consultar Beneficios por CEDULA
    When el consulta beneficios de cedula 1037584091
    Then se veran los beneficios del colaborador en pantalla