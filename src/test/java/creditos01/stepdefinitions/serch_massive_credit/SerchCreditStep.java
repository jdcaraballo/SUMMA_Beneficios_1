package creditos01.stepdefinitions.serch_credit;


import creditos01.interactions.HomePage;
import creditos01.questions.credits_serch.ValidateCreditsSerchNoOk;
import creditos01.questions.credits_serch.ValidateCreditsSerchOk;
import creditos01.tasks.serch_credit_by_company.SerchCreditByCompanyNoExisting;
import creditos01.tasks.serch_credit_by_company.SerchCreditByCompanyOk;
import creditos01.tasks.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class SerchCreditStep {

    @Given("^que el Gestor Senior de Creditos inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.login(user, key));
    }

    @When("^el consulta creditos por compania (.*)$")
    public void consultaCreditosPorCompania(String company) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchCreditByCompanyOk.serchCreditsOk(company));
        }

    @Then("^se veran los creditos por Conpania en pantalla$")
    public void seVerancreditosCompaniaEnPantalla() {
                theActorInTheSpotlight().should(seeThat(ValidateCreditsSerchOk.inPage()));
    }

    @When("^el consulta credito por compania (.*) NO Existente$")
    public void consultaCreditosPorCompaniaNoExistente(String companyNoOk) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchCreditByCompanyNoExisting.serchCreditsNoOk(companyNoOk));
    }

    @Then("^se vera pantalla SIN carga de creditos$")
    public void noSeVerancreditoEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateCreditsSerchNoOk.inPage()));


    }



//        @When("^el consulta credito de cedula (.*)$")
//        public void consultaCreditosPorCompania(String identificacion) {
//
//
//        }

}
