package Beneficios01.questions.validate_massive_benefits;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static Beneficios01.userinterfaces.SerchMassiveBenefitsUser.VALIDATE_EXISTING_RECORD;

public class ValidateRecordNoSerch implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if(VALIDATE_EXISTING_RECORD.resolveFor(actor).isVisible())
            return false;
            return true;
    }
    public static ValidateRecordNoSerch inPage() {
        return new ValidateRecordNoSerch();
    }
}

