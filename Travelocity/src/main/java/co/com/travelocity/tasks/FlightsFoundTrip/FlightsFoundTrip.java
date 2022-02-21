package co.com.travelocity.tasks.FlightsFoundTrip;

import co.com.travelocity.util.Utilities;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import static co.com.travelocity.userinterfaces.flightsfoundtrip.FlightsFoundTrip.*;

public class FlightsFoundTrip implements Task {

    WebElementFacade elementPositionDeparting, elementPositionRetorning;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ITEM_FLIGHTS),
                JavaScriptClick.on(ITEM_LEAVING_FROM_BUTTON),
                JavaScriptClick.on(ITEM_LEAVING_FROM_INPUT),
                Enter.theValue("Medellin").into(ITEM_LEAVING_FROM_INPUT).thenHit(Keys.ENTER),
                JavaScriptClick.on(ITEM_GOING_TO_BUTTON),
                JavaScriptClick.on(ITEM_GOING_TO_INPUT),
                Enter.theValue("Bogota").into(ITEM_GOING_TO_INPUT).thenHit(Keys.ENTER),
                JavaScriptClick.on(CALENDAR_DEPARTING));

        elementPositionDeparting = Utilities.randomElement(actor, CALENDAR_DEPARTING_DAYS);
        actor.attemptsTo(JavaScriptClick.on(elementPositionDeparting));

        elementPositionRetorning = Utilities.randomElement(actor, CALENDAR_RETURNING_DAYS);

        actor.attemptsTo(
                JavaScriptClick.on(elementPositionRetorning),
                JavaScriptClick.on(DONE_BUTTON),
                JavaScriptClick.on(BUTTON_SEARCH));

    }

    public static FlightsFoundTrip fligths() {
        return Tasks.instrumented(FlightsFoundTrip.class);
    }
}
