package Beneficios01.stepdefinitions.serch_detail_benefit;


import Beneficios01.interactions.HomePage;
import Beneficios01.questions.serch_detail_benefit.ValidateDetailBenefit;
import Beneficios01.questions.validate_massive_benefits.ValidateRecordNoSerch;
import Beneficios01.questions.validate_massive_benefits.ValidateRecordSerch;
import Beneficios01.tasks.login.LoginOk;
import Beneficios01.tasks.masive_benefits.ViewMassiveBenefitsByIdNoOk;
import Beneficios01.tasks.masive_benefits.ViewMassiveBenefitsByIdOk;
import Beneficios01.tasks.masive_benefits.ViewMassiveBenefitsByName;
import Beneficios01.tasks.serch_detail_benefit.ViewDetailBenefitsById;
import Beneficios01.tasks.serch_detail_benefit.ViewDetailBenefitsByName;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class SerchDetailBenefitsStep {

    @Given("^que el Gestor Senior de Beneficios inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginOk.login(user, key));
    }

    @When("^el consulta beneficios por nombre (.*)$")
    public void consultaCreditosPorNombre(String name) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewMassiveBenefitsByName.viewMassiveBenefitsByName(name)
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewDetailBenefitsByName.inPage()
                );
        }

    @Then("^se veran los beneficios en pantalla$")
    public void seVeraDetallesEnPantalla() {
                theActorInTheSpotlight().should(seeThat(ValidateDetailBenefit.inPage()));
    }

    @When("^el consulta beneficios de cedula (.*)$")
    public void elConsultaCreditoDeCedula(String id) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewMassiveBenefitsByIdOk.viewMassiveBenefitsByIdOk(id)
        );OnStage.theActorInTheSpotlight().attemptsTo(
                ViewDetailBenefitsById.inPage()
        );
    }

    @Then("^se veran los beneficios del colaborador en pantalla$")
    public void seVeraCreditoEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateDetailBenefit.inPage()));
    }

}
