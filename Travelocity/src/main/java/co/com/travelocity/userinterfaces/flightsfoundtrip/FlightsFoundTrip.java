package co.com.travelocity.userinterfaces.flightsfoundtrip;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FlightsFoundTrip {

    public static final Target ITEM_FLIGHTS = Target.the("ITEM_FLIGHTS").located(By.xpath("//div[@class='uitk-tabs-container']//ul//li//a//span[contains(text(),'Flights')]"));
    public static final Target ROUND_TRIP = Target.the("ROUND_TRIP").located(By.xpath("//span[contains(text(),'Roundtrip')]"));
    public static final Target ITEM_LEAVING_FROM_BUTTON = Target.the("ITEM_LEAVING_FROM_BUTTON").locatedBy("//button[@aria-label='Leaving from']");
    public static final Target ITEM_LEAVING_FROM_INPUT = Target.the("ITEM_LEAVING_FROM_INPUT").locatedBy("//input[@data-stid='location-field-leg1-origin-menu-input']");
    public static final Target ITEM_GOING_TO_BUTTON = Target.the("ITEM_GOING_TO_BUTTON").located(By.xpath("//button[@aria-label='Going to']"));
    public static final Target ITEM_GOING_TO_INPUT = Target.the("ITEM_GOING_TO_INPUT").located(By.id("location-field-leg1-destination"));
    public static final Target BUTTON_SEARCH = Target.the("BUTTON_SEARCH").located(By.xpath("//button[@data-testid='submit-button']"));
    public static final Target CALENDAR_DEPARTING = Target.the("CALENDAR_DEPARTING").located(By.id("d1-btn"));
    public static final Target CALENDAR_RETURNING = Target.the("CALENDAR_RETURNING").located(By.id("d2-btn"));
    public static final Target CALENDAR_DEPARTING_DAYS = Target.the("CALENDAR_DEPARTING_DAYS").locatedBy("(//div[@data-stid='date-picker-month'])[1]//button[@data-day]");
    public static final Target CALENDAR_RETURNING_DAYS = Target.the("CALENDAR_RETURNING_DAYS").locatedBy("(//div[@data-stid='date-picker-month'])[2]//button[@data-day]");
    public static final Target DONE_BUTTON = Target.the("DONE_BUTTON").locatedBy("//button[@data-stid='apply-date-picker']");

}
