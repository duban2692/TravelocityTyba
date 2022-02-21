package co.com.travelocity.com.co.stepdefinitions;

import co.com.travelocity.tasks.FlightsFoundTrip.FlightsFoundTrip;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class FlightsFoundTripStepDefinitions {

    @When("you enter city of origin and destination")
    public void youEnterCityOfOriginAndDestination() {
        theActorInTheSpotlight().attemptsTo(FlightsFoundTrip.fligths());

    }

    @When("the cheapest flights are listed")
    public void theCheapestFlightsAreListed() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("flight is selected and booked")
    public void flightIsSelectedAndBooked() {
        // Write code here that turns the phrase above into concrete actions

    }

}
