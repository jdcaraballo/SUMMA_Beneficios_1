package creditos01.questions.credits_serch.serch_credit_by_company;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static creditos01.userinterfaces.ConsultarCreditosByCompanyUser.VALIDATE_EXISTING_RECORD;

public class ValidateCreditByCompanyOk implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if(VALIDATE_EXISTING_RECORD.resolveFor(actor).isVisible())
            return true;
            return false;
    }
    public static ValidateCreditByCompanyOk inPage() {
        return new ValidateCreditByCompanyOk();
    }
}

