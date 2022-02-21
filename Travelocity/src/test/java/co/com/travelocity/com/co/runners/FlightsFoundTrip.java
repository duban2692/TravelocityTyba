package co.com.travelocity.com.co.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/flights_found_trip.feature"},
        glue = "co.com.travelocity.com.co.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class FlightsFoundTrip {
}
