package Beneficios01.tasks.serch_detail_benefit;

import Beneficios01.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static Beneficios01.userinterfaces.SerchDetailBenefitUser.CANCEL_VIEW_DETAIL_BENEFIT;
import static Beneficios01.userinterfaces.SerchDetailBenefitUser.ICON_LUPA_WATCH_DETAIL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewDetailBenefitsById implements Task {

//    private final String id;
//
//    public ViewDetailBenefitsById(String id) {
//        this.id = id;
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


                  Click.on(ICON_LUPA_WATCH_DETAIL),
                Wait.aTime(10000),
                Click.on(CANCEL_VIEW_DETAIL_BENEFIT)
        );
    }
//    public static ViewDetailBenefitsById viewDetailBenefitsByName(String id) {
//        return instrumented(ViewDetailBenefitsById.class, id);

        public static ViewDetailBenefitsById inPage() {
            return instrumented(ViewDetailBenefitsById.class);
  }


    }
