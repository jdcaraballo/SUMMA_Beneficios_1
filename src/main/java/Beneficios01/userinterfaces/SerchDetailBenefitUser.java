package Beneficios01.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SerchDetailBenefitUser {
    public static final Target ICON_LUPA_WATCH_DETAIL=Target.the("ICONO VER DETALLES DEL BENEFICIO").locatedBy("(//*[@class='p-element pi pi-eye'])[1]");
    public static final Target CANCEL_VIEW_DETAIL_BENEFIT=Target.the("Salir de popup DETALLES DEL REGISTRO BENEFICIOS").locatedBy("//*[contains(text(),'Cancelar')]");
    public static final Target VALIDATION_VIEW_DETAIL_OK=Target.the("Validación de vista ok de los detalles del Beneficio").locatedBy("//*[contains(text(),'Regresar')]");



}
