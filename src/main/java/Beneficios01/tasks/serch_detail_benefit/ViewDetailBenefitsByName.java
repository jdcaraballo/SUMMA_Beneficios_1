package Beneficios01.tasks.serch_detail_benefit;

import Beneficios01.interactions.Wait;
import Beneficios01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static Beneficios01.userinterfaces.SerchDetailBenefitUser.CANCEL_VIEW_DETAIL_BENEFIT;
import static Beneficios01.userinterfaces.SerchDetailBenefitUser.ICON_LUPA_WATCH_DETAIL;
import static Beneficios01.userinterfaces.SerchMassiveBenefitsUser.BOX_SERCH_NAME_ID;
import static Beneficios01.userinterfaces.SerchMassiveBenefitsUser.BTN_VER_HISTORICOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class ViewDetailBenefitsByName implements Task {



    //    private final String name;
//
//    public ViewDetailBenefitsByName(String name) {
//        this.name = name;
//}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                Click.on(BTN_VER_HISTORICOS),
//                WaitElement.isClickable(BOX_SERCH_NAME_ID),
//                Click.on(BOX_SERCH_NAME_ID),
//                Enter.theValue(name).into(BOX_SERCH_NAME_ID),
//                Hit.the(ENTER).into(BOX_SERCH_NAME_ID),
//                Wait.aTime(5000)

                WaitElement.isClickable(ICON_LUPA_WATCH_DETAIL),
                Click.on(ICON_LUPA_WATCH_DETAIL),
                Wait.aTime(10000),
                Click.on(CANCEL_VIEW_DETAIL_BENEFIT)
        );
    }
//    public static ViewDetailBenefitsByName viewDetailBenefitsByName(String name) {
//        return instrumented(ViewDetailBenefitsByName.class, name);

//  }
public static ViewDetailBenefitsByName inPage() {
    return instrumented(ViewDetailBenefitsByName.class);
}

    }
