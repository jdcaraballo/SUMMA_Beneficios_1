package Beneficios01.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SerchMassiveBenefitsUser {

    public static final Target BTN_VER_HISTORICOS=Target.the("BOX PARA VER POR COMPANIA").locatedBy("//*[contains(text(),'Ver histórico')]");
    public static final Target BOX_SERCH_NAME_ID=Target.the("BOX PARA CONSULTAR POR CEDULA O NOMBRE").locatedBy("//*[@placeholder='filtrar por cédula o nombre']");









//
//    public static final Target BOX_CONSULTAR_CRED_IDENTIFICACION=Target.the("BOX PARA VER POR IDENTIFICACION").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[2]");
//    public static final Target BOX_CONSULTAR_CRED_NAME=Target.the("BOX PARA VER POR NOMBRE").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted' and @type='text'])[3]");
//    public static final Target BOX_CONSULTAR_CRED_LASTNAME=Target.the("BOX PARA VER POR APELLIDO").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[4]");
//    public static final Target BOX_CONSULTAR_CRED_COUNTER=Target.the("BOX PARA VER POR CONSECUTIVO").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[5]");
//    public static final Target BOX_CONSULTAR_CURRENT_BALANCE=Target.the("BOX PARA VER POR SALDO FINAL").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted'])[6]");
//    public static final Target VALIDATE_CURRENT_BALANCE=Target.the("BOX PARA VALIDAR USUARIO POR SALDO ACTUAL").locatedBy("(//*[@class='p-element p-button-rounded p-button-success p-button-text p-button p-component p-button-icon-only'])[1]");
//    public static final Target VALIDATE_FILLED_BOX=Target.the("VALIDAR LLENADO DE CAJA DE TEXTO ").locatedBy("(//*[@class='p-inputtext p-component p-element ng-star-inserted p-filled'])");
//
//
//    public static final Target SCROLL_END_PAGE=Target.the("Scroll hasta el final de la pagina").locatedBy("//*[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']");
//    public static final Target SCROLL_START_PAGE=Target.the("Scroll para inicio de pagina").locatedBy("//*[@class='p-element p-sortable-column' and contains(.,'Compañia')]");
//    public static final Target PANEL_MASIVE_CREDITS=Target.the("Panel de créditos masivos").locatedBy("//*[@id='pr_id_1']");
    public static final Target VALIDATE_EXISTING_RECORD=Target.the("Validación de nombre existente").locatedBy("//*[@class='p-element p-datatable-tbody']");
}
