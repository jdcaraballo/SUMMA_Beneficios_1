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

public class SerchCreditByLastName implements Task {

    private final String name;

    public SerchCreditByLastName(String name) {
        this.name = name;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_LASTNAME),
                Click.on(BOX_CONSULTAR_CRED_LASTNAME),
                Enter.theValue(name).into(BOX_CONSULTAR_CRED_LASTNAME),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_LASTNAME),
                Wait.aTime(5000));
    }
    public static SerchCreditByLastName serchCreditByName(String name) {
        return instrumented(SerchCreditByLastName.class, name);
  }


    }
