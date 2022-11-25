package Beneficios01.questions.login;

import Beneficios01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static Beneficios01.userinterfaces.LoginUser.BTN_VER_HISTORICOS;


public class ValidateLoginOk implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(BTN_VER_HISTORICOS));
        return true;

    }
    public static ValidateLoginOk inPage() {
        return new ValidateLoginOk();
    }
}

