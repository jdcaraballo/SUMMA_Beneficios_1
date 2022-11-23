package creditos01.questions;

import creditos01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static creditos01.userinterfaces.SerchMassiveCreditsUser.BTN_VER_CREDITOS;

public class ValidateLogin implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(BTN_VER_CREDITOS));
        return true;

    }
    public static ValidateLogin inPage() {
        return new ValidateLogin();
    }
}

