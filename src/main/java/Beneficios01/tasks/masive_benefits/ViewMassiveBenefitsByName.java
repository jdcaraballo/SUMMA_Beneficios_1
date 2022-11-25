package Beneficios01.tasks.masive_benefits;

import Beneficios01.interactions.Wait;
import Beneficios01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static Beneficios01.userinterfaces.SerchMassiveBenefitsUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class ViewMassiveBenefitsByName implements Task {

    private final String name;

    public ViewMassiveBenefitsByName(String name) {
        this.name = name;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_HISTORICOS),
                WaitElement.isClickable(BOX_SERCH_NAME_ID),
                Click.on(BOX_SERCH_NAME_ID),
                Enter.theValue(name).into(BOX_SERCH_NAME_ID),
                Hit.the(ENTER).into(BOX_SERCH_NAME_ID),
                Wait.aTime(5000));
    }
    public static ViewMassiveBenefitsByName viewMassiveBenefitsByName(String name) {
        return instrumented(ViewMassiveBenefitsByName.class, name);
  }


    }
