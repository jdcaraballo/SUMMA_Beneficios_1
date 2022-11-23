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

public class SerchCreditByCurrentBalance implements Task {

    private final String currentBalance;

    public SerchCreditByCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS),
                WaitElement.isClickable(BOX_CONSULTAR_CURRENT_BALANCE),
                Click.on(BOX_CONSULTAR_CURRENT_BALANCE),
                Enter.theValue(currentBalance).into(BOX_CONSULTAR_CURRENT_BALANCE),
                Hit.the(ENTER).into(VALIDATE_FILLED_BOX),
//                WaitElement.isVisible(VALIDATE_CURRENT_BALANCE),
                Wait.aTime(5000));
    }
    public static SerchCreditByCurrentBalance serchCreditByEndingBalance(String currentBalance) {
        return instrumented(SerchCreditByCurrentBalance.class, currentBalance);
  }


    }
