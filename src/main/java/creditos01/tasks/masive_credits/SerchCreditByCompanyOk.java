package creditos01.tasks.masive_credits;

import creditos01.interactions.Wait;
import creditos01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static creditos01.userinterfaces.SerchMassiveCreditsUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class SerchCreditByCompanyOk implements Task {

    private final String company;

    public SerchCreditByCompanyOk(String company) {
        this.company = company;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_COMPANIA),
                Click.on(BOX_CONSULTAR_CRED_COMPANIA),
                Enter.theValue(company).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_COMPANIA),
//                Scroll.to(SCROLL_END_PAGE),
//                Wait.aTime(1000),
//                Scroll.to(SCROLL_START_PAGE),

//                Click.on(BOX_CONSULTAR_CRED_IDENTIFICACION),
//                Enter.theValue("SUMMA").into(BOX_CONSULTAR_CRED_IDENTIFICACION),

//                Click.on(BOX_PASS),
//                Enter.theValue(key).into(BOX_PASS),
//                Click.on(BTN_SIGN_IN),
                Wait.aTime(5000));
    }
    public static SerchCreditByCompanyOk serchCreditsOk(String company) {
        return instrumented(SerchCreditByCompanyOk.class, company);
  }


    }
