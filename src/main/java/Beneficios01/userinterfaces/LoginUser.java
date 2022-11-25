package Beneficios01.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUser {
    public static final Target BOX_USER=Target.the("Caja USER").located(By.id("email"));
    public static final Target BOX_PASS=Target.the("Caja PASS").located(By.id("password"));
    public static final Target BTN_SIGN_IN=Target.the("BOTTON SIGN IN").located(By.id("next"));

    public static final Target BTN_VER_HISTORICOS=Target.the("BOTON PARA VER HISTORICOS para validar LOGIN").locatedBy("//*[contains(text(),'Ver histórico')]");
    public static final Target VALIDATION_LOGIN_NO_OK=Target.the("VALIDATION DE ERROR DE LOGIN").locatedBy("//*[contains(text(),'seem to find your account')]");

}
