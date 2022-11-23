
Feature: Consultar credito de colaboradores
  Yo como Gestor Senior
  quiero consultar los créditos vigentes
  para validar en contabilidad

Background: Inicio Sesión como Gestor Senior
  Given que el Gestor Senior de Creditos inicia sesion con usuario prueba.test.qa.123@gmail.com con clave Prueba1234

  Scenario: Consultar Crédito COMPAÑÍA Existente
    When el consulta creditos por compania SUMMA
    Then se veran los creditos por Conpania en pantalla

  Scenario: Consultar Crédito COMPAÑÍA NO Existente
    When el consulta credito por compania SUMMASDF NO Existente
    Then se vera pantalla SIN carga de creditos

    Scenario: Consultar Crédito por IDENTIFICACION
    When el consulta credito de cedula 1014221461
    Then se vera credito de 1014221461 en pantalla

#  Scenario: Consultar Crédito por NOMBRE EXISTENTE
#    When el consulta credito de JUAN DAVID
#    Then se veran los creditos por Nombre en pantalla
#
#
#  Scenario: Consultar Crédito por APELLIDO
#    When el consulta credito de
#    Then se veran los creditos por Apellido en pantalla