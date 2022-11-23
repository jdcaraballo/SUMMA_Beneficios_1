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

public class SerchCreditByEndingBalance implements Task {

    private final String endingBalance;

    public SerchCreditByEndingBalance(String endingBalance) {
        this.endingBalance = endingBalance;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS),
                WaitElement.isClickable(BOX_CONSULTAR_ENDING_BALANCE),
                Click.on(BOX_CONSULTAR_ENDING_BALANCE),
                Enter.theValue(endingBalance).into(BOX_CONSULTAR_ENDING_BALANCE),
                Hit.the(ENTER).into(BOX_CONSULTAR_ENDING_BALANCE),
                Wait.aTime(5000));
    }
    public static SerchCreditByEndingBalance serchCreditByEndingBalance(String endingBalance) {
        return instrumented(SerchCreditByEndingBalance.class, endingBalance);
  }


    }
