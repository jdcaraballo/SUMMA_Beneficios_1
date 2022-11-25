package Beneficios01.tasks.login;

import Beneficios01.interactions.Wait;
import Beneficios01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Beneficios01.userinterfaces.LoginUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginNoOk implements Task {


    private final String user;
    private final String key;

    public LoginNoOk(String user, String key) {
        this.user = user;
        this.key = key;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isVisible(BOX_USER),
                Click.on(BOX_USER),
                Enter.theValue(user).into(BOX_USER),
                Click.on(BOX_PASS),
                Enter.theValue(key).into(BOX_PASS),
                Click.on(BTN_SIGN_IN),
                Wait.aTime(5000));
    }
    public static LoginNoOk login(String user, String key) {
        return instrumented(LoginNoOk.class, user, key);
  }


    }
