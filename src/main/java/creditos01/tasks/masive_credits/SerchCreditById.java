package creditos01.tasks.serch_credit_by_id;

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

public class SerchCreditById implements Task {

    private final String id;

    public SerchCreditById(String id) {
        this.id = id;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_IDENTIFICACION),
                Click.on(BOX_CONSULTAR_CRED_IDENTIFICACION),
                Enter.theValue(id).into(BOX_CONSULTAR_CRED_IDENTIFICACION),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_IDENTIFICACION),
                Wait.aTime(5000));
    }
    public static SerchCreditById serchCreditById(String id) {
        return instrumented(SerchCreditById.class, id);
  }


    }
