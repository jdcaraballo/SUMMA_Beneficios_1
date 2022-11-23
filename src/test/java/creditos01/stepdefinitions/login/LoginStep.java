package creditos01.stepdefinitions.login;


import creditos01.interactions.HomePage;
import creditos01.questions.ValidateLogin;
import creditos01.tasks.Login;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStep {

    @Given("^que el abre pagina modulo creditos$")
    public void queElAbrePaginaModuloCreditos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }

    @When("^el inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.login(user, key));
    }
    @Then("^se vera pantalla de inicio del gestor senior$")
    public void pantallaDeInicioDelGestorSenior() {
        theActorInTheSpotlight().should(seeThat(ValidateLogin.inPage()));
    }




}
