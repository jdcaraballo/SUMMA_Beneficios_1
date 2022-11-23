package co.com.prueba_1_maquina.questions.login;

import co.com.prueba_1_maquina.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.prueba_1_maquina.userinterface.LoginValidateUser.*;

public class ValidarLogin implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.esVisible(VALIDAR_LOGIN_EXITOSO));
        return true;

    }
    public static ValidarLogin enPantallaDeInicio() {
        return new ValidarLogin();
    }
}

