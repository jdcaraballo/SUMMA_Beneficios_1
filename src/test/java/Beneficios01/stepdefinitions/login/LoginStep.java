package Beneficios01.stepdefinitions.login;


import Beneficios01.interactions.HomePage;
import Beneficios01.questions.login.ValidateLoginNoOk;
import Beneficios01.questions.login.ValidateLoginOk;
import Beneficios01.tasks.login.LoginNoOk;
import Beneficios01.tasks.login.LoginOk;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStep {

    @Given("^que el abre pagina modulo Beneficios$")
    public void queElAbrePaginaModuloBeneficios() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }

    @When("^el inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginOk.login(user, key));
    }
    @Then("^se vera pantalla de inicio del gestor senior$")
    public void pantallaDeInicioDelGestorSenior() {
        theActorInTheSpotlight().should(seeThat(ValidateLoginOk.inPage()));
    }

    @When("^el intenta iniciar sesion con usuario inexistente (.*) con clave (.*)$")
    public void gestorNoIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginNoOk.login(user, key));
    }
    @Then("^se vera error de ingreso en pantalla de inicio del gestor senior$")
    public void pantallaErrorDeInicioDelGestorSenior() {
        theActorInTheSpotlight().should(seeThat(ValidateLoginNoOk.inPage()));
    }




}
