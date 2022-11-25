package Beneficios01.questions.serch_detail_benefit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static Beneficios01.userinterfaces.SerchDetailBenefitUser.*;

public class ValidateDetailBenefit implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if(VALIDATION_VIEW_DETAIL_OK.resolveFor(actor).isVisible())
            return true;
        return false;

    }
    public static ValidateDetailBenefit inPage() {
        return new ValidateDetailBenefit();
    }
}

