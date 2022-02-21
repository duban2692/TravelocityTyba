package co.com.travelocity.tasks.login;

import co.com.travelocity.userinterfaces.login.LoginTravelocity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.travelocity.userinterfaces.login.LoginTravelocity.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Login implements Task {

    private String txtEmail;
    private String txtPassword;

    public Login(String txtEmail, String txtPassword) {
        this.txtEmail = txtEmail;
        this.txtPassword = txtPassword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LoginTravelocity.MENU_BTN_SIGN_IN),
                Click.on(LoginTravelocity.BTN_SIGN_IN),
                Enter.theValue(txtEmail).into(TXT_EMAIL),
                Enter.theValue(txtPassword).into(TXT_PASSWORD),
                Click.on(BTN_SUBMIT));
    }

    public static Login into(String txtEmail, String txtPassword) {
        return instrumented(Login.class, txtEmail, txtPassword);
    }
}
