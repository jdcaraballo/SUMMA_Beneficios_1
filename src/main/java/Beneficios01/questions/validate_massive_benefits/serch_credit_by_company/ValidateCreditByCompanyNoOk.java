package Beneficios01.questions.validate_massive_benefits.serch_credit_by_company;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static Beneficios01.userinterfaces.SerchMassiveBenefitsUser.VALIDATE_EXISTING_RECORD;

public class ValidateCreditByCompanyNoOk implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
//        actor.attemptsTo(WaitElement.isVisible(VALIDATE_EXISTING_RECORD));
//        return false;

        if(VALIDATE_EXISTING_RECORD.resolveFor(actor).isVisible())
            return false;
        return true;
    }
    public static ValidateCreditByCompanyNoOk inPage() {
        return new ValidateCreditByCompanyNoOk();
    }
}

