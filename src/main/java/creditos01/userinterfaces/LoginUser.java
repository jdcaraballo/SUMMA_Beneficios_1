package creditos01.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUser {
    public static final Target BOX_USER=Target.the("Caja USER").located(By.id("email"));
    public static final Target BOX_PASS=Target.the("Caja PASS").located(By.id("password"));
    public static final Target BTN_SIGN_IN=Target.the("BOTTON SIGN IN").located(By.id("next"));

    public static final Target BTN_VER_CREDITOS=Target.the("BOTON PARA VER CREDITOS MASIVOS para validar LOGIN").locatedBy("//*[contains(text(),'Ver Créditos')]");

}
