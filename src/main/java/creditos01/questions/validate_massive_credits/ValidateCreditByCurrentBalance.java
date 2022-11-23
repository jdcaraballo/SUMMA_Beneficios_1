package creditos01.questions.validate_massive_credits;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static creditos01.userinterfaces.SerchMassiveCreditsUser.VALIDATE_CURRENT_BALANCE;
import static creditos01.userinterfaces.SerchMassiveCreditsUser.VALIDATE_EXISTING_RECORD;

public class ValidateCreditByCurrentBalance implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if(VALIDATE_CURRENT_BALANCE.resolveFor(actor).isVisible())
        return true;
        return false;

    }
    public static ValidateCreditByCurrentBalance inPage() {
        return new ValidateCreditByCurrentBalance();
    }
}

