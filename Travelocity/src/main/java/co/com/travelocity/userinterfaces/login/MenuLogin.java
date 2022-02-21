package co.com.travelocity.userinterfaces.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MenuLogin {

    public static final Target BTN_SEARCH = Target.the("SEARCH").located(By.xpath("//button[contains(text(),'Search')]"));
}
