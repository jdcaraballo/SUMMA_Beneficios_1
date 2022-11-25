package Beneficios01.questions.login;

import Beneficios01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static Beneficios01.userinterfaces.LoginUser.VALIDATION_LOGIN_NO_OK;


public class ValidateLoginNoOk implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(VALIDATION_LOGIN_NO_OK));
        return true;

    }
    public static ValidateLoginNoOk inPage() {
        return new ValidateLoginNoOk();
    }
}

