package co.com.travelocity.userinterfaces.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginTravelocity {

    public static final Target MENU_BTN_SIGN_IN = Target.the("Menú Iniciar Sesión").located(By.xpath("//button[contains(text(),'Sign in')]"));
    public static final Target BTN_SIGN_IN = Target.the("Iniciar Sesión").located(By.xpath("//a[contains(text(),'Sign in')]"));
    public static final Target TXT_EMAIL = Target.the("TXT_PASSWORD").located(By.id("loginFormEmailInput"));
    public static final Target TXT_PASSWORD = Target.the("TXT_PASSWORD").located(By.id("loginFormPasswordInput"));
    public static final Target BTN_SUBMIT = Target.the("BTN_SUBMIT").located(By.id("loginFormSubmitButton"));

}
