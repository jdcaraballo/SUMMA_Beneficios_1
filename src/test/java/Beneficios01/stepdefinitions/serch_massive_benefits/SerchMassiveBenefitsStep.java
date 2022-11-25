package Beneficios01.stepdefinitions.serch_massive_benefits;


import Beneficios01.interactions.HomePage;
import Beneficios01.questions.validate_massive_benefits.ValidateRecordNoSerch;
import Beneficios01.questions.validate_massive_benefits.ValidateRecordSerch;
import Beneficios01.tasks.masive_benefits.*;
import Beneficios01.tasks.login.LoginOk;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class SerchMassiveBenefitsStep {

    @Given("^que el Gestor Senior de Beneficios inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginOk.login(user, key));
    }

    @When("^el consulta creditos por nombre (.*)$")
    public void consultaCreditosPorNombre(String name) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewMassiveBenefitsByName.viewMassiveBenefitsByName(name)
        );
        }

    @Then("^se veran los beneficios en pantalla$")
    public void seVerancreditosCompaniaEnPantalla() {
                theActorInTheSpotlight().should(seeThat(ValidateRecordSerch.inPage()));
    }

    @When("^el consulta beneficios de cedula (.*)$")
    public void elConsultaCreditoDeCedula(String id) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewMassiveBenefitsByIdOk.viewMassiveBenefitsByIdOk(id)
        );
    }

    @Then("^se veran los beneficios del colaborador en pantalla$")
    public void seVeraCreditoEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateRecordSerch.inPage()));
    }

    @When("^el consulta beneficios por cedula No existente (.*)$")
    public void elConsultaBeneficioPorCedula(String idNotFound) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewMassiveBenefitsByIdNoOk.viewMassiveBenefitsByIdNoOk(idNotFound));
    }

    @Then("^se vera pantalla SIN carga de beneficios$")
    public void noSeVeraBeneficioEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateRecordNoSerch.inPage()));
    }

}
