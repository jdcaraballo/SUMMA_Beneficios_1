package creditos01.tasks;

import creditos01.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static creditos01.userinterfaces.LoginUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {


    private final String user;
    private final String key;

    public Login(String user, String key) {
        this.user = user;
        this.key = key;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOX_USER),
                Enter.theValue(user).into(BOX_USER),
                Click.on(BOX_PASS),
                Enter.theValue(key).into(BOX_PASS),
                Click.on(BTN_SIGN_IN),
                Wait.aTime(5000));
    }
    public static Login login(String user, String key) {
        return instrumented(Login.class, user, key);
  }


    }
